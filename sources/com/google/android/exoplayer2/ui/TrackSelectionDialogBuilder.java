package com.google.android.exoplayer2.ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.AlertDialog;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.trackselection.TrackSelectionOverride;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class TrackSelectionDialogBuilder {
    private boolean allowAdaptiveSelections;
    private boolean allowMultipleOverrides;
    private final DialogCallback callback;
    private final Context context;
    private boolean isDisabled;
    private ImmutableMap<TrackGroup, TrackSelectionOverride> overrides;
    private boolean showDisableOption;

    @StyleRes
    private int themeResId;
    private final CharSequence title;

    @Nullable
    private Comparator<Format> trackFormatComparator;
    private final List<Tracks.Group> trackGroups;

    @Nullable
    private TrackNameProvider trackNameProvider;

    public interface DialogCallback {
        void onTracksSelected(boolean z10, Map<TrackGroup, TrackSelectionOverride> map);
    }

    public TrackSelectionDialogBuilder(Context context, CharSequence charSequence, List<Tracks.Group> list, DialogCallback dialogCallback) {
        this.context = context;
        this.title = charSequence;
        this.trackGroups = ImmutableList.copyOf((Collection) list);
        this.callback = dialogCallback;
        this.overrides = ImmutableMap.of();
    }

    public static /* synthetic */ void a(Player player, int i10, boolean z10, Map map) {
        TrackSelectionParameters.Builder builderBuildUpon = player.getTrackSelectionParameters().buildUpon();
        builderBuildUpon.setTrackTypeDisabled(i10, z10);
        builderBuildUpon.clearOverridesOfType(i10);
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            builderBuildUpon.addOverride((TrackSelectionOverride) it.next());
        }
        player.setTrackSelectionParameters(builderBuildUpon.build());
    }

    @Nullable
    private Dialog buildForAndroidX() {
        try {
            Class cls = Integer.TYPE;
            Object objNewInstance = AlertDialog.Builder.class.getConstructor(Context.class, cls).newInstance(this.context, Integer.valueOf(this.themeResId));
            View viewInflate = LayoutInflater.from((Context) AlertDialog.Builder.class.getMethod("getContext", null).invoke(objNewInstance, null)).inflate(R.layout.exo_track_selection_dialog, (ViewGroup) null);
            DialogInterface.OnClickListener upDialogView = setUpDialogView(viewInflate);
            AlertDialog.Builder.class.getMethod("setTitle", CharSequence.class).invoke(objNewInstance, this.title);
            AlertDialog.Builder.class.getMethod("setView", View.class).invoke(objNewInstance, viewInflate);
            AlertDialog.Builder.class.getMethod("setPositiveButton", cls, DialogInterface.OnClickListener.class).invoke(objNewInstance, Integer.valueOf(android.R.string.ok), upDialogView);
            AlertDialog.Builder.class.getMethod("setNegativeButton", cls, DialogInterface.OnClickListener.class).invoke(objNewInstance, Integer.valueOf(android.R.string.cancel), null);
            return (Dialog) AlertDialog.Builder.class.getMethod("create", null).invoke(objNewInstance, null);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    private Dialog buildForPlatform() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.context, this.themeResId);
        View viewInflate = LayoutInflater.from(builder.getContext()).inflate(R.layout.exo_track_selection_dialog, (ViewGroup) null);
        return builder.setTitle(this.title).setView(viewInflate).setPositiveButton(android.R.string.ok, setUpDialogView(viewInflate)).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).create();
    }

    private DialogInterface.OnClickListener setUpDialogView(View view) {
        final TrackSelectionView trackSelectionView = (TrackSelectionView) view.findViewById(R.id.exo_track_selection_view);
        trackSelectionView.setAllowMultipleOverrides(this.allowMultipleOverrides);
        trackSelectionView.setAllowAdaptiveSelections(this.allowAdaptiveSelections);
        trackSelectionView.setShowDisableOption(this.showDisableOption);
        TrackNameProvider trackNameProvider = this.trackNameProvider;
        if (trackNameProvider != null) {
            trackSelectionView.setTrackNameProvider(trackNameProvider);
        }
        trackSelectionView.init(this.trackGroups, this.isDisabled, this.overrides, this.trackFormatComparator, null);
        return new DialogInterface.OnClickListener() { // from class: com.google.android.exoplayer2.ui.k0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                TrackSelectionDialogBuilder trackSelectionDialogBuilder = this.f25175b;
                TrackSelectionView trackSelectionView2 = trackSelectionView;
                trackSelectionDialogBuilder.callback.onTracksSelected(trackSelectionView2.getIsDisabled(), trackSelectionView2.getOverrides());
            }
        };
    }

    public Dialog build() {
        Dialog dialogBuildForAndroidX = buildForAndroidX();
        return dialogBuildForAndroidX == null ? buildForPlatform() : dialogBuildForAndroidX;
    }

    public TrackSelectionDialogBuilder setAllowAdaptiveSelections(boolean z10) {
        this.allowAdaptiveSelections = z10;
        return this;
    }

    public TrackSelectionDialogBuilder setAllowMultipleOverrides(boolean z10) {
        this.allowMultipleOverrides = z10;
        return this;
    }

    public TrackSelectionDialogBuilder setIsDisabled(boolean z10) {
        this.isDisabled = z10;
        return this;
    }

    public TrackSelectionDialogBuilder setOverride(@Nullable TrackSelectionOverride trackSelectionOverride) {
        return setOverrides(trackSelectionOverride == null ? Collections.EMPTY_MAP : ImmutableMap.of(trackSelectionOverride.mediaTrackGroup, trackSelectionOverride));
    }

    public TrackSelectionDialogBuilder setOverrides(Map<TrackGroup, TrackSelectionOverride> map) {
        this.overrides = ImmutableMap.copyOf((Map) map);
        return this;
    }

    public TrackSelectionDialogBuilder setShowDisableOption(boolean z10) {
        this.showDisableOption = z10;
        return this;
    }

    public TrackSelectionDialogBuilder setTheme(@StyleRes int i10) {
        this.themeResId = i10;
        return this;
    }

    public void setTrackFormatComparator(@Nullable Comparator<Format> comparator) {
        this.trackFormatComparator = comparator;
    }

    public TrackSelectionDialogBuilder setTrackNameProvider(@Nullable TrackNameProvider trackNameProvider) {
        this.trackNameProvider = trackNameProvider;
        return this;
    }

    public TrackSelectionDialogBuilder(Context context, CharSequence charSequence, final Player player, final int i10) {
        this.context = context;
        this.title = charSequence;
        ImmutableList<Tracks.Group> groups = player.getCurrentTracks().getGroups();
        this.trackGroups = new ArrayList();
        for (int i11 = 0; i11 < groups.size(); i11++) {
            Tracks.Group group = groups.get(i11);
            if (group.getType() == i10) {
                this.trackGroups.add(group);
            }
        }
        this.overrides = player.getTrackSelectionParameters().overrides;
        this.callback = new DialogCallback() { // from class: com.google.android.exoplayer2.ui.j0
            @Override // com.google.android.exoplayer2.ui.TrackSelectionDialogBuilder.DialogCallback
            public final void onTracksSelected(boolean z10, Map map) {
                TrackSelectionDialogBuilder.a(player, i10, z10, map);
            }
        };
    }
}
