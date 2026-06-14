package androidx.media3.exoplayer.trackselection;

import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.Format;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.TrackSelectionOverride;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.RendererConfiguration;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.MappingTrackSelector;
import androidx.media3.exoplayer.v2;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@UnstableApi
public class DefaultTrackSelector extends MappingTrackSelector implements RendererCapabilities.Listener {
    private static final String AUDIO_CHANNEL_COUNT_CONSTRAINTS_WARN_MESSAGE = "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.";
    private static final Ordering<Integer> FORMAT_VALUE_ORDERING = Ordering.from(new Comparator() { // from class: androidx.media3.exoplayer.trackselection.b
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return DefaultTrackSelector.e((Integer) obj, (Integer) obj2);
        }
    });
    private static final float FRACTION_TO_CONSIDER_FULLSCREEN = 0.98f;
    protected static final int SELECTION_ELIGIBILITY_ADAPTIVE = 2;
    protected static final int SELECTION_ELIGIBILITY_FIXED = 1;
    protected static final int SELECTION_ELIGIBILITY_NO = 0;
    private static final String TAG = "DefaultTrackSelector";

    @GuardedBy("lock")
    private AudioAttributes audioAttributes;

    @Nullable
    public final Context context;
    private final boolean deviceIsTV;
    private final Object lock;

    @GuardedBy("lock")
    private Parameters parameters;

    @Nullable
    @GuardedBy("lock")
    private SpatializerWrapperV32 spatializer;
    private final ExoTrackSelection.Factory trackSelectionFactory;

    /* JADX INFO: Access modifiers changed from: private */
    static final class AudioTrackInfo extends TrackInfo<AudioTrackInfo> implements Comparable<AudioTrackInfo> {
        private final boolean allowMixedMimeTypes;
        private final int bitrate;
        private final int channelCount;
        private final boolean hasMainOrNoRoleFlag;
        private final boolean isDefaultSelectionFlag;
        private final boolean isWithinConstraints;
        private final boolean isWithinRendererCapabilities;

        @Nullable
        private final String language;
        private final int localeLanguageMatchIndex;
        private final int localeLanguageScore;
        private final Parameters parameters;
        private final int preferredLanguageIndex;
        private final int preferredLanguageScore;
        private final int preferredMimeTypeMatchIndex;
        private final int preferredRoleFlagsScore;
        private final int sampleRate;
        private final int selectionEligibility;
        private final boolean usesHardwareAcceleration;
        private final boolean usesPrimaryDecoder;

        public AudioTrackInfo(int i10, TrackGroup trackGroup, int i11, Parameters parameters, int i12, boolean z10, Predicate<Format> predicate, int i13) {
            int i14;
            int formatLanguageScore;
            int formatLanguageScore2;
            super(i10, trackGroup, i11);
            this.parameters = parameters;
            int i15 = parameters.allowAudioNonSeamlessAdaptiveness ? 24 : 16;
            this.allowMixedMimeTypes = parameters.allowAudioMixedMimeTypeAdaptiveness && (i13 & i15) != 0;
            this.language = DefaultTrackSelector.normalizeUndeterminedLanguageToNull(this.format.language);
            this.isWithinRendererCapabilities = v2.n(i12, false);
            int i16 = 0;
            while (true) {
                i14 = Integer.MAX_VALUE;
                if (i16 >= parameters.preferredAudioLanguages.size()) {
                    formatLanguageScore = 0;
                    i16 = Integer.MAX_VALUE;
                    break;
                } else {
                    formatLanguageScore = DefaultTrackSelector.getFormatLanguageScore(this.format, parameters.preferredAudioLanguages.get(i16), false);
                    if (formatLanguageScore > 0) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            this.preferredLanguageIndex = i16;
            this.preferredLanguageScore = formatLanguageScore;
            this.preferredRoleFlagsScore = DefaultTrackSelector.getRoleFlagMatchScore(this.format.roleFlags, parameters.preferredAudioRoleFlags);
            Format format = this.format;
            int i17 = format.roleFlags;
            this.hasMainOrNoRoleFlag = i17 == 0 || (i17 & 1) != 0;
            this.isDefaultSelectionFlag = (format.selectionFlags & 1) != 0;
            int i18 = format.channelCount;
            this.channelCount = i18;
            this.sampleRate = format.sampleRate;
            int i19 = format.bitrate;
            this.bitrate = i19;
            this.isWithinConstraints = (i19 == -1 || i19 <= parameters.maxAudioBitrate) && (i18 == -1 || i18 <= parameters.maxAudioChannelCount) && predicate.apply(format);
            String[] systemLanguageCodes = Util.getSystemLanguageCodes();
            int i20 = 0;
            while (true) {
                if (i20 >= systemLanguageCodes.length) {
                    formatLanguageScore2 = 0;
                    i20 = Integer.MAX_VALUE;
                    break;
                } else {
                    formatLanguageScore2 = DefaultTrackSelector.getFormatLanguageScore(this.format, systemLanguageCodes[i20], false);
                    if (formatLanguageScore2 > 0) {
                        break;
                    } else {
                        i20++;
                    }
                }
            }
            this.localeLanguageMatchIndex = i20;
            this.localeLanguageScore = formatLanguageScore2;
            int i21 = 0;
            while (true) {
                if (i21 < parameters.preferredAudioMimeTypes.size()) {
                    String str = this.format.sampleMimeType;
                    if (str != null && str.equals(parameters.preferredAudioMimeTypes.get(i21))) {
                        i14 = i21;
                        break;
                    }
                    i21++;
                } else {
                    break;
                }
            }
            this.preferredMimeTypeMatchIndex = i14;
            this.usesPrimaryDecoder = v2.j(i12) == 128;
            this.usesHardwareAcceleration = v2.l(i12) == 64;
            this.selectionEligibility = evaluateSelectionEligibility(i12, z10, i15);
        }

        public static int compareSelections(List<AudioTrackInfo> list, List<AudioTrackInfo> list2) {
            return ((AudioTrackInfo) Collections.max(list)).compareTo((AudioTrackInfo) Collections.max(list2));
        }

        public static ImmutableList<AudioTrackInfo> createForTrackGroup(int i10, TrackGroup trackGroup, Parameters parameters, int[] iArr, boolean z10, Predicate<Format> predicate, int i11) {
            ImmutableList.Builder builder = ImmutableList.builder();
            for (int i12 = 0; i12 < trackGroup.length; i12++) {
                builder.add(new AudioTrackInfo(i10, trackGroup, i12, parameters, iArr[i12], z10, predicate, i11));
            }
            return builder.build();
        }

        private int evaluateSelectionEligibility(int i10, boolean z10, int i11) {
            if (!v2.n(i10, this.parameters.exceedRendererCapabilitiesIfNecessary)) {
                return 0;
            }
            if (!this.isWithinConstraints && !this.parameters.exceedAudioConstraintsIfNecessary) {
                return 0;
            }
            Parameters parameters = this.parameters;
            if (parameters.audioOffloadPreferences.audioOffloadMode == 2 && !DefaultTrackSelector.rendererSupportsOffload(parameters, i10, this.format)) {
                return 0;
            }
            if (!v2.n(i10, false) || !this.isWithinConstraints || this.format.bitrate == -1) {
                return 1;
            }
            Parameters parameters2 = this.parameters;
            if (parameters2.forceHighestSupportedBitrate || parameters2.forceLowestBitrate) {
                return 1;
            }
            return ((!parameters2.allowMultipleAdaptiveSelections && z10) || parameters2.audioOffloadPreferences.audioOffloadMode == 2 || (i10 & i11) == 0) ? 1 : 2;
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public int getSelectionEligibility() {
            return this.selectionEligibility;
        }

        @Override // java.lang.Comparable
        public int compareTo(AudioTrackInfo audioTrackInfo) {
            Ordering orderingReverse = (this.isWithinConstraints && this.isWithinRendererCapabilities) ? DefaultTrackSelector.FORMAT_VALUE_ORDERING : DefaultTrackSelector.FORMAT_VALUE_ORDERING.reverse();
            ComparisonChain comparisonChainCompare = ComparisonChain.start().compareFalseFirst(this.isWithinRendererCapabilities, audioTrackInfo.isWithinRendererCapabilities).compare(Integer.valueOf(this.preferredLanguageIndex), Integer.valueOf(audioTrackInfo.preferredLanguageIndex), Ordering.natural().reverse()).compare(this.preferredLanguageScore, audioTrackInfo.preferredLanguageScore).compare(this.preferredRoleFlagsScore, audioTrackInfo.preferredRoleFlagsScore).compareFalseFirst(this.isDefaultSelectionFlag, audioTrackInfo.isDefaultSelectionFlag).compareFalseFirst(this.hasMainOrNoRoleFlag, audioTrackInfo.hasMainOrNoRoleFlag).compare(Integer.valueOf(this.localeLanguageMatchIndex), Integer.valueOf(audioTrackInfo.localeLanguageMatchIndex), Ordering.natural().reverse()).compare(this.localeLanguageScore, audioTrackInfo.localeLanguageScore).compareFalseFirst(this.isWithinConstraints, audioTrackInfo.isWithinConstraints).compare(Integer.valueOf(this.preferredMimeTypeMatchIndex), Integer.valueOf(audioTrackInfo.preferredMimeTypeMatchIndex), Ordering.natural().reverse());
            if (this.parameters.forceLowestBitrate) {
                comparisonChainCompare = comparisonChainCompare.compare(Integer.valueOf(this.bitrate), Integer.valueOf(audioTrackInfo.bitrate), DefaultTrackSelector.FORMAT_VALUE_ORDERING.reverse());
            }
            ComparisonChain comparisonChainCompare2 = comparisonChainCompare.compareFalseFirst(this.usesPrimaryDecoder, audioTrackInfo.usesPrimaryDecoder).compareFalseFirst(this.usesHardwareAcceleration, audioTrackInfo.usesHardwareAcceleration).compare(Integer.valueOf(this.channelCount), Integer.valueOf(audioTrackInfo.channelCount), orderingReverse).compare(Integer.valueOf(this.sampleRate), Integer.valueOf(audioTrackInfo.sampleRate), orderingReverse);
            if (Util.areEqual(this.language, audioTrackInfo.language)) {
                comparisonChainCompare2 = comparisonChainCompare2.compare(Integer.valueOf(this.bitrate), Integer.valueOf(audioTrackInfo.bitrate), orderingReverse);
            }
            return comparisonChainCompare2.result();
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public boolean isCompatibleForAdaptationWith(AudioTrackInfo audioTrackInfo) {
            int i10;
            String str;
            int i11;
            if (!this.parameters.allowAudioMixedChannelCountAdaptiveness && ((i11 = this.format.channelCount) == -1 || i11 != audioTrackInfo.format.channelCount)) {
                return false;
            }
            if (!this.allowMixedMimeTypes && ((str = this.format.sampleMimeType) == null || !TextUtils.equals(str, audioTrackInfo.format.sampleMimeType))) {
                return false;
            }
            Parameters parameters = this.parameters;
            if (!parameters.allowAudioMixedSampleRateAdaptiveness && ((i10 = this.format.sampleRate) == -1 || i10 != audioTrackInfo.format.sampleRate)) {
                return false;
            }
            if (parameters.allowAudioMixedDecoderSupportAdaptiveness) {
                return true;
            }
            return this.usesPrimaryDecoder == audioTrackInfo.usesPrimaryDecoder && this.usesHardwareAcceleration == audioTrackInfo.usesHardwareAcceleration;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class ImageTrackInfo extends TrackInfo<ImageTrackInfo> implements Comparable<ImageTrackInfo> {
        private final int pixelCount;
        private final int selectionEligibility;

        public ImageTrackInfo(int i10, TrackGroup trackGroup, int i11, Parameters parameters, int i12) {
            super(i10, trackGroup, i11);
            this.selectionEligibility = v2.n(i12, parameters.exceedRendererCapabilitiesIfNecessary) ? 1 : 0;
            this.pixelCount = this.format.getPixelCount();
        }

        public static int compareSelections(List<ImageTrackInfo> list, List<ImageTrackInfo> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        public static ImmutableList<ImageTrackInfo> createForTrackGroup(int i10, TrackGroup trackGroup, Parameters parameters, int[] iArr) {
            ImmutableList.Builder builder = ImmutableList.builder();
            for (int i11 = 0; i11 < trackGroup.length; i11++) {
                builder.add(new ImageTrackInfo(i10, trackGroup, i11, parameters, iArr[i11]));
            }
            return builder.build();
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public int getSelectionEligibility() {
            return this.selectionEligibility;
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public boolean isCompatibleForAdaptationWith(ImageTrackInfo imageTrackInfo) {
            return false;
        }

        @Override // java.lang.Comparable
        public int compareTo(ImageTrackInfo imageTrackInfo) {
            return Integer.compare(this.pixelCount, imageTrackInfo.pixelCount);
        }
    }

    private static final class OtherTrackScore implements Comparable<OtherTrackScore> {
        private final boolean isDefault;
        private final boolean isWithinRendererCapabilities;

        public OtherTrackScore(Format format, int i10) {
            this.isDefault = (format.selectionFlags & 1) != 0;
            this.isWithinRendererCapabilities = v2.n(i10, false);
        }

        @Override // java.lang.Comparable
        public int compareTo(OtherTrackScore otherTrackScore) {
            return ComparisonChain.start().compareFalseFirst(this.isWithinRendererCapabilities, otherTrackScore.isWithinRendererCapabilities).compareFalseFirst(this.isDefault, otherTrackScore.isDefault).result();
        }
    }

    public static final class Parameters extends TrackSelectionParameters {

        @Deprecated
        public static final Parameters DEFAULT;
        public static final Parameters DEFAULT_WITHOUT_CONTEXT;
        private static final String FIELD_ALLOW_AUDIO_MIXED_CHANNEL_COUNT_ADAPTIVENESS;
        private static final String FIELD_ALLOW_AUDIO_MIXED_DECODER_SUPPORT_ADAPTIVENESS;
        private static final String FIELD_ALLOW_AUDIO_MIXED_MIME_TYPE_ADAPTIVENESS;
        private static final String FIELD_ALLOW_AUDIO_MIXED_SAMPLE_RATE_ADAPTIVENESS;
        private static final String FIELD_ALLOW_AUDIO_NON_SEAMLESS_ADAPTIVENESS;
        private static final String FIELD_ALLOW_INVALIDATE_SELECTIONS_ON_RENDERER_CAPABILITIES_CHANGE;
        private static final String FIELD_ALLOW_MULTIPLE_ADAPTIVE_SELECTIONS;
        private static final String FIELD_ALLOW_VIDEO_MIXED_DECODER_SUPPORT_ADAPTIVENESS;
        private static final String FIELD_ALLOW_VIDEO_MIXED_MIME_TYPE_ADAPTIVENESS;
        private static final String FIELD_ALLOW_VIDEO_NON_SEAMLESS_ADAPTIVENESS;
        private static final String FIELD_CONSTRAIN_AUDIO_CHANNEL_COUNT_TO_DEVICE_CAPABILITIES;
        private static final String FIELD_EXCEED_AUDIO_CONSTRAINTS_IF_NECESSARY;
        private static final String FIELD_EXCEED_RENDERER_CAPABILITIES_IF_NECESSARY;
        private static final String FIELD_EXCEED_VIDEO_CONSTRAINTS_IF_NECESSARY;
        private static final String FIELD_RENDERER_DISABLED_INDICES;
        private static final String FIELD_SELECTION_OVERRIDES;
        private static final String FIELD_SELECTION_OVERRIDES_RENDERER_INDICES;
        private static final String FIELD_SELECTION_OVERRIDES_TRACK_GROUP_ARRAYS;
        private static final String FIELD_TUNNELING_ENABLED;
        public final boolean allowAudioMixedChannelCountAdaptiveness;
        public final boolean allowAudioMixedDecoderSupportAdaptiveness;
        public final boolean allowAudioMixedMimeTypeAdaptiveness;
        public final boolean allowAudioMixedSampleRateAdaptiveness;
        public final boolean allowAudioNonSeamlessAdaptiveness;
        public final boolean allowInvalidateSelectionsOnRendererCapabilitiesChange;
        public final boolean allowMultipleAdaptiveSelections;
        public final boolean allowVideoMixedDecoderSupportAdaptiveness;
        public final boolean allowVideoMixedMimeTypeAdaptiveness;
        public final boolean allowVideoNonSeamlessAdaptiveness;
        public final boolean constrainAudioChannelCountToDeviceCapabilities;
        public final boolean exceedAudioConstraintsIfNecessary;
        public final boolean exceedRendererCapabilitiesIfNecessary;
        public final boolean exceedVideoConstraintsIfNecessary;
        private final SparseBooleanArray rendererDisabledFlags;
        private final SparseArray<Map<TrackGroupArray, SelectionOverride>> selectionOverrides;
        public final boolean tunnelingEnabled;

        public static final class Builder extends TrackSelectionParameters.Builder {
            private boolean allowAudioMixedChannelCountAdaptiveness;
            private boolean allowAudioMixedDecoderSupportAdaptiveness;
            private boolean allowAudioMixedMimeTypeAdaptiveness;
            private boolean allowAudioMixedSampleRateAdaptiveness;
            private boolean allowAudioNonSeamlessAdaptiveness;
            private boolean allowInvalidateSelectionsOnRendererCapabilitiesChange;
            private boolean allowMultipleAdaptiveSelections;
            private boolean allowVideoMixedDecoderSupportAdaptiveness;
            private boolean allowVideoMixedMimeTypeAdaptiveness;
            private boolean allowVideoNonSeamlessAdaptiveness;
            private boolean constrainAudioChannelCountToDeviceCapabilities;
            private boolean exceedAudioConstraintsIfNecessary;
            private boolean exceedRendererCapabilitiesIfNecessary;
            private boolean exceedVideoConstraintsIfNecessary;
            private final SparseBooleanArray rendererDisabledFlags;
            private final SparseArray<Map<TrackGroupArray, SelectionOverride>> selectionOverrides;
            private boolean tunnelingEnabled;

            private static SparseArray<Map<TrackGroupArray, SelectionOverride>> cloneSelectionOverrides(SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray) {
                SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray2 = new SparseArray<>();
                for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                    sparseArray2.put(sparseArray.keyAt(i10), new HashMap(sparseArray.valueAt(i10)));
                }
                return sparseArray2;
            }

            private void init() {
                this.exceedVideoConstraintsIfNecessary = true;
                this.allowVideoMixedMimeTypeAdaptiveness = false;
                this.allowVideoNonSeamlessAdaptiveness = true;
                this.allowVideoMixedDecoderSupportAdaptiveness = false;
                this.exceedAudioConstraintsIfNecessary = true;
                this.allowAudioMixedMimeTypeAdaptiveness = false;
                this.allowAudioMixedSampleRateAdaptiveness = false;
                this.allowAudioMixedChannelCountAdaptiveness = false;
                this.allowAudioMixedDecoderSupportAdaptiveness = false;
                this.allowAudioNonSeamlessAdaptiveness = true;
                this.constrainAudioChannelCountToDeviceCapabilities = true;
                this.exceedRendererCapabilitiesIfNecessary = true;
                this.tunnelingEnabled = false;
                this.allowMultipleAdaptiveSelections = true;
                this.allowInvalidateSelectionsOnRendererCapabilitiesChange = false;
            }

            private SparseBooleanArray makeSparseBooleanArrayFromTrueKeys(@Nullable int[] iArr) {
                if (iArr == null) {
                    return new SparseBooleanArray();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
                for (int i10 : iArr) {
                    sparseBooleanArray.append(i10, true);
                }
                return sparseBooleanArray;
            }

            /* JADX WARN: Multi-variable type inference failed */
            private void setSelectionOverridesFromBundle(Bundle bundle) {
                int[] intArray = bundle.getIntArray(Parameters.FIELD_SELECTION_OVERRIDES_RENDERER_INDICES);
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(Parameters.FIELD_SELECTION_OVERRIDES_TRACK_GROUP_ARRAYS);
                ImmutableList immutableListOf = parcelableArrayList == null ? ImmutableList.of() : BundleCollectionUtil.fromBundleList(new Function() { // from class: androidx.media3.exoplayer.trackselection.n
                    @Override // com.google.common.base.Function
                    public final Object apply(Object obj) {
                        return TrackGroupArray.fromBundle((Bundle) obj);
                    }
                }, parcelableArrayList);
                SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(Parameters.FIELD_SELECTION_OVERRIDES);
                SparseArray sparseArray = sparseParcelableArray == null ? new SparseArray() : BundleCollectionUtil.fromBundleSparseArray(new Function() { // from class: androidx.media3.exoplayer.trackselection.o
                    @Override // com.google.common.base.Function
                    public final Object apply(Object obj) {
                        return DefaultTrackSelector.SelectionOverride.fromBundle((Bundle) obj);
                    }
                }, sparseParcelableArray);
                if (intArray == null || intArray.length != immutableListOf.size()) {
                    return;
                }
                for (int i10 = 0; i10 < intArray.length; i10++) {
                    setSelectionOverride(intArray[i10], (TrackGroupArray) immutableListOf.get(i10), (SelectionOverride) sparseArray.get(i10));
                }
            }

            @CanIgnoreReturnValue
            @Deprecated
            public Builder clearSelectionOverride(int i10, TrackGroupArray trackGroupArray) {
                Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i10);
                if (map != null && map.containsKey(trackGroupArray)) {
                    map.remove(trackGroupArray);
                    if (map.isEmpty()) {
                        this.selectionOverrides.remove(i10);
                    }
                }
                return this;
            }

            @CanIgnoreReturnValue
            @Deprecated
            public Builder clearSelectionOverrides(int i10) {
                Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i10);
                if (map != null && !map.isEmpty()) {
                    this.selectionOverrides.remove(i10);
                }
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setAllowAudioMixedChannelCountAdaptiveness(boolean z10) {
                this.allowAudioMixedChannelCountAdaptiveness = z10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setAllowAudioMixedDecoderSupportAdaptiveness(boolean z10) {
                this.allowAudioMixedDecoderSupportAdaptiveness = z10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setAllowAudioMixedMimeTypeAdaptiveness(boolean z10) {
                this.allowAudioMixedMimeTypeAdaptiveness = z10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setAllowAudioMixedSampleRateAdaptiveness(boolean z10) {
                this.allowAudioMixedSampleRateAdaptiveness = z10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setAllowAudioNonSeamlessAdaptiveness(boolean z10) {
                this.allowAudioNonSeamlessAdaptiveness = z10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setAllowInvalidateSelectionsOnRendererCapabilitiesChange(boolean z10) {
                this.allowInvalidateSelectionsOnRendererCapabilitiesChange = z10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setAllowMultipleAdaptiveSelections(boolean z10) {
                this.allowMultipleAdaptiveSelections = z10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setAllowVideoMixedDecoderSupportAdaptiveness(boolean z10) {
                this.allowVideoMixedDecoderSupportAdaptiveness = z10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setAllowVideoMixedMimeTypeAdaptiveness(boolean z10) {
                this.allowVideoMixedMimeTypeAdaptiveness = z10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setAllowVideoNonSeamlessAdaptiveness(boolean z10) {
                this.allowVideoNonSeamlessAdaptiveness = z10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setConstrainAudioChannelCountToDeviceCapabilities(boolean z10) {
                this.constrainAudioChannelCountToDeviceCapabilities = z10;
                return this;
            }

            @CanIgnoreReturnValue
            @Deprecated
            public Builder setDisabledTextTrackSelectionFlags(int i10) {
                return setIgnoredTextSelectionFlags(i10);
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            @Deprecated
            public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setDisabledTrackTypes(Set set) {
                return setDisabledTrackTypes((Set<Integer>) set);
            }

            @CanIgnoreReturnValue
            public Builder setExceedAudioConstraintsIfNecessary(boolean z10) {
                this.exceedAudioConstraintsIfNecessary = z10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setExceedRendererCapabilitiesIfNecessary(boolean z10) {
                this.exceedRendererCapabilitiesIfNecessary = z10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setExceedVideoConstraintsIfNecessary(boolean z10) {
                this.exceedVideoConstraintsIfNecessary = z10;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setRendererDisabled(int i10, boolean z10) {
                if (this.rendererDisabledFlags.get(i10) == z10) {
                    return this;
                }
                if (z10) {
                    this.rendererDisabledFlags.put(i10, true);
                    return this;
                }
                this.rendererDisabledFlags.delete(i10);
                return this;
            }

            @CanIgnoreReturnValue
            @Deprecated
            public Builder setSelectionOverride(int i10, TrackGroupArray trackGroupArray, @Nullable SelectionOverride selectionOverride) {
                Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i10);
                if (map == null) {
                    map = new HashMap<>();
                    this.selectionOverrides.put(i10, map);
                }
                if (map.containsKey(trackGroupArray) && Util.areEqual(map.get(trackGroupArray), selectionOverride)) {
                    return this;
                }
                map.put(trackGroupArray, selectionOverride);
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setTunnelingEnabled(boolean z10) {
                this.tunnelingEnabled = z10;
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder addOverride(TrackSelectionOverride trackSelectionOverride) {
                super.addOverride(trackSelectionOverride);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public Parameters build() {
                return new Parameters(this);
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder clearOverride(TrackGroup trackGroup) {
                super.clearOverride(trackGroup);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder clearOverrides() {
                super.clearOverrides();
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder clearOverridesOfType(int i10) {
                super.clearOverridesOfType(i10);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder clearVideoSizeConstraints() {
                super.clearVideoSizeConstraints();
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder clearViewportSizeConstraints() {
                super.clearViewportSizeConstraints();
                return this;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder set(TrackSelectionParameters trackSelectionParameters) {
                super.set(trackSelectionParameters);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            @Deprecated
            public Builder setDisabledTrackTypes(Set<Integer> set) {
                super.setDisabledTrackTypes(set);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setForceHighestSupportedBitrate(boolean z10) {
                super.setForceHighestSupportedBitrate(z10);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setForceLowestBitrate(boolean z10) {
                super.setForceLowestBitrate(z10);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setIgnoredTextSelectionFlags(int i10) {
                super.setIgnoredTextSelectionFlags(i10);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setMaxAudioBitrate(int i10) {
                super.setMaxAudioBitrate(i10);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setMaxAudioChannelCount(int i10) {
                super.setMaxAudioChannelCount(i10);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setMaxVideoBitrate(int i10) {
                super.setMaxVideoBitrate(i10);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setMaxVideoFrameRate(int i10) {
                super.setMaxVideoFrameRate(i10);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setMaxVideoSize(int i10, int i11) {
                super.setMaxVideoSize(i10, i11);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setMaxVideoSizeSd() {
                super.setMaxVideoSizeSd();
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setMinVideoBitrate(int i10) {
                super.setMinVideoBitrate(i10);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setMinVideoFrameRate(int i10) {
                super.setMinVideoFrameRate(i10);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setMinVideoSize(int i10, int i11) {
                super.setMinVideoSize(i10, i11);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setOverrideForType(TrackSelectionOverride trackSelectionOverride) {
                super.setOverrideForType(trackSelectionOverride);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setPreferredAudioLanguage(@Nullable String str) {
                super.setPreferredAudioLanguage(str);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setPreferredAudioLanguages(String... strArr) {
                super.setPreferredAudioLanguages(strArr);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setPreferredAudioMimeType(@Nullable String str) {
                super.setPreferredAudioMimeType(str);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setPreferredAudioMimeTypes(String... strArr) {
                super.setPreferredAudioMimeTypes(strArr);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setPreferredAudioRoleFlags(int i10) {
                super.setPreferredAudioRoleFlags(i10);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setPreferredTextLanguage(@Nullable String str) {
                super.setPreferredTextLanguage(str);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(Context context) {
                super.setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(context);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setPreferredTextLanguages(String... strArr) {
                super.setPreferredTextLanguages(strArr);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setPreferredTextRoleFlags(int i10) {
                super.setPreferredTextRoleFlags(i10);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setPreferredVideoMimeType(@Nullable String str) {
                super.setPreferredVideoMimeType(str);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setPreferredVideoMimeTypes(String... strArr) {
                super.setPreferredVideoMimeTypes(strArr);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setPreferredVideoRoleFlags(int i10) {
                super.setPreferredVideoRoleFlags(i10);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setSelectUndeterminedTextLanguage(boolean z10) {
                super.setSelectUndeterminedTextLanguage(z10);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setTrackTypeDisabled(int i10, boolean z10) {
                super.setTrackTypeDisabled(i10, z10);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setViewportSize(int i10, int i11, boolean z10) {
                super.setViewportSize(i10, i11, z10);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setViewportSizeToPhysicalDisplaySize(Context context, boolean z10) {
                super.setViewportSizeToPhysicalDisplaySize(context, z10);
                return this;
            }

            @Deprecated
            public Builder() {
                this.selectionOverrides = new SparseArray<>();
                this.rendererDisabledFlags = new SparseBooleanArray();
                init();
            }

            @CanIgnoreReturnValue
            @Deprecated
            public Builder clearSelectionOverrides() {
                if (this.selectionOverrides.size() == 0) {
                    return this;
                }
                this.selectionOverrides.clear();
                return this;
            }

            public Builder(Context context) {
                super(context);
                this.selectionOverrides = new SparseArray<>();
                this.rendererDisabledFlags = new SparseBooleanArray();
                init();
            }

            private Builder(Parameters parameters) {
                super(parameters);
                this.exceedVideoConstraintsIfNecessary = parameters.exceedVideoConstraintsIfNecessary;
                this.allowVideoMixedMimeTypeAdaptiveness = parameters.allowVideoMixedMimeTypeAdaptiveness;
                this.allowVideoNonSeamlessAdaptiveness = parameters.allowVideoNonSeamlessAdaptiveness;
                this.allowVideoMixedDecoderSupportAdaptiveness = parameters.allowVideoMixedDecoderSupportAdaptiveness;
                this.exceedAudioConstraintsIfNecessary = parameters.exceedAudioConstraintsIfNecessary;
                this.allowAudioMixedMimeTypeAdaptiveness = parameters.allowAudioMixedMimeTypeAdaptiveness;
                this.allowAudioMixedSampleRateAdaptiveness = parameters.allowAudioMixedSampleRateAdaptiveness;
                this.allowAudioMixedChannelCountAdaptiveness = parameters.allowAudioMixedChannelCountAdaptiveness;
                this.allowAudioMixedDecoderSupportAdaptiveness = parameters.allowAudioMixedDecoderSupportAdaptiveness;
                this.allowAudioNonSeamlessAdaptiveness = parameters.allowAudioNonSeamlessAdaptiveness;
                this.constrainAudioChannelCountToDeviceCapabilities = parameters.constrainAudioChannelCountToDeviceCapabilities;
                this.exceedRendererCapabilitiesIfNecessary = parameters.exceedRendererCapabilitiesIfNecessary;
                this.tunnelingEnabled = parameters.tunnelingEnabled;
                this.allowMultipleAdaptiveSelections = parameters.allowMultipleAdaptiveSelections;
                this.allowInvalidateSelectionsOnRendererCapabilitiesChange = parameters.allowInvalidateSelectionsOnRendererCapabilitiesChange;
                this.selectionOverrides = cloneSelectionOverrides(parameters.selectionOverrides);
                this.rendererDisabledFlags = parameters.rendererDisabledFlags.clone();
            }

            private Builder(Bundle bundle) {
                super(bundle);
                init();
                Parameters parameters = Parameters.DEFAULT_WITHOUT_CONTEXT;
                setExceedVideoConstraintsIfNecessary(bundle.getBoolean(Parameters.FIELD_EXCEED_VIDEO_CONSTRAINTS_IF_NECESSARY, parameters.exceedVideoConstraintsIfNecessary));
                setAllowVideoMixedMimeTypeAdaptiveness(bundle.getBoolean(Parameters.FIELD_ALLOW_VIDEO_MIXED_MIME_TYPE_ADAPTIVENESS, parameters.allowVideoMixedMimeTypeAdaptiveness));
                setAllowVideoNonSeamlessAdaptiveness(bundle.getBoolean(Parameters.FIELD_ALLOW_VIDEO_NON_SEAMLESS_ADAPTIVENESS, parameters.allowVideoNonSeamlessAdaptiveness));
                setAllowVideoMixedDecoderSupportAdaptiveness(bundle.getBoolean(Parameters.FIELD_ALLOW_VIDEO_MIXED_DECODER_SUPPORT_ADAPTIVENESS, parameters.allowVideoMixedDecoderSupportAdaptiveness));
                setExceedAudioConstraintsIfNecessary(bundle.getBoolean(Parameters.FIELD_EXCEED_AUDIO_CONSTRAINTS_IF_NECESSARY, parameters.exceedAudioConstraintsIfNecessary));
                setAllowAudioMixedMimeTypeAdaptiveness(bundle.getBoolean(Parameters.FIELD_ALLOW_AUDIO_MIXED_MIME_TYPE_ADAPTIVENESS, parameters.allowAudioMixedMimeTypeAdaptiveness));
                setAllowAudioMixedSampleRateAdaptiveness(bundle.getBoolean(Parameters.FIELD_ALLOW_AUDIO_MIXED_SAMPLE_RATE_ADAPTIVENESS, parameters.allowAudioMixedSampleRateAdaptiveness));
                setAllowAudioMixedChannelCountAdaptiveness(bundle.getBoolean(Parameters.FIELD_ALLOW_AUDIO_MIXED_CHANNEL_COUNT_ADAPTIVENESS, parameters.allowAudioMixedChannelCountAdaptiveness));
                setAllowAudioMixedDecoderSupportAdaptiveness(bundle.getBoolean(Parameters.FIELD_ALLOW_AUDIO_MIXED_DECODER_SUPPORT_ADAPTIVENESS, parameters.allowAudioMixedDecoderSupportAdaptiveness));
                setAllowAudioNonSeamlessAdaptiveness(bundle.getBoolean(Parameters.FIELD_ALLOW_AUDIO_NON_SEAMLESS_ADAPTIVENESS, parameters.allowAudioNonSeamlessAdaptiveness));
                setConstrainAudioChannelCountToDeviceCapabilities(bundle.getBoolean(Parameters.FIELD_CONSTRAIN_AUDIO_CHANNEL_COUNT_TO_DEVICE_CAPABILITIES, parameters.constrainAudioChannelCountToDeviceCapabilities));
                setExceedRendererCapabilitiesIfNecessary(bundle.getBoolean(Parameters.FIELD_EXCEED_RENDERER_CAPABILITIES_IF_NECESSARY, parameters.exceedRendererCapabilitiesIfNecessary));
                setTunnelingEnabled(bundle.getBoolean(Parameters.FIELD_TUNNELING_ENABLED, parameters.tunnelingEnabled));
                setAllowMultipleAdaptiveSelections(bundle.getBoolean(Parameters.FIELD_ALLOW_MULTIPLE_ADAPTIVE_SELECTIONS, parameters.allowMultipleAdaptiveSelections));
                setAllowInvalidateSelectionsOnRendererCapabilitiesChange(bundle.getBoolean(Parameters.FIELD_ALLOW_INVALIDATE_SELECTIONS_ON_RENDERER_CAPABILITIES_CHANGE, parameters.allowInvalidateSelectionsOnRendererCapabilitiesChange));
                this.selectionOverrides = new SparseArray<>();
                setSelectionOverridesFromBundle(bundle);
                this.rendererDisabledFlags = makeSparseBooleanArrayFromTrueKeys(bundle.getIntArray(Parameters.FIELD_RENDERER_DISABLED_INDICES));
            }
        }

        static {
            Parameters parametersBuild = new Builder().build();
            DEFAULT_WITHOUT_CONTEXT = parametersBuild;
            DEFAULT = parametersBuild;
            FIELD_EXCEED_VIDEO_CONSTRAINTS_IF_NECESSARY = Util.intToStringMaxRadix(1000);
            FIELD_ALLOW_VIDEO_MIXED_MIME_TYPE_ADAPTIVENESS = Util.intToStringMaxRadix(1001);
            FIELD_ALLOW_VIDEO_NON_SEAMLESS_ADAPTIVENESS = Util.intToStringMaxRadix(1002);
            FIELD_EXCEED_AUDIO_CONSTRAINTS_IF_NECESSARY = Util.intToStringMaxRadix(1003);
            FIELD_ALLOW_AUDIO_MIXED_MIME_TYPE_ADAPTIVENESS = Util.intToStringMaxRadix(1004);
            FIELD_ALLOW_AUDIO_MIXED_SAMPLE_RATE_ADAPTIVENESS = Util.intToStringMaxRadix(1005);
            FIELD_ALLOW_AUDIO_MIXED_CHANNEL_COUNT_ADAPTIVENESS = Util.intToStringMaxRadix(1006);
            FIELD_EXCEED_RENDERER_CAPABILITIES_IF_NECESSARY = Util.intToStringMaxRadix(1007);
            FIELD_TUNNELING_ENABLED = Util.intToStringMaxRadix(1008);
            FIELD_ALLOW_MULTIPLE_ADAPTIVE_SELECTIONS = Util.intToStringMaxRadix(1009);
            FIELD_SELECTION_OVERRIDES_RENDERER_INDICES = Util.intToStringMaxRadix(1010);
            FIELD_SELECTION_OVERRIDES_TRACK_GROUP_ARRAYS = Util.intToStringMaxRadix(1011);
            FIELD_SELECTION_OVERRIDES = Util.intToStringMaxRadix(1012);
            FIELD_RENDERER_DISABLED_INDICES = Util.intToStringMaxRadix(1013);
            FIELD_ALLOW_VIDEO_MIXED_DECODER_SUPPORT_ADAPTIVENESS = Util.intToStringMaxRadix(1014);
            FIELD_ALLOW_AUDIO_MIXED_DECODER_SUPPORT_ADAPTIVENESS = Util.intToStringMaxRadix(1015);
            FIELD_CONSTRAIN_AUDIO_CHANNEL_COUNT_TO_DEVICE_CAPABILITIES = Util.intToStringMaxRadix(1016);
            FIELD_ALLOW_INVALIDATE_SELECTIONS_ON_RENDERER_CAPABILITIES_CHANGE = Util.intToStringMaxRadix(1017);
            FIELD_ALLOW_AUDIO_NON_SEAMLESS_ADAPTIVENESS = Util.intToStringMaxRadix(1018);
        }

        private static boolean areRendererDisabledFlagsEqual(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean areSelectionOverridesEqual(SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                if (iIndexOfKey < 0 || !areSelectionOverridesEqual(sparseArray.valueAt(i10), sparseArray2.valueAt(iIndexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        public static Parameters fromBundle(Bundle bundle) {
            return new Builder(bundle).build();
        }

        public static Parameters getDefaults(Context context) {
            return new Builder(context).build();
        }

        private static int[] getKeysFromSparseBooleanArray(SparseBooleanArray sparseBooleanArray) {
            int[] iArr = new int[sparseBooleanArray.size()];
            for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
                iArr[i10] = sparseBooleanArray.keyAt(i10);
            }
            return iArr;
        }

        private static void putSelectionOverridesToBundle(Bundle bundle, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray2 = new SparseArray();
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                int iKeyAt = sparseArray.keyAt(i10);
                for (Map.Entry<TrackGroupArray, SelectionOverride> entry : sparseArray.valueAt(i10).entrySet()) {
                    SelectionOverride value = entry.getValue();
                    if (value != null) {
                        sparseArray2.put(arrayList2.size(), value);
                    }
                    arrayList2.add(entry.getKey());
                    arrayList.add(Integer.valueOf(iKeyAt));
                }
                bundle.putIntArray(FIELD_SELECTION_OVERRIDES_RENDERER_INDICES, Ints.toArray(arrayList));
                bundle.putParcelableArrayList(FIELD_SELECTION_OVERRIDES_TRACK_GROUP_ARRAYS, BundleCollectionUtil.toBundleArrayList(arrayList2, new Function() { // from class: androidx.media3.exoplayer.trackselection.l
                    @Override // com.google.common.base.Function
                    public final Object apply(Object obj) {
                        return ((TrackGroupArray) obj).toBundle();
                    }
                }));
                bundle.putSparseParcelableArray(FIELD_SELECTION_OVERRIDES, BundleCollectionUtil.toBundleSparseArray(sparseArray2, new Function() { // from class: androidx.media3.exoplayer.trackselection.m
                    @Override // com.google.common.base.Function
                    public final Object apply(Object obj) {
                        return ((DefaultTrackSelector.SelectionOverride) obj).toBundle();
                    }
                }));
            }
        }

        @Override // androidx.media3.common.TrackSelectionParameters
        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Parameters.class == obj.getClass()) {
                Parameters parameters = (Parameters) obj;
                if (super.equals(parameters) && this.exceedVideoConstraintsIfNecessary == parameters.exceedVideoConstraintsIfNecessary && this.allowVideoMixedMimeTypeAdaptiveness == parameters.allowVideoMixedMimeTypeAdaptiveness && this.allowVideoNonSeamlessAdaptiveness == parameters.allowVideoNonSeamlessAdaptiveness && this.allowVideoMixedDecoderSupportAdaptiveness == parameters.allowVideoMixedDecoderSupportAdaptiveness && this.exceedAudioConstraintsIfNecessary == parameters.exceedAudioConstraintsIfNecessary && this.allowAudioMixedMimeTypeAdaptiveness == parameters.allowAudioMixedMimeTypeAdaptiveness && this.allowAudioMixedSampleRateAdaptiveness == parameters.allowAudioMixedSampleRateAdaptiveness && this.allowAudioMixedChannelCountAdaptiveness == parameters.allowAudioMixedChannelCountAdaptiveness && this.allowAudioMixedDecoderSupportAdaptiveness == parameters.allowAudioMixedDecoderSupportAdaptiveness && this.allowAudioNonSeamlessAdaptiveness == parameters.allowAudioNonSeamlessAdaptiveness && this.constrainAudioChannelCountToDeviceCapabilities == parameters.constrainAudioChannelCountToDeviceCapabilities && this.exceedRendererCapabilitiesIfNecessary == parameters.exceedRendererCapabilitiesIfNecessary && this.tunnelingEnabled == parameters.tunnelingEnabled && this.allowMultipleAdaptiveSelections == parameters.allowMultipleAdaptiveSelections && this.allowInvalidateSelectionsOnRendererCapabilitiesChange == parameters.allowInvalidateSelectionsOnRendererCapabilitiesChange && areRendererDisabledFlagsEqual(this.rendererDisabledFlags, parameters.rendererDisabledFlags) && areSelectionOverridesEqual(this.selectionOverrides, parameters.selectionOverrides)) {
                    return true;
                }
            }
            return false;
        }

        public boolean getRendererDisabled(int i10) {
            return this.rendererDisabledFlags.get(i10);
        }

        @Nullable
        @Deprecated
        public SelectionOverride getSelectionOverride(int i10, TrackGroupArray trackGroupArray) {
            Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i10);
            if (map != null) {
                return map.get(trackGroupArray);
            }
            return null;
        }

        @Deprecated
        public boolean hasSelectionOverride(int i10, TrackGroupArray trackGroupArray) {
            Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i10);
            return map != null && map.containsKey(trackGroupArray);
        }

        @Override // androidx.media3.common.TrackSelectionParameters
        public int hashCode() {
            return ((((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.exceedVideoConstraintsIfNecessary ? 1 : 0)) * 31) + (this.allowVideoMixedMimeTypeAdaptiveness ? 1 : 0)) * 31) + (this.allowVideoNonSeamlessAdaptiveness ? 1 : 0)) * 31) + (this.allowVideoMixedDecoderSupportAdaptiveness ? 1 : 0)) * 31) + (this.exceedAudioConstraintsIfNecessary ? 1 : 0)) * 31) + (this.allowAudioMixedMimeTypeAdaptiveness ? 1 : 0)) * 31) + (this.allowAudioMixedSampleRateAdaptiveness ? 1 : 0)) * 31) + (this.allowAudioMixedChannelCountAdaptiveness ? 1 : 0)) * 31) + (this.allowAudioMixedDecoderSupportAdaptiveness ? 1 : 0)) * 31) + (this.allowAudioNonSeamlessAdaptiveness ? 1 : 0)) * 31) + (this.constrainAudioChannelCountToDeviceCapabilities ? 1 : 0)) * 31) + (this.exceedRendererCapabilitiesIfNecessary ? 1 : 0)) * 31) + (this.tunnelingEnabled ? 1 : 0)) * 31) + (this.allowMultipleAdaptiveSelections ? 1 : 0)) * 31) + (this.allowInvalidateSelectionsOnRendererCapabilitiesChange ? 1 : 0);
        }

        @Override // androidx.media3.common.TrackSelectionParameters
        public Bundle toBundle() {
            Bundle bundle = super.toBundle();
            bundle.putBoolean(FIELD_EXCEED_VIDEO_CONSTRAINTS_IF_NECESSARY, this.exceedVideoConstraintsIfNecessary);
            bundle.putBoolean(FIELD_ALLOW_VIDEO_MIXED_MIME_TYPE_ADAPTIVENESS, this.allowVideoMixedMimeTypeAdaptiveness);
            bundle.putBoolean(FIELD_ALLOW_VIDEO_NON_SEAMLESS_ADAPTIVENESS, this.allowVideoNonSeamlessAdaptiveness);
            bundle.putBoolean(FIELD_ALLOW_VIDEO_MIXED_DECODER_SUPPORT_ADAPTIVENESS, this.allowVideoMixedDecoderSupportAdaptiveness);
            bundle.putBoolean(FIELD_EXCEED_AUDIO_CONSTRAINTS_IF_NECESSARY, this.exceedAudioConstraintsIfNecessary);
            bundle.putBoolean(FIELD_ALLOW_AUDIO_MIXED_MIME_TYPE_ADAPTIVENESS, this.allowAudioMixedMimeTypeAdaptiveness);
            bundle.putBoolean(FIELD_ALLOW_AUDIO_MIXED_SAMPLE_RATE_ADAPTIVENESS, this.allowAudioMixedSampleRateAdaptiveness);
            bundle.putBoolean(FIELD_ALLOW_AUDIO_MIXED_CHANNEL_COUNT_ADAPTIVENESS, this.allowAudioMixedChannelCountAdaptiveness);
            bundle.putBoolean(FIELD_ALLOW_AUDIO_MIXED_DECODER_SUPPORT_ADAPTIVENESS, this.allowAudioMixedDecoderSupportAdaptiveness);
            bundle.putBoolean(FIELD_ALLOW_AUDIO_NON_SEAMLESS_ADAPTIVENESS, this.allowAudioNonSeamlessAdaptiveness);
            bundle.putBoolean(FIELD_CONSTRAIN_AUDIO_CHANNEL_COUNT_TO_DEVICE_CAPABILITIES, this.constrainAudioChannelCountToDeviceCapabilities);
            bundle.putBoolean(FIELD_EXCEED_RENDERER_CAPABILITIES_IF_NECESSARY, this.exceedRendererCapabilitiesIfNecessary);
            bundle.putBoolean(FIELD_TUNNELING_ENABLED, this.tunnelingEnabled);
            bundle.putBoolean(FIELD_ALLOW_MULTIPLE_ADAPTIVE_SELECTIONS, this.allowMultipleAdaptiveSelections);
            bundle.putBoolean(FIELD_ALLOW_INVALIDATE_SELECTIONS_ON_RENDERER_CAPABILITIES_CHANGE, this.allowInvalidateSelectionsOnRendererCapabilitiesChange);
            putSelectionOverridesToBundle(bundle, this.selectionOverrides);
            bundle.putIntArray(FIELD_RENDERER_DISABLED_INDICES, getKeysFromSparseBooleanArray(this.rendererDisabledFlags));
            return bundle;
        }

        private Parameters(Builder builder) {
            super(builder);
            this.exceedVideoConstraintsIfNecessary = builder.exceedVideoConstraintsIfNecessary;
            this.allowVideoMixedMimeTypeAdaptiveness = builder.allowVideoMixedMimeTypeAdaptiveness;
            this.allowVideoNonSeamlessAdaptiveness = builder.allowVideoNonSeamlessAdaptiveness;
            this.allowVideoMixedDecoderSupportAdaptiveness = builder.allowVideoMixedDecoderSupportAdaptiveness;
            this.exceedAudioConstraintsIfNecessary = builder.exceedAudioConstraintsIfNecessary;
            this.allowAudioMixedMimeTypeAdaptiveness = builder.allowAudioMixedMimeTypeAdaptiveness;
            this.allowAudioMixedSampleRateAdaptiveness = builder.allowAudioMixedSampleRateAdaptiveness;
            this.allowAudioMixedChannelCountAdaptiveness = builder.allowAudioMixedChannelCountAdaptiveness;
            this.allowAudioMixedDecoderSupportAdaptiveness = builder.allowAudioMixedDecoderSupportAdaptiveness;
            this.allowAudioNonSeamlessAdaptiveness = builder.allowAudioNonSeamlessAdaptiveness;
            this.constrainAudioChannelCountToDeviceCapabilities = builder.constrainAudioChannelCountToDeviceCapabilities;
            this.exceedRendererCapabilitiesIfNecessary = builder.exceedRendererCapabilitiesIfNecessary;
            this.tunnelingEnabled = builder.tunnelingEnabled;
            this.allowMultipleAdaptiveSelections = builder.allowMultipleAdaptiveSelections;
            this.allowInvalidateSelectionsOnRendererCapabilitiesChange = builder.allowInvalidateSelectionsOnRendererCapabilitiesChange;
            this.selectionOverrides = builder.selectionOverrides;
            this.rendererDisabledFlags = builder.rendererDisabledFlags;
        }

        @Override // androidx.media3.common.TrackSelectionParameters
        public Builder buildUpon() {
            return new Builder();
        }

        private static boolean areSelectionOverridesEqual(Map<TrackGroupArray, SelectionOverride> map, Map<TrackGroupArray, SelectionOverride> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<TrackGroupArray, SelectionOverride> entry : map.entrySet()) {
                TrackGroupArray key = entry.getKey();
                if (!map2.containsKey(key) || !Util.areEqual(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }
    }

    @Deprecated
    public static final class ParametersBuilder extends TrackSelectionParameters.Builder {
        private final Parameters.Builder delegate;

        @Deprecated
        public ParametersBuilder() {
            this.delegate = new Parameters.Builder();
        }

        @CanIgnoreReturnValue
        @Deprecated
        public ParametersBuilder clearSelectionOverride(int i10, TrackGroupArray trackGroupArray) {
            this.delegate.clearSelectionOverride(i10, trackGroupArray);
            return this;
        }

        @CanIgnoreReturnValue
        @Deprecated
        public ParametersBuilder clearSelectionOverrides(int i10) {
            this.delegate.clearSelectionOverrides(i10);
            return this;
        }

        @CanIgnoreReturnValue
        public ParametersBuilder setAllowAudioMixedChannelCountAdaptiveness(boolean z10) {
            this.delegate.setAllowAudioMixedChannelCountAdaptiveness(z10);
            return this;
        }

        @CanIgnoreReturnValue
        public ParametersBuilder setAllowAudioMixedDecoderSupportAdaptiveness(boolean z10) {
            this.delegate.setAllowAudioMixedDecoderSupportAdaptiveness(z10);
            return this;
        }

        @CanIgnoreReturnValue
        public ParametersBuilder setAllowAudioMixedMimeTypeAdaptiveness(boolean z10) {
            this.delegate.setAllowAudioMixedMimeTypeAdaptiveness(z10);
            return this;
        }

        @CanIgnoreReturnValue
        public ParametersBuilder setAllowAudioMixedSampleRateAdaptiveness(boolean z10) {
            this.delegate.setAllowAudioMixedSampleRateAdaptiveness(z10);
            return this;
        }

        @CanIgnoreReturnValue
        public ParametersBuilder setAllowMultipleAdaptiveSelections(boolean z10) {
            this.delegate.setAllowMultipleAdaptiveSelections(z10);
            return this;
        }

        @CanIgnoreReturnValue
        public ParametersBuilder setAllowVideoMixedDecoderSupportAdaptiveness(boolean z10) {
            this.delegate.setAllowVideoMixedDecoderSupportAdaptiveness(z10);
            return this;
        }

        @CanIgnoreReturnValue
        public ParametersBuilder setAllowVideoMixedMimeTypeAdaptiveness(boolean z10) {
            this.delegate.setAllowVideoMixedMimeTypeAdaptiveness(z10);
            return this;
        }

        @CanIgnoreReturnValue
        public ParametersBuilder setAllowVideoNonSeamlessAdaptiveness(boolean z10) {
            this.delegate.setAllowVideoNonSeamlessAdaptiveness(z10);
            return this;
        }

        @CanIgnoreReturnValue
        @Deprecated
        public ParametersBuilder setDisabledTextTrackSelectionFlags(int i10) {
            this.delegate.setDisabledTextTrackSelectionFlags(i10);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        @Deprecated
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setDisabledTrackTypes(Set set) {
            return setDisabledTrackTypes((Set<Integer>) set);
        }

        @CanIgnoreReturnValue
        public ParametersBuilder setExceedAudioConstraintsIfNecessary(boolean z10) {
            this.delegate.setExceedAudioConstraintsIfNecessary(z10);
            return this;
        }

        @CanIgnoreReturnValue
        public ParametersBuilder setExceedRendererCapabilitiesIfNecessary(boolean z10) {
            this.delegate.setExceedRendererCapabilitiesIfNecessary(z10);
            return this;
        }

        @CanIgnoreReturnValue
        public ParametersBuilder setExceedVideoConstraintsIfNecessary(boolean z10) {
            this.delegate.setExceedVideoConstraintsIfNecessary(z10);
            return this;
        }

        @CanIgnoreReturnValue
        public ParametersBuilder setRendererDisabled(int i10, boolean z10) {
            this.delegate.setRendererDisabled(i10, z10);
            return this;
        }

        @CanIgnoreReturnValue
        @Deprecated
        public ParametersBuilder setSelectionOverride(int i10, TrackGroupArray trackGroupArray, @Nullable SelectionOverride selectionOverride) {
            this.delegate.setSelectionOverride(i10, trackGroupArray, selectionOverride);
            return this;
        }

        @CanIgnoreReturnValue
        public ParametersBuilder setTunnelingEnabled(boolean z10) {
            this.delegate.setTunnelingEnabled(z10);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder addOverride(TrackSelectionOverride trackSelectionOverride) {
            this.delegate.addOverride(trackSelectionOverride);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public Parameters build() {
            return this.delegate.build();
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder clearOverride(TrackGroup trackGroup) {
            this.delegate.clearOverride(trackGroup);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder clearOverrides() {
            this.delegate.clearOverrides();
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder clearOverridesOfType(int i10) {
            this.delegate.clearOverridesOfType(i10);
            return this;
        }

        @CanIgnoreReturnValue
        @Deprecated
        public ParametersBuilder clearSelectionOverrides() {
            this.delegate.clearSelectionOverrides();
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder clearVideoSizeConstraints() {
            this.delegate.clearVideoSizeConstraints();
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder clearViewportSizeConstraints() {
            this.delegate.clearViewportSizeConstraints();
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder set(TrackSelectionParameters trackSelectionParameters) {
            this.delegate.set(trackSelectionParameters);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setAudioOffloadPreferences(TrackSelectionParameters.AudioOffloadPreferences audioOffloadPreferences) {
            this.delegate.setAudioOffloadPreferences(audioOffloadPreferences);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        @Deprecated
        public ParametersBuilder setDisabledTrackTypes(Set<Integer> set) {
            this.delegate.setDisabledTrackTypes(set);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setForceHighestSupportedBitrate(boolean z10) {
            this.delegate.setForceHighestSupportedBitrate(z10);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setForceLowestBitrate(boolean z10) {
            this.delegate.setForceLowestBitrate(z10);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setIgnoredTextSelectionFlags(int i10) {
            this.delegate.setIgnoredTextSelectionFlags(i10);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setMaxAudioBitrate(int i10) {
            this.delegate.setMaxAudioBitrate(i10);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setMaxAudioChannelCount(int i10) {
            this.delegate.setMaxAudioChannelCount(i10);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setMaxVideoBitrate(int i10) {
            this.delegate.setMaxVideoBitrate(i10);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setMaxVideoFrameRate(int i10) {
            this.delegate.setMaxVideoFrameRate(i10);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setMaxVideoSize(int i10, int i11) {
            this.delegate.setMaxVideoSize(i10, i11);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setMaxVideoSizeSd() {
            this.delegate.setMaxVideoSizeSd();
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setMinVideoBitrate(int i10) {
            this.delegate.setMinVideoBitrate(i10);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setMinVideoFrameRate(int i10) {
            this.delegate.setMinVideoFrameRate(i10);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setMinVideoSize(int i10, int i11) {
            this.delegate.setMinVideoSize(i10, i11);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setOverrideForType(TrackSelectionOverride trackSelectionOverride) {
            this.delegate.setOverrideForType(trackSelectionOverride);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setPreferredAudioLanguage(@Nullable String str) {
            this.delegate.setPreferredAudioLanguage(str);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setPreferredAudioLanguages(String... strArr) {
            this.delegate.setPreferredAudioLanguages(strArr);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setPreferredAudioMimeType(@Nullable String str) {
            this.delegate.setPreferredAudioMimeType(str);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setPreferredAudioMimeTypes(String... strArr) {
            this.delegate.setPreferredAudioMimeTypes(strArr);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setPreferredAudioRoleFlags(int i10) {
            this.delegate.setPreferredAudioRoleFlags(i10);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setPreferredTextLanguage(@Nullable String str) {
            this.delegate.setPreferredTextLanguage(str);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(Context context) {
            this.delegate.setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(context);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setPreferredTextLanguages(String... strArr) {
            this.delegate.setPreferredTextLanguages(strArr);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setPreferredTextRoleFlags(int i10) {
            this.delegate.setPreferredTextRoleFlags(i10);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setPreferredVideoMimeType(@Nullable String str) {
            this.delegate.setPreferredVideoMimeType(str);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setPreferredVideoMimeTypes(String... strArr) {
            this.delegate.setPreferredVideoMimeTypes(strArr);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setPreferredVideoRoleFlags(int i10) {
            this.delegate.setPreferredVideoRoleFlags(i10);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setPrioritizeImageOverVideoEnabled(boolean z10) {
            this.delegate.setPrioritizeImageOverVideoEnabled(z10);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setSelectUndeterminedTextLanguage(boolean z10) {
            this.delegate.setSelectUndeterminedTextLanguage(z10);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setTrackTypeDisabled(int i10, boolean z10) {
            this.delegate.setTrackTypeDisabled(i10, z10);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setViewportSize(int i10, int i11, boolean z10) {
            this.delegate.setViewportSize(i10, i11, z10);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setViewportSizeToPhysicalDisplaySize(Context context, boolean z10) {
            this.delegate.setViewportSizeToPhysicalDisplaySize(context, z10);
            return this;
        }

        public ParametersBuilder(Context context) {
            this.delegate = new Parameters.Builder(context);
        }
    }

    public static final class SelectionOverride {
        private static final String FIELD_GROUP_INDEX = Util.intToStringMaxRadix(0);
        private static final String FIELD_TRACKS = Util.intToStringMaxRadix(1);
        private static final String FIELD_TRACK_TYPE = Util.intToStringMaxRadix(2);
        public final int groupIndex;
        public final int length;
        public final int[] tracks;
        public final int type;

        public SelectionOverride(int i10, int... iArr) {
            this(i10, iArr, 0);
        }

        @UnstableApi
        public static SelectionOverride fromBundle(Bundle bundle) {
            int i10 = bundle.getInt(FIELD_GROUP_INDEX, -1);
            int[] intArray = bundle.getIntArray(FIELD_TRACKS);
            int i11 = bundle.getInt(FIELD_TRACK_TYPE, -1);
            Assertions.checkArgument(i10 >= 0 && i11 >= 0);
            Assertions.checkNotNull(intArray);
            return new SelectionOverride(i10, intArray, i11);
        }

        public boolean containsTrack(int i10) {
            for (int i11 : this.tracks) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && SelectionOverride.class == obj.getClass()) {
                SelectionOverride selectionOverride = (SelectionOverride) obj;
                if (this.groupIndex == selectionOverride.groupIndex && Arrays.equals(this.tracks, selectionOverride.tracks) && this.type == selectionOverride.type) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.groupIndex * 31) + Arrays.hashCode(this.tracks)) * 31) + this.type;
        }

        @UnstableApi
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(FIELD_GROUP_INDEX, this.groupIndex);
            bundle.putIntArray(FIELD_TRACKS, this.tracks);
            bundle.putInt(FIELD_TRACK_TYPE, this.type);
            return bundle;
        }

        @UnstableApi
        public SelectionOverride(int i10, int[] iArr, int i11) {
            this.groupIndex = i10;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.tracks = iArrCopyOf;
            this.length = iArr.length;
            this.type = i11;
            Arrays.sort(iArrCopyOf);
        }
    }

    @RequiresApi(32)
    private static class SpatializerWrapperV32 {

        @Nullable
        private Handler handler;

        @Nullable
        private Spatializer$OnSpatializerStateChangedListener listener;
        private final boolean spatializationSupported;
        private final Spatializer spatializer;

        private SpatializerWrapperV32(Spatializer spatializer) {
            this.spatializer = spatializer;
            this.spatializationSupported = spatializer.getImmersiveAudioLevel() != 0;
        }

        @Nullable
        public static SpatializerWrapperV32 tryCreateInstance(Context context) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return null;
            }
            return new SpatializerWrapperV32(audioManager.getSpatializer());
        }

        public boolean canBeSpatialized(AudioAttributes audioAttributes, Format format) {
            int audioTrackChannelConfig = Util.getAudioTrackChannelConfig(("audio/eac3-joc".equals(format.sampleMimeType) && format.channelCount == 16) ? 12 : format.channelCount);
            if (audioTrackChannelConfig == 0) {
                return false;
            }
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(audioTrackChannelConfig);
            int i10 = format.sampleRate;
            if (i10 != -1) {
                channelMask.setSampleRate(i10);
            }
            return this.spatializer.canBeSpatialized(audioAttributes.getAudioAttributesV21().audioAttributes, channelMask.build());
        }

        public void ensureInitialized(final DefaultTrackSelector defaultTrackSelector, Looper looper) {
            if (this.listener == null && this.handler == null) {
                this.listener = new Spatializer$OnSpatializerStateChangedListener() { // from class: androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SpatializerWrapperV32.1
                    public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
                        defaultTrackSelector.maybeInvalidateForAudioChannelCountConstraints();
                    }

                    public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
                        defaultTrackSelector.maybeInvalidateForAudioChannelCountConstraints();
                    }
                };
                Handler handler = new Handler(looper);
                this.handler = handler;
                Spatializer spatializer = this.spatializer;
                Objects.requireNonNull(handler);
                spatializer.addOnSpatializerStateChangedListener(new androidx.emoji2.text.a(handler), this.listener);
            }
        }

        public boolean isAvailable() {
            return this.spatializer.isAvailable();
        }

        public boolean isEnabled() {
            return this.spatializer.isEnabled();
        }

        public boolean isSpatializationSupported() {
            return this.spatializationSupported;
        }

        public void release() {
            Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener = this.listener;
            if (spatializer$OnSpatializerStateChangedListener == null || this.handler == null) {
                return;
            }
            this.spatializer.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
            ((Handler) Util.castNonNull(this.handler)).removeCallbacksAndMessages(null);
            this.handler = null;
            this.listener = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class TextTrackInfo extends TrackInfo<TextTrackInfo> implements Comparable<TextTrackInfo> {
        private final boolean hasCaptionRoleFlags;
        private final boolean isDefault;
        private final boolean isForced;
        private final boolean isWithinRendererCapabilities;
        private final int preferredLanguageIndex;
        private final int preferredLanguageScore;
        private final int preferredRoleFlagsScore;
        private final int selectedAudioLanguageScore;
        private final int selectionEligibility;

        public TextTrackInfo(int i10, TrackGroup trackGroup, int i11, Parameters parameters, int i12, @Nullable String str) {
            int formatLanguageScore;
            super(i10, trackGroup, i11);
            int i13 = 0;
            this.isWithinRendererCapabilities = v2.n(i12, false);
            int i14 = this.format.selectionFlags & (~parameters.ignoredTextSelectionFlags);
            this.isDefault = (i14 & 1) != 0;
            this.isForced = (i14 & 2) != 0;
            ImmutableList<String> immutableListOf = parameters.preferredTextLanguages.isEmpty() ? ImmutableList.of("") : parameters.preferredTextLanguages;
            int i15 = 0;
            while (true) {
                if (i15 >= immutableListOf.size()) {
                    i15 = Integer.MAX_VALUE;
                    formatLanguageScore = 0;
                    break;
                } else {
                    formatLanguageScore = DefaultTrackSelector.getFormatLanguageScore(this.format, immutableListOf.get(i15), parameters.selectUndeterminedTextLanguage);
                    if (formatLanguageScore > 0) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
            this.preferredLanguageIndex = i15;
            this.preferredLanguageScore = formatLanguageScore;
            int roleFlagMatchScore = DefaultTrackSelector.getRoleFlagMatchScore(this.format.roleFlags, parameters.preferredTextRoleFlags);
            this.preferredRoleFlagsScore = roleFlagMatchScore;
            this.hasCaptionRoleFlags = (this.format.roleFlags & 1088) != 0;
            int formatLanguageScore2 = DefaultTrackSelector.getFormatLanguageScore(this.format, str, DefaultTrackSelector.normalizeUndeterminedLanguageToNull(str) == null);
            this.selectedAudioLanguageScore = formatLanguageScore2;
            boolean z10 = formatLanguageScore > 0 || (parameters.preferredTextLanguages.isEmpty() && roleFlagMatchScore > 0) || this.isDefault || (this.isForced && formatLanguageScore2 > 0);
            if (v2.n(i12, parameters.exceedRendererCapabilitiesIfNecessary) && z10) {
                i13 = 1;
            }
            this.selectionEligibility = i13;
        }

        public static int compareSelections(List<TextTrackInfo> list, List<TextTrackInfo> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        public static ImmutableList<TextTrackInfo> createForTrackGroup(int i10, TrackGroup trackGroup, Parameters parameters, int[] iArr, @Nullable String str) {
            ImmutableList.Builder builder = ImmutableList.builder();
            for (int i11 = 0; i11 < trackGroup.length; i11++) {
                builder.add(new TextTrackInfo(i10, trackGroup, i11, parameters, iArr[i11], str));
            }
            return builder.build();
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public int getSelectionEligibility() {
            return this.selectionEligibility;
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public boolean isCompatibleForAdaptationWith(TextTrackInfo textTrackInfo) {
            return false;
        }

        @Override // java.lang.Comparable
        public int compareTo(TextTrackInfo textTrackInfo) {
            ComparisonChain comparisonChainCompare = ComparisonChain.start().compareFalseFirst(this.isWithinRendererCapabilities, textTrackInfo.isWithinRendererCapabilities).compare(Integer.valueOf(this.preferredLanguageIndex), Integer.valueOf(textTrackInfo.preferredLanguageIndex), Ordering.natural().reverse()).compare(this.preferredLanguageScore, textTrackInfo.preferredLanguageScore).compare(this.preferredRoleFlagsScore, textTrackInfo.preferredRoleFlagsScore).compareFalseFirst(this.isDefault, textTrackInfo.isDefault).compare(Boolean.valueOf(this.isForced), Boolean.valueOf(textTrackInfo.isForced), this.preferredLanguageScore == 0 ? Ordering.natural() : Ordering.natural().reverse()).compare(this.selectedAudioLanguageScore, textTrackInfo.selectedAudioLanguageScore);
            if (this.preferredRoleFlagsScore == 0) {
                comparisonChainCompare = comparisonChainCompare.compareTrueFirst(this.hasCaptionRoleFlags, textTrackInfo.hasCaptionRoleFlags);
            }
            return comparisonChainCompare.result();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static abstract class TrackInfo<T extends TrackInfo<T>> {
        public final Format format;
        public final int rendererIndex;
        public final TrackGroup trackGroup;
        public final int trackIndex;

        public interface Factory<T extends TrackInfo<T>> {
            List<T> create(int i10, TrackGroup trackGroup, int[] iArr);
        }

        public TrackInfo(int i10, TrackGroup trackGroup, int i11) {
            this.rendererIndex = i10;
            this.trackGroup = trackGroup;
            this.trackIndex = i11;
            this.format = trackGroup.getFormat(i11);
        }

        public abstract int getSelectionEligibility();

        public abstract boolean isCompatibleForAdaptationWith(T t10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class VideoTrackInfo extends TrackInfo<VideoTrackInfo> {
        private static final float MIN_REASONABLE_FRAME_RATE = 10.0f;
        private final boolean allowMixedMimeTypes;
        private final int bitrate;
        private final int codecPreferenceScore;
        private final boolean hasMainOrNoRoleFlag;
        private final boolean hasReasonableFrameRate;
        private final boolean isWithinMaxConstraints;
        private final boolean isWithinMinConstraints;
        private final boolean isWithinRendererCapabilities;
        private final Parameters parameters;
        private final int pixelCount;
        private final int preferredMimeTypeMatchIndex;
        private final int preferredRoleFlagsScore;
        private final int selectionEligibility;
        private final boolean usesHardwareAcceleration;
        private final boolean usesPrimaryDecoder;

        /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0079  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public VideoTrackInfo(int r5, androidx.media3.common.TrackGroup r6, int r7, androidx.media3.exoplayer.trackselection.DefaultTrackSelector.Parameters r8, int r9, int r10, boolean r11) {
            /*
                Method dump skipped, instruction units count: 263
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.trackselection.DefaultTrackSelector.VideoTrackInfo.<init>(int, androidx.media3.common.TrackGroup, int, androidx.media3.exoplayer.trackselection.DefaultTrackSelector$Parameters, int, int, boolean):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int compareNonQualityPreferences(VideoTrackInfo videoTrackInfo, VideoTrackInfo videoTrackInfo2) {
            ComparisonChain comparisonChainCompareFalseFirst = ComparisonChain.start().compareFalseFirst(videoTrackInfo.isWithinRendererCapabilities, videoTrackInfo2.isWithinRendererCapabilities).compare(videoTrackInfo.preferredRoleFlagsScore, videoTrackInfo2.preferredRoleFlagsScore).compareFalseFirst(videoTrackInfo.hasMainOrNoRoleFlag, videoTrackInfo2.hasMainOrNoRoleFlag).compareFalseFirst(videoTrackInfo.hasReasonableFrameRate, videoTrackInfo2.hasReasonableFrameRate).compareFalseFirst(videoTrackInfo.isWithinMaxConstraints, videoTrackInfo2.isWithinMaxConstraints).compareFalseFirst(videoTrackInfo.isWithinMinConstraints, videoTrackInfo2.isWithinMinConstraints).compare(Integer.valueOf(videoTrackInfo.preferredMimeTypeMatchIndex), Integer.valueOf(videoTrackInfo2.preferredMimeTypeMatchIndex), Ordering.natural().reverse()).compareFalseFirst(videoTrackInfo.usesPrimaryDecoder, videoTrackInfo2.usesPrimaryDecoder).compareFalseFirst(videoTrackInfo.usesHardwareAcceleration, videoTrackInfo2.usesHardwareAcceleration);
            if (videoTrackInfo.usesPrimaryDecoder && videoTrackInfo.usesHardwareAcceleration) {
                comparisonChainCompareFalseFirst = comparisonChainCompareFalseFirst.compare(videoTrackInfo.codecPreferenceScore, videoTrackInfo2.codecPreferenceScore);
            }
            return comparisonChainCompareFalseFirst.result();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int compareQualityPreferences(VideoTrackInfo videoTrackInfo, VideoTrackInfo videoTrackInfo2) {
            Ordering orderingReverse = (videoTrackInfo.isWithinMaxConstraints && videoTrackInfo.isWithinRendererCapabilities) ? DefaultTrackSelector.FORMAT_VALUE_ORDERING : DefaultTrackSelector.FORMAT_VALUE_ORDERING.reverse();
            ComparisonChain comparisonChainStart = ComparisonChain.start();
            if (videoTrackInfo.parameters.forceLowestBitrate) {
                comparisonChainStart = comparisonChainStart.compare(Integer.valueOf(videoTrackInfo.bitrate), Integer.valueOf(videoTrackInfo2.bitrate), DefaultTrackSelector.FORMAT_VALUE_ORDERING.reverse());
            }
            return comparisonChainStart.compare(Integer.valueOf(videoTrackInfo.pixelCount), Integer.valueOf(videoTrackInfo2.pixelCount), orderingReverse).compare(Integer.valueOf(videoTrackInfo.bitrate), Integer.valueOf(videoTrackInfo2.bitrate), orderingReverse).result();
        }

        public static int compareSelections(List<VideoTrackInfo> list, List<VideoTrackInfo> list2) {
            return ComparisonChain.start().compare((VideoTrackInfo) Collections.max(list, new Comparator() { // from class: androidx.media3.exoplayer.trackselection.w
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return DefaultTrackSelector.VideoTrackInfo.compareNonQualityPreferences((DefaultTrackSelector.VideoTrackInfo) obj, (DefaultTrackSelector.VideoTrackInfo) obj2);
                }
            }), (VideoTrackInfo) Collections.max(list2, new Comparator() { // from class: androidx.media3.exoplayer.trackselection.w
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return DefaultTrackSelector.VideoTrackInfo.compareNonQualityPreferences((DefaultTrackSelector.VideoTrackInfo) obj, (DefaultTrackSelector.VideoTrackInfo) obj2);
                }
            }), new Comparator() { // from class: androidx.media3.exoplayer.trackselection.w
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return DefaultTrackSelector.VideoTrackInfo.compareNonQualityPreferences((DefaultTrackSelector.VideoTrackInfo) obj, (DefaultTrackSelector.VideoTrackInfo) obj2);
                }
            }).compare(list.size(), list2.size()).compare((VideoTrackInfo) Collections.max(list, new Comparator() { // from class: androidx.media3.exoplayer.trackselection.x
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return DefaultTrackSelector.VideoTrackInfo.compareQualityPreferences((DefaultTrackSelector.VideoTrackInfo) obj, (DefaultTrackSelector.VideoTrackInfo) obj2);
                }
            }), (VideoTrackInfo) Collections.max(list2, new Comparator() { // from class: androidx.media3.exoplayer.trackselection.x
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return DefaultTrackSelector.VideoTrackInfo.compareQualityPreferences((DefaultTrackSelector.VideoTrackInfo) obj, (DefaultTrackSelector.VideoTrackInfo) obj2);
                }
            }), new Comparator() { // from class: androidx.media3.exoplayer.trackselection.x
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return DefaultTrackSelector.VideoTrackInfo.compareQualityPreferences((DefaultTrackSelector.VideoTrackInfo) obj, (DefaultTrackSelector.VideoTrackInfo) obj2);
                }
            }).result();
        }

        public static ImmutableList<VideoTrackInfo> createForTrackGroup(int i10, TrackGroup trackGroup, Parameters parameters, int[] iArr, int i11) {
            int maxVideoPixelsToRetainForViewport = DefaultTrackSelector.getMaxVideoPixelsToRetainForViewport(trackGroup, parameters.viewportWidth, parameters.viewportHeight, parameters.viewportOrientationMayChange);
            ImmutableList.Builder builder = ImmutableList.builder();
            for (int i12 = 0; i12 < trackGroup.length; i12++) {
                int pixelCount = trackGroup.getFormat(i12).getPixelCount();
                builder.add(new VideoTrackInfo(i10, trackGroup, i12, parameters, iArr[i12], i11, maxVideoPixelsToRetainForViewport == Integer.MAX_VALUE || (pixelCount != -1 && pixelCount <= maxVideoPixelsToRetainForViewport)));
            }
            return builder.build();
        }

        private int evaluateSelectionEligibility(int i10, int i11) {
            if ((this.format.roleFlags & 16384) != 0 || !v2.n(i10, this.parameters.exceedRendererCapabilitiesIfNecessary)) {
                return 0;
            }
            if (!this.isWithinMaxConstraints && !this.parameters.exceedVideoConstraintsIfNecessary) {
                return 0;
            }
            if (!v2.n(i10, false) || !this.isWithinMinConstraints || !this.isWithinMaxConstraints || this.format.bitrate == -1) {
                return 1;
            }
            Parameters parameters = this.parameters;
            return (parameters.forceHighestSupportedBitrate || parameters.forceLowestBitrate || (i10 & i11) == 0) ? 1 : 2;
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public int getSelectionEligibility() {
            return this.selectionEligibility;
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public boolean isCompatibleForAdaptationWith(VideoTrackInfo videoTrackInfo) {
            if (!this.allowMixedMimeTypes && !Util.areEqual(this.format.sampleMimeType, videoTrackInfo.format.sampleMimeType)) {
                return false;
            }
            if (this.parameters.allowVideoMixedDecoderSupportAdaptiveness) {
                return true;
            }
            return this.usesPrimaryDecoder == videoTrackInfo.usesPrimaryDecoder && this.usesHardwareAcceleration == videoTrackInfo.usesHardwareAcceleration;
        }
    }

    public DefaultTrackSelector(Context context) {
        this(context, new AdaptiveTrackSelection.Factory());
    }

    private static void applyLegacyRendererOverrides(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, Parameters parameters, ExoTrackSelection.Definition[] definitionArr) {
        int rendererCount = mappedTrackInfo.getRendererCount();
        for (int i10 = 0; i10 < rendererCount; i10++) {
            TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(i10);
            if (parameters.hasSelectionOverride(i10, trackGroups)) {
                SelectionOverride selectionOverride = parameters.getSelectionOverride(i10, trackGroups);
                definitionArr[i10] = (selectionOverride == null || selectionOverride.tracks.length == 0) ? null : new ExoTrackSelection.Definition(trackGroups.get(selectionOverride.groupIndex), selectionOverride.tracks, selectionOverride.type);
            }
        }
    }

    private static void applyTrackSelectionOverrides(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, TrackSelectionParameters trackSelectionParameters, ExoTrackSelection.Definition[] definitionArr) {
        int rendererCount = mappedTrackInfo.getRendererCount();
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < rendererCount; i10++) {
            collectTrackSelectionOverrides(mappedTrackInfo.getTrackGroups(i10), trackSelectionParameters, map);
        }
        collectTrackSelectionOverrides(mappedTrackInfo.getUnmappedTrackGroups(), trackSelectionParameters, map);
        for (int i11 = 0; i11 < rendererCount; i11++) {
            TrackSelectionOverride trackSelectionOverride = (TrackSelectionOverride) map.get(Integer.valueOf(mappedTrackInfo.getRendererType(i11)));
            if (trackSelectionOverride != null) {
                definitionArr[i11] = (trackSelectionOverride.trackIndices.isEmpty() || mappedTrackInfo.getTrackGroups(i11).indexOf(trackSelectionOverride.mediaTrackGroup) == -1) ? null : new ExoTrackSelection.Definition(trackSelectionOverride.mediaTrackGroup, Ints.toArray(trackSelectionOverride.trackIndices));
            }
        }
    }

    public static /* synthetic */ List c(final DefaultTrackSelector defaultTrackSelector, Parameters parameters, boolean z10, int[] iArr, int i10, TrackGroup trackGroup, int[] iArr2) {
        defaultTrackSelector.getClass();
        return AudioTrackInfo.createForTrackGroup(i10, trackGroup, parameters, iArr2, z10, new Predicate() { // from class: androidx.media3.exoplayer.trackselection.c
            @Override // com.google.common.base.Predicate
            public final boolean apply(Object obj) {
                return this.f5213b.isAudioFormatWithinAudioChannelCountConstraints((Format) obj);
            }
        }, iArr[i10]);
    }

    private static void collectTrackSelectionOverrides(TrackGroupArray trackGroupArray, TrackSelectionParameters trackSelectionParameters, Map<Integer, TrackSelectionOverride> map) {
        TrackSelectionOverride trackSelectionOverride;
        for (int i10 = 0; i10 < trackGroupArray.length; i10++) {
            TrackSelectionOverride trackSelectionOverride2 = trackSelectionParameters.overrides.get(trackGroupArray.get(i10));
            if (trackSelectionOverride2 != null && ((trackSelectionOverride = map.get(Integer.valueOf(trackSelectionOverride2.getType()))) == null || (trackSelectionOverride.trackIndices.isEmpty() && !trackSelectionOverride2.trackIndices.isEmpty()))) {
                map.put(Integer.valueOf(trackSelectionOverride2.getType()), trackSelectionOverride2);
            }
        }
    }

    public static /* synthetic */ int e(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    protected static int getFormatLanguageScore(Format format, @Nullable String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(format.language)) {
            return 4;
        }
        String strNormalizeUndeterminedLanguageToNull = normalizeUndeterminedLanguageToNull(str);
        String strNormalizeUndeterminedLanguageToNull2 = normalizeUndeterminedLanguageToNull(format.language);
        if (strNormalizeUndeterminedLanguageToNull2 == null || strNormalizeUndeterminedLanguageToNull == null) {
            return (z10 && strNormalizeUndeterminedLanguageToNull2 == null) ? 1 : 0;
        }
        if (strNormalizeUndeterminedLanguageToNull2.startsWith(strNormalizeUndeterminedLanguageToNull) || strNormalizeUndeterminedLanguageToNull.startsWith(strNormalizeUndeterminedLanguageToNull2)) {
            return 3;
        }
        return Util.splitAtFirst(strNormalizeUndeterminedLanguageToNull2, TokenBuilder.TOKEN_DELIMITER)[0].equals(Util.splitAtFirst(strNormalizeUndeterminedLanguageToNull, TokenBuilder.TOKEN_DELIMITER)[0]) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getMaxVideoPixelsToRetainForViewport(TrackGroup trackGroup, int i10, int i11, boolean z10) {
        int i12;
        int i13 = Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE && i11 != Integer.MAX_VALUE) {
            for (int i14 = 0; i14 < trackGroup.length; i14++) {
                Format format = trackGroup.getFormat(i14);
                int i15 = format.width;
                if (i15 > 0 && (i12 = format.height) > 0) {
                    Point maxVideoSizeInViewport = getMaxVideoSizeInViewport(z10, i10, i11, i15, i12);
                    int i16 = format.width;
                    int i17 = format.height;
                    int i18 = i16 * i17;
                    if (i16 >= ((int) (maxVideoSizeInViewport.x * FRACTION_TO_CONSIDER_FULLSCREEN)) && i17 >= ((int) (maxVideoSizeInViewport.y * FRACTION_TO_CONSIDER_FULLSCREEN)) && i18 < i13) {
                        i13 = i18;
                    }
                }
            }
        }
        return i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Point getMaxVideoSizeInViewport(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto Lf
            r3 = 0
            r0 = 1
            if (r6 <= r7) goto L8
            r1 = r0
            goto L9
        L8:
            r1 = r3
        L9:
            if (r4 <= r5) goto Lc
            r3 = r0
        Lc:
            if (r1 == r3) goto Lf
            goto L12
        Lf:
            r2 = r5
            r5 = r4
            r4 = r2
        L12:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L22
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = androidx.media3.common.util.Util.ceilDivide(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L22:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = androidx.media3.common.util.Util.ceilDivide(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.trackselection.DefaultTrackSelector.getMaxVideoSizeInViewport(boolean, int, int, int, int):android.graphics.Point");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getRoleFlagMatchScore(int i10, int i11) {
        if (i10 == 0 || i10 != i11) {
            return Integer.bitCount(i10 & i11);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getVideoCodecPreferenceScore(@Nullable String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isAudioFormatWithinAudioChannelCountConstraints(Format format) {
        boolean z10;
        SpatializerWrapperV32 spatializerWrapperV32;
        SpatializerWrapperV32 spatializerWrapperV322;
        synchronized (this.lock) {
            try {
                if (this.parameters.constrainAudioChannelCountToDeviceCapabilities && !this.deviceIsTV && format.channelCount > 2 && (!isDolbyAudio(format) || (Util.SDK_INT >= 32 && (spatializerWrapperV322 = this.spatializer) != null && spatializerWrapperV322.isSpatializationSupported()))) {
                    z10 = Util.SDK_INT >= 32 && (spatializerWrapperV32 = this.spatializer) != null && spatializerWrapperV32.isSpatializationSupported() && this.spatializer.isAvailable() && this.spatializer.isEnabled() && this.spatializer.canBeSpatialized(this.audioAttributes, format);
                }
            } finally {
            }
        }
        return z10;
    }

    private static boolean isDolbyAudio(Format format) {
        String str = format.sampleMimeType;
        if (str == null) {
            return false;
        }
        str.getClass();
        switch (str) {
        }
        return false;
    }

    @Deprecated
    protected static boolean isSupported(int i10, boolean z10) {
        return v2.n(i10, z10);
    }

    private static void maybeConfigureRendererForOffload(Parameters parameters, MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, RendererConfiguration[] rendererConfigurationArr, ExoTrackSelection[] exoTrackSelectionArr) {
        int i10 = -1;
        boolean z10 = false;
        int i11 = 0;
        for (int i12 = 0; i12 < mappedTrackInfo.getRendererCount(); i12++) {
            int rendererType = mappedTrackInfo.getRendererType(i12);
            ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i12];
            if (rendererType != 1 && exoTrackSelection != null) {
                return;
            }
            if (rendererType == 1 && exoTrackSelection != null && exoTrackSelection.length() == 1) {
                if (rendererSupportsOffload(parameters, iArr[i12][mappedTrackInfo.getTrackGroups(i12).indexOf(exoTrackSelection.getTrackGroup())][exoTrackSelection.getIndexInTrackGroup(0)], exoTrackSelection.getSelectedFormat())) {
                    i11++;
                    i10 = i12;
                }
            }
        }
        if (i11 == 1) {
            int i13 = parameters.audioOffloadPreferences.isGaplessSupportRequired ? 1 : 2;
            RendererConfiguration rendererConfiguration = rendererConfigurationArr[i10];
            if (rendererConfiguration != null && rendererConfiguration.tunneling) {
                z10 = true;
            }
            rendererConfigurationArr[i10] = new RendererConfiguration(i13, z10);
        }
    }

    private static void maybeConfigureRenderersForTunneling(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, RendererConfiguration[] rendererConfigurationArr, ExoTrackSelection[] exoTrackSelectionArr) {
        boolean z10;
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < mappedTrackInfo.getRendererCount(); i12++) {
            int rendererType = mappedTrackInfo.getRendererType(i12);
            ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i12];
            if ((rendererType == 1 || rendererType == 2) && exoTrackSelection != null && rendererSupportsTunneling(iArr[i12], mappedTrackInfo.getTrackGroups(i12), exoTrackSelection)) {
                if (rendererType == 1) {
                    if (i11 != -1) {
                        z10 = false;
                        break;
                    }
                    i11 = i12;
                } else {
                    if (i10 != -1) {
                        z10 = false;
                        break;
                    }
                    i10 = i12;
                }
            }
        }
        z10 = true;
        if (z10 && ((i11 == -1 || i10 == -1) ? false : true)) {
            RendererConfiguration rendererConfiguration = new RendererConfiguration(0, true);
            rendererConfigurationArr[i11] = rendererConfiguration;
            rendererConfigurationArr[i10] = rendererConfiguration;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeInvalidateForAudioChannelCountConstraints() {
        boolean z10;
        SpatializerWrapperV32 spatializerWrapperV32;
        synchronized (this.lock) {
            try {
                z10 = this.parameters.constrainAudioChannelCountToDeviceCapabilities && !this.deviceIsTV && Util.SDK_INT >= 32 && (spatializerWrapperV32 = this.spatializer) != null && spatializerWrapperV32.isSpatializationSupported();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            invalidate();
        }
    }

    private void maybeInvalidateForRendererCapabilitiesChange(Renderer renderer) {
        boolean z10;
        synchronized (this.lock) {
            z10 = this.parameters.allowInvalidateSelectionsOnRendererCapabilitiesChange;
        }
        if (z10) {
            invalidateForRendererCapabilitiesChange(renderer);
        }
    }

    @Nullable
    protected static String normalizeUndeterminedLanguageToNull(@Nullable String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean rendererSupportsOffload(Parameters parameters, int i10, Format format) {
        if (v2.i(i10) == 0) {
            return false;
        }
        if (parameters.audioOffloadPreferences.isSpeedChangeSupportRequired && (v2.i(i10) & 2048) == 0) {
            return false;
        }
        if (parameters.audioOffloadPreferences.isGaplessSupportRequired) {
            boolean z10 = (format.encoderDelay == 0 && format.encoderPadding == 0) ? false : true;
            boolean z11 = (v2.i(i10) & 1024) != 0;
            if (z10 && !z11) {
                return false;
            }
        }
        return true;
    }

    private static boolean rendererSupportsTunneling(int[][] iArr, TrackGroupArray trackGroupArray, ExoTrackSelection exoTrackSelection) {
        if (exoTrackSelection == null) {
            return false;
        }
        int iIndexOf = trackGroupArray.indexOf(exoTrackSelection.getTrackGroup());
        for (int i10 = 0; i10 < exoTrackSelection.length(); i10++) {
            if (v2.m(iArr[iIndexOf][exoTrackSelection.getIndexInTrackGroup(i10)]) != 32) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    private <T extends TrackInfo<T>> Pair<ExoTrackSelection.Definition, Integer> selectTracksForType(int i10, MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, TrackInfo.Factory<T> factory, Comparator<List<T>> comparator) {
        int i11;
        RandomAccess randomAccessOf;
        MappingTrackSelector.MappedTrackInfo mappedTrackInfo2 = mappedTrackInfo;
        ArrayList arrayList = new ArrayList();
        int rendererCount = mappedTrackInfo2.getRendererCount();
        int i12 = 0;
        while (i12 < rendererCount) {
            if (i10 == mappedTrackInfo2.getRendererType(i12)) {
                TrackGroupArray trackGroups = mappedTrackInfo2.getTrackGroups(i12);
                for (int i13 = 0; i13 < trackGroups.length; i13++) {
                    TrackGroup trackGroup = trackGroups.get(i13);
                    List<T> listCreate = factory.create(i12, trackGroup, iArr[i12][i13]);
                    boolean[] zArr = new boolean[trackGroup.length];
                    int i14 = 0;
                    while (i14 < trackGroup.length) {
                        T t10 = listCreate.get(i14);
                        int selectionEligibility = t10.getSelectionEligibility();
                        if (zArr[i14] || selectionEligibility == 0) {
                            i11 = rendererCount;
                        } else {
                            if (selectionEligibility == 1) {
                                randomAccessOf = ImmutableList.of(t10);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(t10);
                                int i15 = i14 + 1;
                                while (i15 < trackGroup.length) {
                                    T t11 = listCreate.get(i15);
                                    int i16 = rendererCount;
                                    if (t11.getSelectionEligibility() == 2 && t10.isCompatibleForAdaptationWith(t11)) {
                                        arrayList2.add(t11);
                                        zArr[i15] = true;
                                    }
                                    i15++;
                                    rendererCount = i16;
                                }
                                randomAccessOf = arrayList2;
                            }
                            i11 = rendererCount;
                            arrayList.add(randomAccessOf);
                        }
                        i14++;
                        rendererCount = i11;
                    }
                }
            }
            i12++;
            mappedTrackInfo2 = mappedTrackInfo;
            rendererCount = rendererCount;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i17 = 0; i17 < list.size(); i17++) {
            iArr2[i17] = ((TrackInfo) list.get(i17)).trackIndex;
        }
        TrackInfo trackInfo = (TrackInfo) list.get(0);
        return Pair.create(new ExoTrackSelection.Definition(trackInfo.trackGroup, iArr2), Integer.valueOf(trackInfo.rendererIndex));
    }

    private void setParametersInternal(Parameters parameters) {
        boolean zEquals;
        Assertions.checkNotNull(parameters);
        synchronized (this.lock) {
            zEquals = this.parameters.equals(parameters);
            this.parameters = parameters;
        }
        if (zEquals) {
            return;
        }
        if (parameters.constrainAudioChannelCountToDeviceCapabilities && this.context == null) {
            Log.w(TAG, AUDIO_CHANNEL_COUNT_CONSTRAINTS_WARN_MESSAGE);
        }
        invalidate();
    }

    public Parameters.Builder buildUponParameters() {
        return getParameters().buildUpon();
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    @Nullable
    public RendererCapabilities.Listener getRendererCapabilitiesListener() {
        return this;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public boolean isSetParametersSupported() {
        return true;
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities.Listener
    public void onRendererCapabilitiesChanged(Renderer renderer) {
        maybeInvalidateForRendererCapabilitiesChange(renderer);
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public void release() {
        SpatializerWrapperV32 spatializerWrapperV32;
        synchronized (this.lock) {
            try {
                if (Util.SDK_INT >= 32 && (spatializerWrapperV32 = this.spatializer) != null) {
                    spatializerWrapperV32.release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        super.release();
    }

    protected ExoTrackSelection.Definition[] selectAllTracks(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, Parameters parameters) throws ExoPlaybackException {
        int rendererCount = mappedTrackInfo.getRendererCount();
        ExoTrackSelection.Definition[] definitionArr = new ExoTrackSelection.Definition[rendererCount];
        Pair<ExoTrackSelection.Definition, Integer> pairSelectVideoTrack = selectVideoTrack(mappedTrackInfo, iArr, iArr2, parameters);
        String str = null;
        Pair<ExoTrackSelection.Definition, Integer> pairSelectImageTrack = (parameters.isPrioritizeImageOverVideoEnabled || pairSelectVideoTrack == null) ? selectImageTrack(mappedTrackInfo, iArr, parameters) : null;
        if (pairSelectImageTrack != null) {
            definitionArr[((Integer) pairSelectImageTrack.second).intValue()] = (ExoTrackSelection.Definition) pairSelectImageTrack.first;
        } else if (pairSelectVideoTrack != null) {
            definitionArr[((Integer) pairSelectVideoTrack.second).intValue()] = (ExoTrackSelection.Definition) pairSelectVideoTrack.first;
        }
        Pair<ExoTrackSelection.Definition, Integer> pairSelectAudioTrack = selectAudioTrack(mappedTrackInfo, iArr, iArr2, parameters);
        if (pairSelectAudioTrack != null) {
            definitionArr[((Integer) pairSelectAudioTrack.second).intValue()] = (ExoTrackSelection.Definition) pairSelectAudioTrack.first;
        }
        if (pairSelectAudioTrack != null) {
            Object obj = pairSelectAudioTrack.first;
            str = ((ExoTrackSelection.Definition) obj).group.getFormat(((ExoTrackSelection.Definition) obj).tracks[0]).language;
        }
        Pair<ExoTrackSelection.Definition, Integer> pairSelectTextTrack = selectTextTrack(mappedTrackInfo, iArr, parameters, str);
        if (pairSelectTextTrack != null) {
            definitionArr[((Integer) pairSelectTextTrack.second).intValue()] = (ExoTrackSelection.Definition) pairSelectTextTrack.first;
        }
        for (int i10 = 0; i10 < rendererCount; i10++) {
            int rendererType = mappedTrackInfo.getRendererType(i10);
            if (rendererType != 2 && rendererType != 1 && rendererType != 3 && rendererType != 4) {
                definitionArr[i10] = selectOtherTrack(rendererType, mappedTrackInfo.getTrackGroups(i10), iArr[i10], parameters);
            }
        }
        return definitionArr;
    }

    @Nullable
    protected Pair<ExoTrackSelection.Definition, Integer> selectAudioTrack(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, final int[] iArr2, final Parameters parameters) throws ExoPlaybackException {
        final boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < mappedTrackInfo.getRendererCount()) {
                if (2 == mappedTrackInfo.getRendererType(i10) && mappedTrackInfo.getTrackGroups(i10).length > 0) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                break;
            }
        }
        return selectTracksForType(1, mappedTrackInfo, iArr, new TrackInfo.Factory() { // from class: androidx.media3.exoplayer.trackselection.f
            @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory
            public final List create(int i11, TrackGroup trackGroup, int[] iArr3) {
                return DefaultTrackSelector.c(this.f5215a, parameters, z10, iArr2, i11, trackGroup, iArr3);
            }
        }, new Comparator() { // from class: androidx.media3.exoplayer.trackselection.g
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return DefaultTrackSelector.AudioTrackInfo.compareSelections((List) obj, (List) obj2);
            }
        });
    }

    @Nullable
    protected Pair<ExoTrackSelection.Definition, Integer> selectImageTrack(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, final Parameters parameters) throws ExoPlaybackException {
        if (parameters.audioOffloadPreferences.audioOffloadMode == 2) {
            return null;
        }
        return selectTracksForType(4, mappedTrackInfo, iArr, new TrackInfo.Factory() { // from class: androidx.media3.exoplayer.trackselection.d
            @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory
            public final List create(int i10, TrackGroup trackGroup, int[] iArr2) {
                return DefaultTrackSelector.ImageTrackInfo.createForTrackGroup(i10, trackGroup, parameters, iArr2);
            }
        }, new Comparator() { // from class: androidx.media3.exoplayer.trackselection.e
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return DefaultTrackSelector.ImageTrackInfo.compareSelections((List) obj, (List) obj2);
            }
        });
    }

    @Nullable
    protected ExoTrackSelection.Definition selectOtherTrack(int i10, TrackGroupArray trackGroupArray, int[][] iArr, Parameters parameters) throws ExoPlaybackException {
        if (parameters.audioOffloadPreferences.audioOffloadMode == 2) {
            return null;
        }
        int i11 = 0;
        TrackGroup trackGroup = null;
        OtherTrackScore otherTrackScore = null;
        for (int i12 = 0; i12 < trackGroupArray.length; i12++) {
            TrackGroup trackGroup2 = trackGroupArray.get(i12);
            int[] iArr2 = iArr[i12];
            for (int i13 = 0; i13 < trackGroup2.length; i13++) {
                if (v2.n(iArr2[i13], parameters.exceedRendererCapabilitiesIfNecessary)) {
                    OtherTrackScore otherTrackScore2 = new OtherTrackScore(trackGroup2.getFormat(i13), iArr2[i13]);
                    if (otherTrackScore == null || otherTrackScore2.compareTo(otherTrackScore) > 0) {
                        trackGroup = trackGroup2;
                        i11 = i13;
                        otherTrackScore = otherTrackScore2;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new ExoTrackSelection.Definition(trackGroup, i11);
    }

    @Nullable
    protected Pair<ExoTrackSelection.Definition, Integer> selectTextTrack(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, final Parameters parameters, @Nullable final String str) throws ExoPlaybackException {
        if (parameters.audioOffloadPreferences.audioOffloadMode == 2) {
            return null;
        }
        return selectTracksForType(3, mappedTrackInfo, iArr, new TrackInfo.Factory() { // from class: androidx.media3.exoplayer.trackselection.j
            @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory
            public final List create(int i10, TrackGroup trackGroup, int[] iArr2) {
                return DefaultTrackSelector.TextTrackInfo.createForTrackGroup(i10, trackGroup, parameters, iArr2, str);
            }
        }, new Comparator() { // from class: androidx.media3.exoplayer.trackselection.k
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return DefaultTrackSelector.TextTrackInfo.compareSelections((List) obj, (List) obj2);
            }
        });
    }

    @Override // androidx.media3.exoplayer.trackselection.MappingTrackSelector
    protected final Pair<RendererConfiguration[], ExoTrackSelection[]> selectTracks(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) throws ExoPlaybackException {
        Parameters parameters;
        SpatializerWrapperV32 spatializerWrapperV32;
        synchronized (this.lock) {
            try {
                parameters = this.parameters;
                if (parameters.constrainAudioChannelCountToDeviceCapabilities && Util.SDK_INT >= 32 && (spatializerWrapperV32 = this.spatializer) != null) {
                    spatializerWrapperV32.ensureInitialized(this, (Looper) Assertions.checkStateNotNull(Looper.myLooper()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int rendererCount = mappedTrackInfo.getRendererCount();
        ExoTrackSelection.Definition[] definitionArrSelectAllTracks = selectAllTracks(mappedTrackInfo, iArr, iArr2, parameters);
        applyTrackSelectionOverrides(mappedTrackInfo, parameters, definitionArrSelectAllTracks);
        applyLegacyRendererOverrides(mappedTrackInfo, parameters, definitionArrSelectAllTracks);
        for (int i10 = 0; i10 < rendererCount; i10++) {
            int rendererType = mappedTrackInfo.getRendererType(i10);
            if (parameters.getRendererDisabled(i10) || parameters.disabledTrackTypes.contains(Integer.valueOf(rendererType))) {
                definitionArrSelectAllTracks[i10] = null;
            }
        }
        ExoTrackSelection[] exoTrackSelectionArrCreateTrackSelections = this.trackSelectionFactory.createTrackSelections(definitionArrSelectAllTracks, getBandwidthMeter(), mediaPeriodId, timeline);
        RendererConfiguration[] rendererConfigurationArr = new RendererConfiguration[rendererCount];
        for (int i11 = 0; i11 < rendererCount; i11++) {
            rendererConfigurationArr[i11] = (parameters.getRendererDisabled(i11) || parameters.disabledTrackTypes.contains(Integer.valueOf(mappedTrackInfo.getRendererType(i11))) || (mappedTrackInfo.getRendererType(i11) != -2 && exoTrackSelectionArrCreateTrackSelections[i11] == null)) ? null : RendererConfiguration.DEFAULT;
        }
        if (parameters.tunnelingEnabled) {
            maybeConfigureRenderersForTunneling(mappedTrackInfo, iArr, rendererConfigurationArr, exoTrackSelectionArrCreateTrackSelections);
        }
        if (parameters.audioOffloadPreferences.audioOffloadMode != 0) {
            maybeConfigureRendererForOffload(parameters, mappedTrackInfo, iArr, rendererConfigurationArr, exoTrackSelectionArrCreateTrackSelections);
        }
        return Pair.create(rendererConfigurationArr, exoTrackSelectionArrCreateTrackSelections);
    }

    @Nullable
    protected Pair<ExoTrackSelection.Definition, Integer> selectVideoTrack(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, final int[] iArr2, final Parameters parameters) throws ExoPlaybackException {
        if (parameters.audioOffloadPreferences.audioOffloadMode == 2) {
            return null;
        }
        return selectTracksForType(2, mappedTrackInfo, iArr, new TrackInfo.Factory() { // from class: androidx.media3.exoplayer.trackselection.h
            @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory
            public final List create(int i10, TrackGroup trackGroup, int[] iArr3) {
                return DefaultTrackSelector.VideoTrackInfo.createForTrackGroup(i10, trackGroup, parameters, iArr3, iArr2[i10]);
            }
        }, new Comparator() { // from class: androidx.media3.exoplayer.trackselection.i
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return DefaultTrackSelector.VideoTrackInfo.compareSelections((List) obj, (List) obj2);
            }
        });
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public void setAudioAttributes(AudioAttributes audioAttributes) {
        boolean zEquals;
        synchronized (this.lock) {
            zEquals = this.audioAttributes.equals(audioAttributes);
            this.audioAttributes = audioAttributes;
        }
        if (zEquals) {
            return;
        }
        maybeInvalidateForAudioChannelCountConstraints();
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public void setParameters(TrackSelectionParameters trackSelectionParameters) {
        if (trackSelectionParameters instanceof Parameters) {
            setParametersInternal((Parameters) trackSelectionParameters);
        }
        setParametersInternal(new Parameters.Builder().set(trackSelectionParameters).build());
    }

    public DefaultTrackSelector(Context context, ExoTrackSelection.Factory factory) {
        this(context, Parameters.getDefaults(context), factory);
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public Parameters getParameters() {
        Parameters parameters;
        synchronized (this.lock) {
            parameters = this.parameters;
        }
        return parameters;
    }

    public DefaultTrackSelector(Context context, TrackSelectionParameters trackSelectionParameters) {
        this(context, trackSelectionParameters, new AdaptiveTrackSelection.Factory());
    }

    @Deprecated
    public DefaultTrackSelector(TrackSelectionParameters trackSelectionParameters, ExoTrackSelection.Factory factory) {
        this(trackSelectionParameters, factory, (Context) null);
    }

    public DefaultTrackSelector(Context context, TrackSelectionParameters trackSelectionParameters, ExoTrackSelection.Factory factory) {
        this(trackSelectionParameters, factory, context);
    }

    @Deprecated
    public void setParameters(ParametersBuilder parametersBuilder) {
        setParametersInternal(parametersBuilder.build());
    }

    private DefaultTrackSelector(TrackSelectionParameters trackSelectionParameters, ExoTrackSelection.Factory factory, @Nullable Context context) {
        this.lock = new Object();
        this.context = context != null ? context.getApplicationContext() : null;
        this.trackSelectionFactory = factory;
        if (trackSelectionParameters instanceof Parameters) {
            this.parameters = (Parameters) trackSelectionParameters;
        } else {
            this.parameters = (context == null ? Parameters.DEFAULT_WITHOUT_CONTEXT : Parameters.getDefaults(context)).buildUpon().set(trackSelectionParameters).build();
        }
        this.audioAttributes = AudioAttributes.DEFAULT;
        boolean z10 = context != null && Util.isTv(context);
        this.deviceIsTV = z10;
        if (!z10 && context != null && Util.SDK_INT >= 32) {
            this.spatializer = SpatializerWrapperV32.tryCreateInstance(context);
        }
        if (this.parameters.constrainAudioChannelCountToDeviceCapabilities && context == null) {
            Log.w(TAG, AUDIO_CHANNEL_COUNT_CONSTRAINTS_WARN_MESSAGE);
        }
    }

    public void setParameters(Parameters.Builder builder) {
        setParametersInternal(builder.build());
    }
}
