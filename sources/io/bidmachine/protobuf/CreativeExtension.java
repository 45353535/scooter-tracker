package io.bidmachine.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.a;
import com.explorestack.protobuf.a2;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.l;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.p1;
import com.explorestack.protobuf.r2;
import com.explorestack.protobuf.v1;
import com.explorestack.protobuf.w;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class CreativeExtension extends h0 implements CreativeExtensionOrBuilder {
    public static final int ASSET_FIELD_NUMBER = 1;
    public static final int FEATURES_FIELD_NUMBER = 2;
    public static final int POSTBANNERS_FIELD_NUMBER = 3;
    private static final long serialVersionUID = 0;
    private AssetAppearance asset_;
    private List<Feature> features_;
    private byte memoizedIsInitialized;
    private List<Postbanner> postbanners_;
    private static final CreativeExtension DEFAULT_INSTANCE = new CreativeExtension();
    private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.CreativeExtension.1
        @Override // com.explorestack.protobuf.p1
        public CreativeExtension parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
            return new CreativeExtension(lVar, wVar);
        }
    };

    public static final class AssetAppearance extends h0 implements AssetAppearanceOrBuilder {
        public static final int AUTOROTATE_FIELD_NUMBER = 5;
        public static final int BACKGROUND_COLOR_FIELD_NUMBER = 12;
        public static final int CLOSABLE_VIEW_FIELD_NUMBER = 7;
        public static final int CLOSE_TIME_FIELD_NUMBER = 1;
        public static final int COUNTDOWN_FIELD_NUMBER = 6;
        public static final int CTA_FIELD_NUMBER = 9;
        public static final int DURATION_FIELD_NUMBER = 2;
        public static final int IGNORES_SAFE_AREA_LAYOUT_GUIDE_FIELD_NUMBER = 3;
        public static final int MUTE_ASSET_FIELD_NUMBER = 10;
        public static final int PROGRESS_FIELD_NUMBER = 8;
        public static final int USE_CUSTOM_CLOSE_FIELD_NUMBER = 4;
        public static final int VIDEO_ASSET_FIELD_NUMBER = 11;
        private static final long serialVersionUID = 0;
        private boolean autorotate_;
        private volatile Object backgroundColor_;
        private AssetModel closableView_;
        private float closeTime_;
        private AssetModel countdown_;
        private AssetModel cta_;
        private int duration_;
        private boolean ignoresSafeAreaLayoutGuide_;
        private byte memoizedIsInitialized;
        private AssetModel muteAsset_;
        private AssetModel progress_;
        private boolean useCustomClose_;
        private AssetModel videoAsset_;
        private static final AssetAppearance DEFAULT_INSTANCE = new AssetAppearance();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.CreativeExtension.AssetAppearance.1
            @Override // com.explorestack.protobuf.p1
            public AssetAppearance parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new AssetAppearance(lVar, wVar);
            }
        };

        public static AssetAppearance getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_AssetAppearance_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AssetAppearance parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AssetAppearance) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AssetAppearance parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AssetAppearance) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AssetAppearance)) {
                return super.equals(obj);
            }
            AssetAppearance assetAppearance = (AssetAppearance) obj;
            if (Float.floatToIntBits(getCloseTime()) != Float.floatToIntBits(assetAppearance.getCloseTime()) || getDuration() != assetAppearance.getDuration() || getIgnoresSafeAreaLayoutGuide() != assetAppearance.getIgnoresSafeAreaLayoutGuide() || getUseCustomClose() != assetAppearance.getUseCustomClose() || getAutorotate() != assetAppearance.getAutorotate() || hasCountdown() != assetAppearance.hasCountdown()) {
                return false;
            }
            if ((hasCountdown() && !getCountdown().equals(assetAppearance.getCountdown())) || hasClosableView() != assetAppearance.hasClosableView()) {
                return false;
            }
            if ((hasClosableView() && !getClosableView().equals(assetAppearance.getClosableView())) || hasProgress() != assetAppearance.hasProgress()) {
                return false;
            }
            if ((hasProgress() && !getProgress().equals(assetAppearance.getProgress())) || hasCta() != assetAppearance.hasCta()) {
                return false;
            }
            if ((hasCta() && !getCta().equals(assetAppearance.getCta())) || hasMuteAsset() != assetAppearance.hasMuteAsset()) {
                return false;
            }
            if ((!hasMuteAsset() || getMuteAsset().equals(assetAppearance.getMuteAsset())) && hasVideoAsset() == assetAppearance.hasVideoAsset()) {
                return (!hasVideoAsset() || getVideoAsset().equals(assetAppearance.getVideoAsset())) && getBackgroundColor().equals(assetAppearance.getBackgroundColor()) && this.unknownFields.equals(assetAppearance.unknownFields);
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public boolean getAutorotate() {
            return this.autorotate_;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public String getBackgroundColor() {
            Object obj = this.backgroundColor_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.backgroundColor_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public ByteString getBackgroundColorBytes() {
            Object obj = this.backgroundColor_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.backgroundColor_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public AssetModel getClosableView() {
            AssetModel assetModel = this.closableView_;
            return assetModel == null ? AssetModel.getDefaultInstance() : assetModel;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public AssetModelOrBuilder getClosableViewOrBuilder() {
            return getClosableView();
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public float getCloseTime() {
            return this.closeTime_;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public AssetModel getCountdown() {
            AssetModel assetModel = this.countdown_;
            return assetModel == null ? AssetModel.getDefaultInstance() : assetModel;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public AssetModelOrBuilder getCountdownOrBuilder() {
            return getCountdown();
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public AssetModel getCta() {
            AssetModel assetModel = this.cta_;
            return assetModel == null ? AssetModel.getDefaultInstance() : assetModel;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public AssetModelOrBuilder getCtaOrBuilder() {
            return getCta();
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public int getDuration() {
            return this.duration_;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public boolean getIgnoresSafeAreaLayoutGuide() {
            return this.ignoresSafeAreaLayoutGuide_;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public AssetModel getMuteAsset() {
            AssetModel assetModel = this.muteAsset_;
            return assetModel == null ? AssetModel.getDefaultInstance() : assetModel;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public AssetModelOrBuilder getMuteAssetOrBuilder() {
            return getMuteAsset();
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public AssetModel getProgress() {
            AssetModel assetModel = this.progress_;
            return assetModel == null ? AssetModel.getDefaultInstance() : assetModel;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public AssetModelOrBuilder getProgressOrBuilder() {
            return getProgress();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            float f10 = this.closeTime_;
            int iR = f10 != 0.0f ? n.r(1, f10) : 0;
            int i11 = this.duration_;
            if (i11 != 0) {
                iR += n.Y(2, i11);
            }
            boolean z10 = this.ignoresSafeAreaLayoutGuide_;
            if (z10) {
                iR += n.e(3, z10);
            }
            boolean z11 = this.useCustomClose_;
            if (z11) {
                iR += n.e(4, z11);
            }
            boolean z12 = this.autorotate_;
            if (z12) {
                iR += n.e(5, z12);
            }
            if (this.countdown_ != null) {
                iR += n.G(6, getCountdown());
            }
            if (this.closableView_ != null) {
                iR += n.G(7, getClosableView());
            }
            if (this.progress_ != null) {
                iR += n.G(8, getProgress());
            }
            if (this.cta_ != null) {
                iR += n.G(9, getCta());
            }
            if (this.muteAsset_ != null) {
                iR += n.G(10, getMuteAsset());
            }
            if (this.videoAsset_ != null) {
                iR += n.G(11, getVideoAsset());
            }
            if (!getBackgroundColorBytes().isEmpty()) {
                iR += h0.computeStringSize(12, this.backgroundColor_);
            }
            int serializedSize = iR + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public boolean getUseCustomClose() {
            return this.useCustomClose_;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public AssetModel getVideoAsset() {
            AssetModel assetModel = this.videoAsset_;
            return assetModel == null ? AssetModel.getDefaultInstance() : assetModel;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public AssetModelOrBuilder getVideoAssetOrBuilder() {
            return getVideoAsset();
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public boolean hasClosableView() {
            return this.closableView_ != null;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public boolean hasCountdown() {
            return this.countdown_ != null;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public boolean hasCta() {
            return this.cta_ != null;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public boolean hasMuteAsset() {
            return this.muteAsset_ != null;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public boolean hasProgress() {
            return this.progress_ != null;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public boolean hasVideoAsset() {
            return this.videoAsset_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Float.floatToIntBits(getCloseTime())) * 37) + 2) * 53) + getDuration()) * 37) + 3) * 53) + j0.d(getIgnoresSafeAreaLayoutGuide())) * 37) + 4) * 53) + j0.d(getUseCustomClose())) * 37) + 5) * 53) + j0.d(getAutorotate());
            if (hasCountdown()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getCountdown().hashCode();
            }
            if (hasClosableView()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + getClosableView().hashCode();
            }
            if (hasProgress()) {
                iHashCode = (((iHashCode * 37) + 8) * 53) + getProgress().hashCode();
            }
            if (hasCta()) {
                iHashCode = (((iHashCode * 37) + 9) * 53) + getCta().hashCode();
            }
            if (hasMuteAsset()) {
                iHashCode = (((iHashCode * 37) + 10) * 53) + getMuteAsset().hashCode();
            }
            if (hasVideoAsset()) {
                iHashCode = (((iHashCode * 37) + 11) * 53) + getVideoAsset().hashCode();
            }
            int iHashCode2 = (((((iHashCode * 37) + 12) * 53) + getBackgroundColor().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_AssetAppearance_fieldAccessorTable.d(AssetAppearance.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.explorestack.protobuf.h0
        protected Object newInstance(h0.g gVar) {
            return new AssetAppearance();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            float f10 = this.closeTime_;
            if (f10 != 0.0f) {
                nVar.B0(1, f10);
            }
            int i10 = this.duration_;
            if (i10 != 0) {
                nVar.W0(2, i10);
            }
            boolean z10 = this.ignoresSafeAreaLayoutGuide_;
            if (z10) {
                nVar.n0(3, z10);
            }
            boolean z11 = this.useCustomClose_;
            if (z11) {
                nVar.n0(4, z11);
            }
            boolean z12 = this.autorotate_;
            if (z12) {
                nVar.n0(5, z12);
            }
            if (this.countdown_ != null) {
                nVar.J0(6, getCountdown());
            }
            if (this.closableView_ != null) {
                nVar.J0(7, getClosableView());
            }
            if (this.progress_ != null) {
                nVar.J0(8, getProgress());
            }
            if (this.cta_ != null) {
                nVar.J0(9, getCta());
            }
            if (this.muteAsset_ != null) {
                nVar.J0(10, getMuteAsset());
            }
            if (this.videoAsset_ != null) {
                nVar.J0(11, getVideoAsset());
            }
            if (!getBackgroundColorBytes().isEmpty()) {
                h0.writeString(nVar, 12, this.backgroundColor_);
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements AssetAppearanceOrBuilder {
            private boolean autorotate_;
            private Object backgroundColor_;
            private a2 closableViewBuilder_;
            private AssetModel closableView_;
            private float closeTime_;
            private a2 countdownBuilder_;
            private AssetModel countdown_;
            private a2 ctaBuilder_;
            private AssetModel cta_;
            private int duration_;
            private boolean ignoresSafeAreaLayoutGuide_;
            private a2 muteAssetBuilder_;
            private AssetModel muteAsset_;
            private a2 progressBuilder_;
            private AssetModel progress_;
            private boolean useCustomClose_;
            private a2 videoAssetBuilder_;
            private AssetModel videoAsset_;

            private a2 getClosableViewFieldBuilder() {
                if (this.closableViewBuilder_ == null) {
                    this.closableViewBuilder_ = new a2(getClosableView(), getParentForChildren(), isClean());
                    this.closableView_ = null;
                }
                return this.closableViewBuilder_;
            }

            private a2 getCountdownFieldBuilder() {
                if (this.countdownBuilder_ == null) {
                    this.countdownBuilder_ = new a2(getCountdown(), getParentForChildren(), isClean());
                    this.countdown_ = null;
                }
                return this.countdownBuilder_;
            }

            private a2 getCtaFieldBuilder() {
                if (this.ctaBuilder_ == null) {
                    this.ctaBuilder_ = new a2(getCta(), getParentForChildren(), isClean());
                    this.cta_ = null;
                }
                return this.ctaBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_AssetAppearance_descriptor;
            }

            private a2 getMuteAssetFieldBuilder() {
                if (this.muteAssetBuilder_ == null) {
                    this.muteAssetBuilder_ = new a2(getMuteAsset(), getParentForChildren(), isClean());
                    this.muteAsset_ = null;
                }
                return this.muteAssetBuilder_;
            }

            private a2 getProgressFieldBuilder() {
                if (this.progressBuilder_ == null) {
                    this.progressBuilder_ = new a2(getProgress(), getParentForChildren(), isClean());
                    this.progress_ = null;
                }
                return this.progressBuilder_;
            }

            private a2 getVideoAssetFieldBuilder() {
                if (this.videoAssetBuilder_ == null) {
                    this.videoAssetBuilder_ = new a2(getVideoAsset(), getParentForChildren(), isClean());
                    this.videoAsset_ = null;
                }
                return this.videoAssetBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = h0.alwaysUseFieldBuilders;
            }

            public Builder clearAutorotate() {
                this.autorotate_ = false;
                onChanged();
                return this;
            }

            public Builder clearBackgroundColor() {
                this.backgroundColor_ = AssetAppearance.getDefaultInstance().getBackgroundColor();
                onChanged();
                return this;
            }

            public Builder clearClosableView() {
                if (this.closableViewBuilder_ == null) {
                    this.closableView_ = null;
                    onChanged();
                    return this;
                }
                this.closableView_ = null;
                this.closableViewBuilder_ = null;
                return this;
            }

            public Builder clearCloseTime() {
                this.closeTime_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearCountdown() {
                if (this.countdownBuilder_ == null) {
                    this.countdown_ = null;
                    onChanged();
                    return this;
                }
                this.countdown_ = null;
                this.countdownBuilder_ = null;
                return this;
            }

            public Builder clearCta() {
                if (this.ctaBuilder_ == null) {
                    this.cta_ = null;
                    onChanged();
                    return this;
                }
                this.cta_ = null;
                this.ctaBuilder_ = null;
                return this;
            }

            public Builder clearDuration() {
                this.duration_ = 0;
                onChanged();
                return this;
            }

            public Builder clearIgnoresSafeAreaLayoutGuide() {
                this.ignoresSafeAreaLayoutGuide_ = false;
                onChanged();
                return this;
            }

            public Builder clearMuteAsset() {
                if (this.muteAssetBuilder_ == null) {
                    this.muteAsset_ = null;
                    onChanged();
                    return this;
                }
                this.muteAsset_ = null;
                this.muteAssetBuilder_ = null;
                return this;
            }

            public Builder clearProgress() {
                if (this.progressBuilder_ == null) {
                    this.progress_ = null;
                    onChanged();
                    return this;
                }
                this.progress_ = null;
                this.progressBuilder_ = null;
                return this;
            }

            public Builder clearUseCustomClose() {
                this.useCustomClose_ = false;
                onChanged();
                return this;
            }

            public Builder clearVideoAsset() {
                if (this.videoAssetBuilder_ == null) {
                    this.videoAsset_ = null;
                    onChanged();
                    return this;
                }
                this.videoAsset_ = null;
                this.videoAssetBuilder_ = null;
                return this;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public boolean getAutorotate() {
                return this.autorotate_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public String getBackgroundColor() {
                Object obj = this.backgroundColor_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.backgroundColor_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public ByteString getBackgroundColorBytes() {
                Object obj = this.backgroundColor_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.backgroundColor_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public AssetModel getClosableView() {
                a2 a2Var = this.closableViewBuilder_;
                if (a2Var != null) {
                    return (AssetModel) a2Var.e();
                }
                AssetModel assetModel = this.closableView_;
                return assetModel == null ? AssetModel.getDefaultInstance() : assetModel;
            }

            public AssetModel.Builder getClosableViewBuilder() {
                onChanged();
                return (AssetModel.Builder) getClosableViewFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public AssetModelOrBuilder getClosableViewOrBuilder() {
                a2 a2Var = this.closableViewBuilder_;
                if (a2Var != null) {
                    return (AssetModelOrBuilder) a2Var.f();
                }
                AssetModel assetModel = this.closableView_;
                return assetModel == null ? AssetModel.getDefaultInstance() : assetModel;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public float getCloseTime() {
                return this.closeTime_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public AssetModel getCountdown() {
                a2 a2Var = this.countdownBuilder_;
                if (a2Var != null) {
                    return (AssetModel) a2Var.e();
                }
                AssetModel assetModel = this.countdown_;
                return assetModel == null ? AssetModel.getDefaultInstance() : assetModel;
            }

            public AssetModel.Builder getCountdownBuilder() {
                onChanged();
                return (AssetModel.Builder) getCountdownFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public AssetModelOrBuilder getCountdownOrBuilder() {
                a2 a2Var = this.countdownBuilder_;
                if (a2Var != null) {
                    return (AssetModelOrBuilder) a2Var.f();
                }
                AssetModel assetModel = this.countdown_;
                return assetModel == null ? AssetModel.getDefaultInstance() : assetModel;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public AssetModel getCta() {
                a2 a2Var = this.ctaBuilder_;
                if (a2Var != null) {
                    return (AssetModel) a2Var.e();
                }
                AssetModel assetModel = this.cta_;
                return assetModel == null ? AssetModel.getDefaultInstance() : assetModel;
            }

            public AssetModel.Builder getCtaBuilder() {
                onChanged();
                return (AssetModel.Builder) getCtaFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public AssetModelOrBuilder getCtaOrBuilder() {
                a2 a2Var = this.ctaBuilder_;
                if (a2Var != null) {
                    return (AssetModelOrBuilder) a2Var.f();
                }
                AssetModel assetModel = this.cta_;
                return assetModel == null ? AssetModel.getDefaultInstance() : assetModel;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_AssetAppearance_descriptor;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public int getDuration() {
                return this.duration_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public boolean getIgnoresSafeAreaLayoutGuide() {
                return this.ignoresSafeAreaLayoutGuide_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public AssetModel getMuteAsset() {
                a2 a2Var = this.muteAssetBuilder_;
                if (a2Var != null) {
                    return (AssetModel) a2Var.e();
                }
                AssetModel assetModel = this.muteAsset_;
                return assetModel == null ? AssetModel.getDefaultInstance() : assetModel;
            }

            public AssetModel.Builder getMuteAssetBuilder() {
                onChanged();
                return (AssetModel.Builder) getMuteAssetFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public AssetModelOrBuilder getMuteAssetOrBuilder() {
                a2 a2Var = this.muteAssetBuilder_;
                if (a2Var != null) {
                    return (AssetModelOrBuilder) a2Var.f();
                }
                AssetModel assetModel = this.muteAsset_;
                return assetModel == null ? AssetModel.getDefaultInstance() : assetModel;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public AssetModel getProgress() {
                a2 a2Var = this.progressBuilder_;
                if (a2Var != null) {
                    return (AssetModel) a2Var.e();
                }
                AssetModel assetModel = this.progress_;
                return assetModel == null ? AssetModel.getDefaultInstance() : assetModel;
            }

            public AssetModel.Builder getProgressBuilder() {
                onChanged();
                return (AssetModel.Builder) getProgressFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public AssetModelOrBuilder getProgressOrBuilder() {
                a2 a2Var = this.progressBuilder_;
                if (a2Var != null) {
                    return (AssetModelOrBuilder) a2Var.f();
                }
                AssetModel assetModel = this.progress_;
                return assetModel == null ? AssetModel.getDefaultInstance() : assetModel;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public boolean getUseCustomClose() {
                return this.useCustomClose_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public AssetModel getVideoAsset() {
                a2 a2Var = this.videoAssetBuilder_;
                if (a2Var != null) {
                    return (AssetModel) a2Var.e();
                }
                AssetModel assetModel = this.videoAsset_;
                return assetModel == null ? AssetModel.getDefaultInstance() : assetModel;
            }

            public AssetModel.Builder getVideoAssetBuilder() {
                onChanged();
                return (AssetModel.Builder) getVideoAssetFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public AssetModelOrBuilder getVideoAssetOrBuilder() {
                a2 a2Var = this.videoAssetBuilder_;
                if (a2Var != null) {
                    return (AssetModelOrBuilder) a2Var.f();
                }
                AssetModel assetModel = this.videoAsset_;
                return assetModel == null ? AssetModel.getDefaultInstance() : assetModel;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public boolean hasClosableView() {
                return (this.closableViewBuilder_ == null && this.closableView_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public boolean hasCountdown() {
                return (this.countdownBuilder_ == null && this.countdown_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public boolean hasCta() {
                return (this.ctaBuilder_ == null && this.cta_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public boolean hasMuteAsset() {
                return (this.muteAssetBuilder_ == null && this.muteAsset_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public boolean hasProgress() {
                return (this.progressBuilder_ == null && this.progress_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public boolean hasVideoAsset() {
                return (this.videoAssetBuilder_ == null && this.videoAsset_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_AssetAppearance_fieldAccessorTable.d(AssetAppearance.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeClosableView(AssetModel assetModel) {
                a2 a2Var = this.closableViewBuilder_;
                if (a2Var != null) {
                    a2Var.g(assetModel);
                    return this;
                }
                AssetModel assetModel2 = this.closableView_;
                if (assetModel2 != null) {
                    this.closableView_ = AssetModel.newBuilder(assetModel2).mergeFrom(assetModel).buildPartial();
                } else {
                    this.closableView_ = assetModel;
                }
                onChanged();
                return this;
            }

            public Builder mergeCountdown(AssetModel assetModel) {
                a2 a2Var = this.countdownBuilder_;
                if (a2Var != null) {
                    a2Var.g(assetModel);
                    return this;
                }
                AssetModel assetModel2 = this.countdown_;
                if (assetModel2 != null) {
                    this.countdown_ = AssetModel.newBuilder(assetModel2).mergeFrom(assetModel).buildPartial();
                } else {
                    this.countdown_ = assetModel;
                }
                onChanged();
                return this;
            }

            public Builder mergeCta(AssetModel assetModel) {
                a2 a2Var = this.ctaBuilder_;
                if (a2Var != null) {
                    a2Var.g(assetModel);
                    return this;
                }
                AssetModel assetModel2 = this.cta_;
                if (assetModel2 != null) {
                    this.cta_ = AssetModel.newBuilder(assetModel2).mergeFrom(assetModel).buildPartial();
                } else {
                    this.cta_ = assetModel;
                }
                onChanged();
                return this;
            }

            public Builder mergeMuteAsset(AssetModel assetModel) {
                a2 a2Var = this.muteAssetBuilder_;
                if (a2Var != null) {
                    a2Var.g(assetModel);
                    return this;
                }
                AssetModel assetModel2 = this.muteAsset_;
                if (assetModel2 != null) {
                    this.muteAsset_ = AssetModel.newBuilder(assetModel2).mergeFrom(assetModel).buildPartial();
                } else {
                    this.muteAsset_ = assetModel;
                }
                onChanged();
                return this;
            }

            public Builder mergeProgress(AssetModel assetModel) {
                a2 a2Var = this.progressBuilder_;
                if (a2Var != null) {
                    a2Var.g(assetModel);
                    return this;
                }
                AssetModel assetModel2 = this.progress_;
                if (assetModel2 != null) {
                    this.progress_ = AssetModel.newBuilder(assetModel2).mergeFrom(assetModel).buildPartial();
                } else {
                    this.progress_ = assetModel;
                }
                onChanged();
                return this;
            }

            public Builder mergeVideoAsset(AssetModel assetModel) {
                a2 a2Var = this.videoAssetBuilder_;
                if (a2Var != null) {
                    a2Var.g(assetModel);
                    return this;
                }
                AssetModel assetModel2 = this.videoAsset_;
                if (assetModel2 != null) {
                    this.videoAsset_ = AssetModel.newBuilder(assetModel2).mergeFrom(assetModel).buildPartial();
                } else {
                    this.videoAsset_ = assetModel;
                }
                onChanged();
                return this;
            }

            public Builder setAutorotate(boolean z10) {
                this.autorotate_ = z10;
                onChanged();
                return this;
            }

            public Builder setBackgroundColor(String str) {
                str.getClass();
                this.backgroundColor_ = str;
                onChanged();
                return this;
            }

            public Builder setBackgroundColorBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.backgroundColor_ = byteString;
                onChanged();
                return this;
            }

            public Builder setClosableView(AssetModel assetModel) {
                a2 a2Var = this.closableViewBuilder_;
                if (a2Var != null) {
                    a2Var.i(assetModel);
                    return this;
                }
                assetModel.getClass();
                this.closableView_ = assetModel;
                onChanged();
                return this;
            }

            public Builder setCloseTime(float f10) {
                this.closeTime_ = f10;
                onChanged();
                return this;
            }

            public Builder setCountdown(AssetModel assetModel) {
                a2 a2Var = this.countdownBuilder_;
                if (a2Var != null) {
                    a2Var.i(assetModel);
                    return this;
                }
                assetModel.getClass();
                this.countdown_ = assetModel;
                onChanged();
                return this;
            }

            public Builder setCta(AssetModel assetModel) {
                a2 a2Var = this.ctaBuilder_;
                if (a2Var != null) {
                    a2Var.i(assetModel);
                    return this;
                }
                assetModel.getClass();
                this.cta_ = assetModel;
                onChanged();
                return this;
            }

            public Builder setDuration(int i10) {
                this.duration_ = i10;
                onChanged();
                return this;
            }

            public Builder setIgnoresSafeAreaLayoutGuide(boolean z10) {
                this.ignoresSafeAreaLayoutGuide_ = z10;
                onChanged();
                return this;
            }

            public Builder setMuteAsset(AssetModel assetModel) {
                a2 a2Var = this.muteAssetBuilder_;
                if (a2Var != null) {
                    a2Var.i(assetModel);
                    return this;
                }
                assetModel.getClass();
                this.muteAsset_ = assetModel;
                onChanged();
                return this;
            }

            public Builder setProgress(AssetModel assetModel) {
                a2 a2Var = this.progressBuilder_;
                if (a2Var != null) {
                    a2Var.i(assetModel);
                    return this;
                }
                assetModel.getClass();
                this.progress_ = assetModel;
                onChanged();
                return this;
            }

            public Builder setUseCustomClose(boolean z10) {
                this.useCustomClose_ = z10;
                onChanged();
                return this;
            }

            public Builder setVideoAsset(AssetModel assetModel) {
                a2 a2Var = this.videoAssetBuilder_;
                if (a2Var != null) {
                    a2Var.i(assetModel);
                    return this;
                }
                assetModel.getClass();
                this.videoAsset_ = assetModel;
                onChanged();
                return this;
            }

            private Builder() {
                this.backgroundColor_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public AssetAppearance build() {
                AssetAppearance assetAppearanceBuildPartial = buildPartial();
                if (assetAppearanceBuildPartial.isInitialized()) {
                    return assetAppearanceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) assetAppearanceBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public AssetAppearance buildPartial() {
                AssetAppearance assetAppearance = new AssetAppearance(this);
                assetAppearance.closeTime_ = this.closeTime_;
                assetAppearance.duration_ = this.duration_;
                assetAppearance.ignoresSafeAreaLayoutGuide_ = this.ignoresSafeAreaLayoutGuide_;
                assetAppearance.useCustomClose_ = this.useCustomClose_;
                assetAppearance.autorotate_ = this.autorotate_;
                a2 a2Var = this.countdownBuilder_;
                if (a2Var == null) {
                    assetAppearance.countdown_ = this.countdown_;
                } else {
                    assetAppearance.countdown_ = (AssetModel) a2Var.a();
                }
                a2 a2Var2 = this.closableViewBuilder_;
                if (a2Var2 == null) {
                    assetAppearance.closableView_ = this.closableView_;
                } else {
                    assetAppearance.closableView_ = (AssetModel) a2Var2.a();
                }
                a2 a2Var3 = this.progressBuilder_;
                if (a2Var3 == null) {
                    assetAppearance.progress_ = this.progress_;
                } else {
                    assetAppearance.progress_ = (AssetModel) a2Var3.a();
                }
                a2 a2Var4 = this.ctaBuilder_;
                if (a2Var4 == null) {
                    assetAppearance.cta_ = this.cta_;
                } else {
                    assetAppearance.cta_ = (AssetModel) a2Var4.a();
                }
                a2 a2Var5 = this.muteAssetBuilder_;
                if (a2Var5 == null) {
                    assetAppearance.muteAsset_ = this.muteAsset_;
                } else {
                    assetAppearance.muteAsset_ = (AssetModel) a2Var5.a();
                }
                a2 a2Var6 = this.videoAssetBuilder_;
                if (a2Var6 == null) {
                    assetAppearance.videoAsset_ = this.videoAsset_;
                } else {
                    assetAppearance.videoAsset_ = (AssetModel) a2Var6.a();
                }
                assetAppearance.backgroundColor_ = this.backgroundColor_;
                onBuilt();
                return assetAppearance;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public AssetAppearance getDefaultInstanceForType() {
                return AssetAppearance.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public final Builder setUnknownFields(r2 r2Var) {
                return (Builder) super.setUnknownFields(r2Var);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder mergeUnknownFields(r2 r2Var) {
                return (Builder) super.mergeUnknownFields(r2Var);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.closeTime_ = 0.0f;
                this.duration_ = 0;
                this.ignoresSafeAreaLayoutGuide_ = false;
                this.useCustomClose_ = false;
                this.autorotate_ = false;
                if (this.countdownBuilder_ == null) {
                    this.countdown_ = null;
                } else {
                    this.countdown_ = null;
                    this.countdownBuilder_ = null;
                }
                if (this.closableViewBuilder_ == null) {
                    this.closableView_ = null;
                } else {
                    this.closableView_ = null;
                    this.closableViewBuilder_ = null;
                }
                if (this.progressBuilder_ == null) {
                    this.progress_ = null;
                } else {
                    this.progress_ = null;
                    this.progressBuilder_ = null;
                }
                if (this.ctaBuilder_ == null) {
                    this.cta_ = null;
                } else {
                    this.cta_ = null;
                    this.ctaBuilder_ = null;
                }
                if (this.muteAssetBuilder_ == null) {
                    this.muteAsset_ = null;
                } else {
                    this.muteAsset_ = null;
                    this.muteAssetBuilder_ = null;
                }
                if (this.videoAssetBuilder_ == null) {
                    this.videoAsset_ = null;
                } else {
                    this.videoAsset_ = null;
                    this.videoAssetBuilder_ = null;
                }
                this.backgroundColor_ = "";
                return this;
            }

            private Builder(h0.c cVar) {
                super(cVar);
                this.backgroundColor_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder setClosableView(AssetModel.Builder builder) {
                a2 a2Var = this.closableViewBuilder_;
                if (a2Var == null) {
                    this.closableView_ = builder.build();
                    onChanged();
                    return this;
                }
                a2Var.i(builder.build());
                return this;
            }

            public Builder setCountdown(AssetModel.Builder builder) {
                a2 a2Var = this.countdownBuilder_;
                if (a2Var == null) {
                    this.countdown_ = builder.build();
                    onChanged();
                    return this;
                }
                a2Var.i(builder.build());
                return this;
            }

            public Builder setCta(AssetModel.Builder builder) {
                a2 a2Var = this.ctaBuilder_;
                if (a2Var == null) {
                    this.cta_ = builder.build();
                    onChanged();
                    return this;
                }
                a2Var.i(builder.build());
                return this;
            }

            public Builder setMuteAsset(AssetModel.Builder builder) {
                a2 a2Var = this.muteAssetBuilder_;
                if (a2Var == null) {
                    this.muteAsset_ = builder.build();
                    onChanged();
                    return this;
                }
                a2Var.i(builder.build());
                return this;
            }

            public Builder setProgress(AssetModel.Builder builder) {
                a2 a2Var = this.progressBuilder_;
                if (a2Var == null) {
                    this.progress_ = builder.build();
                    onChanged();
                    return this;
                }
                a2Var.i(builder.build());
                return this;
            }

            public Builder setVideoAsset(AssetModel.Builder builder) {
                a2 a2Var = this.videoAssetBuilder_;
                if (a2Var == null) {
                    this.videoAsset_ = builder.build();
                    onChanged();
                    return this;
                }
                a2Var.i(builder.build());
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4427clone() {
                return (Builder) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AssetAppearance) {
                    return mergeFrom((AssetAppearance) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AssetAppearance assetAppearance) {
                if (assetAppearance == AssetAppearance.getDefaultInstance()) {
                    return this;
                }
                if (assetAppearance.getCloseTime() != 0.0f) {
                    setCloseTime(assetAppearance.getCloseTime());
                }
                if (assetAppearance.getDuration() != 0) {
                    setDuration(assetAppearance.getDuration());
                }
                if (assetAppearance.getIgnoresSafeAreaLayoutGuide()) {
                    setIgnoresSafeAreaLayoutGuide(assetAppearance.getIgnoresSafeAreaLayoutGuide());
                }
                if (assetAppearance.getUseCustomClose()) {
                    setUseCustomClose(assetAppearance.getUseCustomClose());
                }
                if (assetAppearance.getAutorotate()) {
                    setAutorotate(assetAppearance.getAutorotate());
                }
                if (assetAppearance.hasCountdown()) {
                    mergeCountdown(assetAppearance.getCountdown());
                }
                if (assetAppearance.hasClosableView()) {
                    mergeClosableView(assetAppearance.getClosableView());
                }
                if (assetAppearance.hasProgress()) {
                    mergeProgress(assetAppearance.getProgress());
                }
                if (assetAppearance.hasCta()) {
                    mergeCta(assetAppearance.getCta());
                }
                if (assetAppearance.hasMuteAsset()) {
                    mergeMuteAsset(assetAppearance.getMuteAsset());
                }
                if (assetAppearance.hasVideoAsset()) {
                    mergeVideoAsset(assetAppearance.getVideoAsset());
                }
                if (!assetAppearance.getBackgroundColor().isEmpty()) {
                    this.backgroundColor_ = assetAppearance.backgroundColor_;
                    onChanged();
                }
                mergeUnknownFields(((h0) assetAppearance).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public io.bidmachine.protobuf.CreativeExtension.AssetAppearance.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.CreativeExtension.AssetAppearance.access$4800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.CreativeExtension$AssetAppearance r3 = (io.bidmachine.protobuf.CreativeExtension.AssetAppearance) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    if (r3 == 0) goto L10
                    r2.mergeFrom(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                    io.bidmachine.protobuf.CreativeExtension$AssetAppearance r4 = (io.bidmachine.protobuf.CreativeExtension.AssetAppearance) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.mergeFrom(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.CreativeExtension.AssetAppearance.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.CreativeExtension$AssetAppearance$Builder");
            }
        }

        public static Builder newBuilder(AssetAppearance assetAppearance) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(assetAppearance);
        }

        public static AssetAppearance parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (AssetAppearance) PARSER.parseFrom(byteBuffer, wVar);
        }

        private AssetAppearance(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AssetAppearance parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (AssetAppearance) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static AssetAppearance parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AssetAppearance) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public AssetAppearance getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static AssetAppearance parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (AssetAppearance) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private AssetAppearance() {
            this.memoizedIsInitialized = (byte) -1;
            this.backgroundColor_ = "";
        }

        public static AssetAppearance parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AssetAppearance) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static AssetAppearance parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (AssetAppearance) PARSER.parseFrom(bArr, wVar);
        }

        public static AssetAppearance parseFrom(InputStream inputStream) throws IOException {
            return (AssetAppearance) h0.parseWithIOException(PARSER, inputStream);
        }

        private AssetAppearance(l lVar, w wVar) throws InvalidProtocolBufferException {
            AssetModel.Builder builder;
            this();
            wVar.getClass();
            r2.b bVarG = r2.g();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iK = lVar.K();
                        switch (iK) {
                            case 0:
                                z10 = true;
                                break;
                            case 13:
                                this.closeTime_ = lVar.w();
                                break;
                            case 16:
                                this.duration_ = lVar.L();
                                break;
                            case 24:
                                this.ignoresSafeAreaLayoutGuide_ = lVar.q();
                                break;
                            case 32:
                                this.useCustomClose_ = lVar.q();
                                break;
                            case 40:
                                this.autorotate_ = lVar.q();
                                break;
                            case 50:
                                AssetModel assetModel = this.countdown_;
                                builder = assetModel != null ? assetModel.toBuilder() : null;
                                AssetModel assetModel2 = (AssetModel) lVar.A(AssetModel.parser(), wVar);
                                this.countdown_ = assetModel2;
                                if (builder != null) {
                                    builder.mergeFrom(assetModel2);
                                    this.countdown_ = builder.buildPartial();
                                }
                                break;
                            case 58:
                                AssetModel assetModel3 = this.closableView_;
                                builder = assetModel3 != null ? assetModel3.toBuilder() : null;
                                AssetModel assetModel4 = (AssetModel) lVar.A(AssetModel.parser(), wVar);
                                this.closableView_ = assetModel4;
                                if (builder != null) {
                                    builder.mergeFrom(assetModel4);
                                    this.closableView_ = builder.buildPartial();
                                }
                                break;
                            case 66:
                                AssetModel assetModel5 = this.progress_;
                                builder = assetModel5 != null ? assetModel5.toBuilder() : null;
                                AssetModel assetModel6 = (AssetModel) lVar.A(AssetModel.parser(), wVar);
                                this.progress_ = assetModel6;
                                if (builder != null) {
                                    builder.mergeFrom(assetModel6);
                                    this.progress_ = builder.buildPartial();
                                }
                                break;
                            case 74:
                                AssetModel assetModel7 = this.cta_;
                                builder = assetModel7 != null ? assetModel7.toBuilder() : null;
                                AssetModel assetModel8 = (AssetModel) lVar.A(AssetModel.parser(), wVar);
                                this.cta_ = assetModel8;
                                if (builder != null) {
                                    builder.mergeFrom(assetModel8);
                                    this.cta_ = builder.buildPartial();
                                }
                                break;
                            case 82:
                                AssetModel assetModel9 = this.muteAsset_;
                                builder = assetModel9 != null ? assetModel9.toBuilder() : null;
                                AssetModel assetModel10 = (AssetModel) lVar.A(AssetModel.parser(), wVar);
                                this.muteAsset_ = assetModel10;
                                if (builder != null) {
                                    builder.mergeFrom(assetModel10);
                                    this.muteAsset_ = builder.buildPartial();
                                }
                                break;
                            case 90:
                                AssetModel assetModel11 = this.videoAsset_;
                                builder = assetModel11 != null ? assetModel11.toBuilder() : null;
                                AssetModel assetModel12 = (AssetModel) lVar.A(AssetModel.parser(), wVar);
                                this.videoAsset_ = assetModel12;
                                if (builder != null) {
                                    builder.mergeFrom(assetModel12);
                                    this.videoAsset_ = builder.buildPartial();
                                }
                                break;
                            case 98:
                                this.backgroundColor_ = lVar.J();
                                break;
                            default:
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                    z10 = true;
                                }
                                break;
                        }
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static AssetAppearance parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (AssetAppearance) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static AssetAppearance parseFrom(l lVar) throws IOException {
            return (AssetAppearance) h0.parseWithIOException(PARSER, lVar);
        }

        public static AssetAppearance parseFrom(l lVar, w wVar) throws IOException {
            return (AssetAppearance) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface AssetAppearanceOrBuilder extends MessageOrBuilder {
        boolean getAutorotate();

        String getBackgroundColor();

        ByteString getBackgroundColorBytes();

        AssetModel getClosableView();

        AssetModelOrBuilder getClosableViewOrBuilder();

        float getCloseTime();

        AssetModel getCountdown();

        AssetModelOrBuilder getCountdownOrBuilder();

        AssetModel getCta();

        AssetModelOrBuilder getCtaOrBuilder();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        int getDuration();

        boolean getIgnoresSafeAreaLayoutGuide();

        AssetModel getMuteAsset();

        AssetModelOrBuilder getMuteAssetOrBuilder();

        AssetModel getProgress();

        AssetModelOrBuilder getProgressOrBuilder();

        boolean getUseCustomClose();

        AssetModel getVideoAsset();

        AssetModelOrBuilder getVideoAssetOrBuilder();

        boolean hasClosableView();

        boolean hasCountdown();

        boolean hasCta();

        boolean hasMuteAsset();

        boolean hasProgress();

        boolean hasVideoAsset();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class AssetModel extends h0 implements AssetModelOrBuilder {
        public static final int CONTENT_FIELD_NUMBER = 1;
        public static final int FILL_FIELD_NUMBER = 2;
        public static final int FONT_STYLE_FIELD_NUMBER = 3;
        public static final int HEIGHT_FIELD_NUMBER = 4;
        public static final int HIDEAFTER_FIELD_NUMBER = 5;
        public static final int MARGIN_FIELD_NUMBER = 6;
        public static final int OPACITY_FIELD_NUMBER = 7;
        public static final int OUTLINED_FIELD_NUMBER = 8;
        public static final int PADDING_FIELD_NUMBER = 9;
        public static final int SHADOW_FIELD_NUMBER = 10;
        public static final int STROKE_FIELD_NUMBER = 11;
        public static final int STROKE_WIDTH_FIELD_NUMBER = 18;
        public static final int STYLE_FIELD_NUMBER = 13;
        public static final int VISIBLE_FIELD_NUMBER = 14;
        public static final int WIDTH_FIELD_NUMBER = 15;
        public static final int X_FIELD_NUMBER = 16;
        public static final int Y_FIELD_NUMBER = 17;
        private static final long serialVersionUID = 0;
        private volatile Object content_;
        private volatile Object fill_;
        private int fontStyle_;
        private int height_;
        private int hideafter_;
        private float margin_;
        private byte memoizedIsInitialized;
        private float opacity_;
        private boolean outlined_;
        private float padding_;
        private volatile Object shadow_;
        private float strokeWidth_;
        private volatile Object stroke_;
        private volatile Object style_;
        private boolean visible_;
        private int width_;
        private volatile Object x_;
        private volatile Object y_;
        private static final AssetModel DEFAULT_INSTANCE = new AssetModel();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.CreativeExtension.AssetModel.1
            @Override // com.explorestack.protobuf.p1
            public AssetModel parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new AssetModel(lVar, wVar);
            }
        };

        public static AssetModel getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_AssetModel_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AssetModel parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AssetModel) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AssetModel parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AssetModel) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AssetModel)) {
                return super.equals(obj);
            }
            AssetModel assetModel = (AssetModel) obj;
            return getContent().equals(assetModel.getContent()) && getFill().equals(assetModel.getFill()) && getFontStyle() == assetModel.getFontStyle() && getHeight() == assetModel.getHeight() && getHideafter() == assetModel.getHideafter() && Float.floatToIntBits(getMargin()) == Float.floatToIntBits(assetModel.getMargin()) && Float.floatToIntBits(getOpacity()) == Float.floatToIntBits(assetModel.getOpacity()) && getOutlined() == assetModel.getOutlined() && Float.floatToIntBits(getPadding()) == Float.floatToIntBits(assetModel.getPadding()) && getShadow().equals(assetModel.getShadow()) && getStroke().equals(assetModel.getStroke()) && Float.floatToIntBits(getStrokeWidth()) == Float.floatToIntBits(assetModel.getStrokeWidth()) && getStyle().equals(assetModel.getStyle()) && getVisible() == assetModel.getVisible() && getWidth() == assetModel.getWidth() && getX().equals(assetModel.getX()) && getY().equals(assetModel.getY()) && this.unknownFields.equals(assetModel.unknownFields);
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public String getContent() {
            Object obj = this.content_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.content_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public ByteString getContentBytes() {
            Object obj = this.content_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.content_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public String getFill() {
            Object obj = this.fill_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.fill_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public ByteString getFillBytes() {
            Object obj = this.fill_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.fill_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public int getFontStyle() {
            return this.fontStyle_;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public int getHeight() {
            return this.height_;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public int getHideafter() {
            return this.hideafter_;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public float getMargin() {
            return this.margin_;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public float getOpacity() {
            return this.opacity_;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public boolean getOutlined() {
            return this.outlined_;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public float getPadding() {
            return this.padding_;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = !getContentBytes().isEmpty() ? h0.computeStringSize(1, this.content_) : 0;
            if (!getFillBytes().isEmpty()) {
                iComputeStringSize += h0.computeStringSize(2, this.fill_);
            }
            int i11 = this.fontStyle_;
            if (i11 != 0) {
                iComputeStringSize += n.Y(3, i11);
            }
            int i12 = this.height_;
            if (i12 != 0) {
                iComputeStringSize += n.Y(4, i12);
            }
            int i13 = this.hideafter_;
            if (i13 != 0) {
                iComputeStringSize += n.Y(5, i13);
            }
            float f10 = this.margin_;
            if (f10 != 0.0f) {
                iComputeStringSize += n.r(6, f10);
            }
            float f11 = this.opacity_;
            if (f11 != 0.0f) {
                iComputeStringSize += n.r(7, f11);
            }
            boolean z10 = this.outlined_;
            if (z10) {
                iComputeStringSize += n.e(8, z10);
            }
            float f12 = this.padding_;
            if (f12 != 0.0f) {
                iComputeStringSize += n.r(9, f12);
            }
            if (!getShadowBytes().isEmpty()) {
                iComputeStringSize += h0.computeStringSize(10, this.shadow_);
            }
            if (!getStrokeBytes().isEmpty()) {
                iComputeStringSize += h0.computeStringSize(11, this.stroke_);
            }
            if (!getStyleBytes().isEmpty()) {
                iComputeStringSize += h0.computeStringSize(13, this.style_);
            }
            boolean z11 = this.visible_;
            if (z11) {
                iComputeStringSize += n.e(14, z11);
            }
            int i14 = this.width_;
            if (i14 != 0) {
                iComputeStringSize += n.Y(15, i14);
            }
            if (!getXBytes().isEmpty()) {
                iComputeStringSize += h0.computeStringSize(16, this.x_);
            }
            if (!getYBytes().isEmpty()) {
                iComputeStringSize += h0.computeStringSize(17, this.y_);
            }
            float f13 = this.strokeWidth_;
            if (f13 != 0.0f) {
                iComputeStringSize += n.r(18, f13);
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public String getShadow() {
            Object obj = this.shadow_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.shadow_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public ByteString getShadowBytes() {
            Object obj = this.shadow_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.shadow_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public String getStroke() {
            Object obj = this.stroke_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.stroke_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public ByteString getStrokeBytes() {
            Object obj = this.stroke_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.stroke_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public float getStrokeWidth() {
            return this.strokeWidth_;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public String getStyle() {
            Object obj = this.style_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.style_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public ByteString getStyleBytes() {
            Object obj = this.style_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.style_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public boolean getVisible() {
            return this.visible_;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public int getWidth() {
            return this.width_;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public String getX() {
            Object obj = this.x_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.x_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public ByteString getXBytes() {
            Object obj = this.x_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.x_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public String getY() {
            Object obj = this.y_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.y_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public ByteString getYBytes() {
            Object obj = this.y_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.y_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getContent().hashCode()) * 37) + 2) * 53) + getFill().hashCode()) * 37) + 3) * 53) + getFontStyle()) * 37) + 4) * 53) + getHeight()) * 37) + 5) * 53) + getHideafter()) * 37) + 6) * 53) + Float.floatToIntBits(getMargin())) * 37) + 7) * 53) + Float.floatToIntBits(getOpacity())) * 37) + 8) * 53) + j0.d(getOutlined())) * 37) + 9) * 53) + Float.floatToIntBits(getPadding())) * 37) + 10) * 53) + getShadow().hashCode()) * 37) + 11) * 53) + getStroke().hashCode()) * 37) + 18) * 53) + Float.floatToIntBits(getStrokeWidth())) * 37) + 13) * 53) + getStyle().hashCode()) * 37) + 14) * 53) + j0.d(getVisible())) * 37) + 15) * 53) + getWidth()) * 37) + 16) * 53) + getX().hashCode()) * 37) + 17) * 53) + getY().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_AssetModel_fieldAccessorTable.d(AssetModel.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.explorestack.protobuf.h0
        protected Object newInstance(h0.g gVar) {
            return new AssetModel();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            if (!getContentBytes().isEmpty()) {
                h0.writeString(nVar, 1, this.content_);
            }
            if (!getFillBytes().isEmpty()) {
                h0.writeString(nVar, 2, this.fill_);
            }
            int i10 = this.fontStyle_;
            if (i10 != 0) {
                nVar.W0(3, i10);
            }
            int i11 = this.height_;
            if (i11 != 0) {
                nVar.W0(4, i11);
            }
            int i12 = this.hideafter_;
            if (i12 != 0) {
                nVar.W0(5, i12);
            }
            float f10 = this.margin_;
            if (f10 != 0.0f) {
                nVar.B0(6, f10);
            }
            float f11 = this.opacity_;
            if (f11 != 0.0f) {
                nVar.B0(7, f11);
            }
            boolean z10 = this.outlined_;
            if (z10) {
                nVar.n0(8, z10);
            }
            float f12 = this.padding_;
            if (f12 != 0.0f) {
                nVar.B0(9, f12);
            }
            if (!getShadowBytes().isEmpty()) {
                h0.writeString(nVar, 10, this.shadow_);
            }
            if (!getStrokeBytes().isEmpty()) {
                h0.writeString(nVar, 11, this.stroke_);
            }
            if (!getStyleBytes().isEmpty()) {
                h0.writeString(nVar, 13, this.style_);
            }
            boolean z11 = this.visible_;
            if (z11) {
                nVar.n0(14, z11);
            }
            int i13 = this.width_;
            if (i13 != 0) {
                nVar.W0(15, i13);
            }
            if (!getXBytes().isEmpty()) {
                h0.writeString(nVar, 16, this.x_);
            }
            if (!getYBytes().isEmpty()) {
                h0.writeString(nVar, 17, this.y_);
            }
            float f13 = this.strokeWidth_;
            if (f13 != 0.0f) {
                nVar.B0(18, f13);
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements AssetModelOrBuilder {
            private Object content_;
            private Object fill_;
            private int fontStyle_;
            private int height_;
            private int hideafter_;
            private float margin_;
            private float opacity_;
            private boolean outlined_;
            private float padding_;
            private Object shadow_;
            private float strokeWidth_;
            private Object stroke_;
            private Object style_;
            private boolean visible_;
            private int width_;
            private Object x_;
            private Object y_;

            public static final Descriptors.Descriptor getDescriptor() {
                return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_AssetModel_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = h0.alwaysUseFieldBuilders;
            }

            public Builder clearContent() {
                this.content_ = AssetModel.getDefaultInstance().getContent();
                onChanged();
                return this;
            }

            public Builder clearFill() {
                this.fill_ = AssetModel.getDefaultInstance().getFill();
                onChanged();
                return this;
            }

            public Builder clearFontStyle() {
                this.fontStyle_ = 0;
                onChanged();
                return this;
            }

            public Builder clearHeight() {
                this.height_ = 0;
                onChanged();
                return this;
            }

            public Builder clearHideafter() {
                this.hideafter_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMargin() {
                this.margin_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearOpacity() {
                this.opacity_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearOutlined() {
                this.outlined_ = false;
                onChanged();
                return this;
            }

            public Builder clearPadding() {
                this.padding_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearShadow() {
                this.shadow_ = AssetModel.getDefaultInstance().getShadow();
                onChanged();
                return this;
            }

            public Builder clearStroke() {
                this.stroke_ = AssetModel.getDefaultInstance().getStroke();
                onChanged();
                return this;
            }

            public Builder clearStrokeWidth() {
                this.strokeWidth_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearStyle() {
                this.style_ = AssetModel.getDefaultInstance().getStyle();
                onChanged();
                return this;
            }

            public Builder clearVisible() {
                this.visible_ = false;
                onChanged();
                return this;
            }

            public Builder clearWidth() {
                this.width_ = 0;
                onChanged();
                return this;
            }

            public Builder clearX() {
                this.x_ = AssetModel.getDefaultInstance().getX();
                onChanged();
                return this;
            }

            public Builder clearY() {
                this.y_ = AssetModel.getDefaultInstance().getY();
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public String getContent() {
                Object obj = this.content_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.content_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public ByteString getContentBytes() {
                Object obj = this.content_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.content_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_AssetModel_descriptor;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public String getFill() {
                Object obj = this.fill_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.fill_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public ByteString getFillBytes() {
                Object obj = this.fill_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.fill_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public int getFontStyle() {
                return this.fontStyle_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public int getHeight() {
                return this.height_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public int getHideafter() {
                return this.hideafter_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public float getMargin() {
                return this.margin_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public float getOpacity() {
                return this.opacity_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public boolean getOutlined() {
                return this.outlined_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public float getPadding() {
                return this.padding_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public String getShadow() {
                Object obj = this.shadow_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.shadow_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public ByteString getShadowBytes() {
                Object obj = this.shadow_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.shadow_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public String getStroke() {
                Object obj = this.stroke_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.stroke_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public ByteString getStrokeBytes() {
                Object obj = this.stroke_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.stroke_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public float getStrokeWidth() {
                return this.strokeWidth_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public String getStyle() {
                Object obj = this.style_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.style_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public ByteString getStyleBytes() {
                Object obj = this.style_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.style_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public boolean getVisible() {
                return this.visible_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public int getWidth() {
                return this.width_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public String getX() {
                Object obj = this.x_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.x_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public ByteString getXBytes() {
                Object obj = this.x_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.x_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public String getY() {
                Object obj = this.y_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.y_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public ByteString getYBytes() {
                Object obj = this.y_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.y_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_AssetModel_fieldAccessorTable.d(AssetModel.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setContent(String str) {
                str.getClass();
                this.content_ = str;
                onChanged();
                return this;
            }

            public Builder setContentBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.content_ = byteString;
                onChanged();
                return this;
            }

            public Builder setFill(String str) {
                str.getClass();
                this.fill_ = str;
                onChanged();
                return this;
            }

            public Builder setFillBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.fill_ = byteString;
                onChanged();
                return this;
            }

            public Builder setFontStyle(int i10) {
                this.fontStyle_ = i10;
                onChanged();
                return this;
            }

            public Builder setHeight(int i10) {
                this.height_ = i10;
                onChanged();
                return this;
            }

            public Builder setHideafter(int i10) {
                this.hideafter_ = i10;
                onChanged();
                return this;
            }

            public Builder setMargin(float f10) {
                this.margin_ = f10;
                onChanged();
                return this;
            }

            public Builder setOpacity(float f10) {
                this.opacity_ = f10;
                onChanged();
                return this;
            }

            public Builder setOutlined(boolean z10) {
                this.outlined_ = z10;
                onChanged();
                return this;
            }

            public Builder setPadding(float f10) {
                this.padding_ = f10;
                onChanged();
                return this;
            }

            public Builder setShadow(String str) {
                str.getClass();
                this.shadow_ = str;
                onChanged();
                return this;
            }

            public Builder setShadowBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.shadow_ = byteString;
                onChanged();
                return this;
            }

            public Builder setStroke(String str) {
                str.getClass();
                this.stroke_ = str;
                onChanged();
                return this;
            }

            public Builder setStrokeBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.stroke_ = byteString;
                onChanged();
                return this;
            }

            public Builder setStrokeWidth(float f10) {
                this.strokeWidth_ = f10;
                onChanged();
                return this;
            }

            public Builder setStyle(String str) {
                str.getClass();
                this.style_ = str;
                onChanged();
                return this;
            }

            public Builder setStyleBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.style_ = byteString;
                onChanged();
                return this;
            }

            public Builder setVisible(boolean z10) {
                this.visible_ = z10;
                onChanged();
                return this;
            }

            public Builder setWidth(int i10) {
                this.width_ = i10;
                onChanged();
                return this;
            }

            public Builder setX(String str) {
                str.getClass();
                this.x_ = str;
                onChanged();
                return this;
            }

            public Builder setXBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.x_ = byteString;
                onChanged();
                return this;
            }

            public Builder setY(String str) {
                str.getClass();
                this.y_ = str;
                onChanged();
                return this;
            }

            public Builder setYBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.y_ = byteString;
                onChanged();
                return this;
            }

            private Builder() {
                this.content_ = "";
                this.fill_ = "";
                this.shadow_ = "";
                this.stroke_ = "";
                this.style_ = "";
                this.x_ = "";
                this.y_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public AssetModel build() {
                AssetModel assetModelBuildPartial = buildPartial();
                if (assetModelBuildPartial.isInitialized()) {
                    return assetModelBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) assetModelBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public AssetModel buildPartial() {
                AssetModel assetModel = new AssetModel(this);
                assetModel.content_ = this.content_;
                assetModel.fill_ = this.fill_;
                assetModel.fontStyle_ = this.fontStyle_;
                assetModel.height_ = this.height_;
                assetModel.hideafter_ = this.hideafter_;
                assetModel.margin_ = this.margin_;
                assetModel.opacity_ = this.opacity_;
                assetModel.outlined_ = this.outlined_;
                assetModel.padding_ = this.padding_;
                assetModel.shadow_ = this.shadow_;
                assetModel.stroke_ = this.stroke_;
                assetModel.strokeWidth_ = this.strokeWidth_;
                assetModel.style_ = this.style_;
                assetModel.visible_ = this.visible_;
                assetModel.width_ = this.width_;
                assetModel.x_ = this.x_;
                assetModel.y_ = this.y_;
                onBuilt();
                return assetModel;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public AssetModel getDefaultInstanceForType() {
                return AssetModel.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public final Builder setUnknownFields(r2 r2Var) {
                return (Builder) super.setUnknownFields(r2Var);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder mergeUnknownFields(r2 r2Var) {
                return (Builder) super.mergeUnknownFields(r2Var);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.content_ = "";
                this.fill_ = "";
                this.fontStyle_ = 0;
                this.height_ = 0;
                this.hideafter_ = 0;
                this.margin_ = 0.0f;
                this.opacity_ = 0.0f;
                this.outlined_ = false;
                this.padding_ = 0.0f;
                this.shadow_ = "";
                this.stroke_ = "";
                this.strokeWidth_ = 0.0f;
                this.style_ = "";
                this.visible_ = false;
                this.width_ = 0;
                this.x_ = "";
                this.y_ = "";
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4427clone() {
                return (Builder) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AssetModel) {
                    return mergeFrom((AssetModel) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AssetModel assetModel) {
                if (assetModel == AssetModel.getDefaultInstance()) {
                    return this;
                }
                if (!assetModel.getContent().isEmpty()) {
                    this.content_ = assetModel.content_;
                    onChanged();
                }
                if (!assetModel.getFill().isEmpty()) {
                    this.fill_ = assetModel.fill_;
                    onChanged();
                }
                if (assetModel.getFontStyle() != 0) {
                    setFontStyle(assetModel.getFontStyle());
                }
                if (assetModel.getHeight() != 0) {
                    setHeight(assetModel.getHeight());
                }
                if (assetModel.getHideafter() != 0) {
                    setHideafter(assetModel.getHideafter());
                }
                if (assetModel.getMargin() != 0.0f) {
                    setMargin(assetModel.getMargin());
                }
                if (assetModel.getOpacity() != 0.0f) {
                    setOpacity(assetModel.getOpacity());
                }
                if (assetModel.getOutlined()) {
                    setOutlined(assetModel.getOutlined());
                }
                if (assetModel.getPadding() != 0.0f) {
                    setPadding(assetModel.getPadding());
                }
                if (!assetModel.getShadow().isEmpty()) {
                    this.shadow_ = assetModel.shadow_;
                    onChanged();
                }
                if (!assetModel.getStroke().isEmpty()) {
                    this.stroke_ = assetModel.stroke_;
                    onChanged();
                }
                if (assetModel.getStrokeWidth() != 0.0f) {
                    setStrokeWidth(assetModel.getStrokeWidth());
                }
                if (!assetModel.getStyle().isEmpty()) {
                    this.style_ = assetModel.style_;
                    onChanged();
                }
                if (assetModel.getVisible()) {
                    setVisible(assetModel.getVisible());
                }
                if (assetModel.getWidth() != 0) {
                    setWidth(assetModel.getWidth());
                }
                if (!assetModel.getX().isEmpty()) {
                    this.x_ = assetModel.x_;
                    onChanged();
                }
                if (!assetModel.getY().isEmpty()) {
                    this.y_ = assetModel.y_;
                    onChanged();
                }
                mergeUnknownFields(((h0) assetModel).unknownFields);
                onChanged();
                return this;
            }

            private Builder(h0.c cVar) {
                super(cVar);
                this.content_ = "";
                this.fill_ = "";
                this.shadow_ = "";
                this.stroke_ = "";
                this.style_ = "";
                this.x_ = "";
                this.y_ = "";
                maybeForceBuilderInitialization();
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public io.bidmachine.protobuf.CreativeExtension.AssetModel.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.CreativeExtension.AssetModel.access$2200()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.CreativeExtension$AssetModel r3 = (io.bidmachine.protobuf.CreativeExtension.AssetModel) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    if (r3 == 0) goto L10
                    r2.mergeFrom(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                    io.bidmachine.protobuf.CreativeExtension$AssetModel r4 = (io.bidmachine.protobuf.CreativeExtension.AssetModel) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.mergeFrom(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.CreativeExtension.AssetModel.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.CreativeExtension$AssetModel$Builder");
            }
        }

        public static Builder newBuilder(AssetModel assetModel) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(assetModel);
        }

        public static AssetModel parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (AssetModel) PARSER.parseFrom(byteBuffer, wVar);
        }

        private AssetModel(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AssetModel parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (AssetModel) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static AssetModel parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AssetModel) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public AssetModel getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static AssetModel parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (AssetModel) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private AssetModel() {
            this.memoizedIsInitialized = (byte) -1;
            this.content_ = "";
            this.fill_ = "";
            this.shadow_ = "";
            this.stroke_ = "";
            this.style_ = "";
            this.x_ = "";
            this.y_ = "";
        }

        public static AssetModel parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AssetModel) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static AssetModel parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (AssetModel) PARSER.parseFrom(bArr, wVar);
        }

        public static AssetModel parseFrom(InputStream inputStream) throws IOException {
            return (AssetModel) h0.parseWithIOException(PARSER, inputStream);
        }

        public static AssetModel parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (AssetModel) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static AssetModel parseFrom(l lVar) throws IOException {
            return (AssetModel) h0.parseWithIOException(PARSER, lVar);
        }

        public static AssetModel parseFrom(l lVar, w wVar) throws IOException {
            return (AssetModel) h0.parseWithIOException(PARSER, lVar, wVar);
        }

        private AssetModel(l lVar, w wVar) throws InvalidProtocolBufferException {
            this();
            wVar.getClass();
            r2.b bVarG = r2.g();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iK = lVar.K();
                        switch (iK) {
                            case 0:
                                z10 = true;
                                break;
                            case 10:
                                this.content_ = lVar.J();
                                break;
                            case 18:
                                this.fill_ = lVar.J();
                                break;
                            case 24:
                                this.fontStyle_ = lVar.L();
                                break;
                            case 32:
                                this.height_ = lVar.L();
                                break;
                            case 40:
                                this.hideafter_ = lVar.L();
                                break;
                            case 53:
                                this.margin_ = lVar.w();
                                break;
                            case 61:
                                this.opacity_ = lVar.w();
                                break;
                            case 64:
                                this.outlined_ = lVar.q();
                                break;
                            case 77:
                                this.padding_ = lVar.w();
                                break;
                            case 82:
                                this.shadow_ = lVar.J();
                                break;
                            case 90:
                                this.stroke_ = lVar.J();
                                break;
                            case 106:
                                this.style_ = lVar.J();
                                break;
                            case 112:
                                this.visible_ = lVar.q();
                                break;
                            case 120:
                                this.width_ = lVar.L();
                                break;
                            case 130:
                                this.x_ = lVar.J();
                                break;
                            case 138:
                                this.y_ = lVar.J();
                                break;
                            case 149:
                                this.strokeWidth_ = lVar.w();
                                break;
                            default:
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                    z10 = true;
                                }
                                break;
                        }
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }
    }

    public interface AssetModelOrBuilder extends MessageOrBuilder {
        String getContent();

        ByteString getContentBytes();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        String getFill();

        ByteString getFillBytes();

        int getFontStyle();

        int getHeight();

        int getHideafter();

        float getMargin();

        float getOpacity();

        boolean getOutlined();

        float getPadding();

        String getShadow();

        ByteString getShadowBytes();

        String getStroke();

        ByteString getStrokeBytes();

        float getStrokeWidth();

        String getStyle();

        ByteString getStyleBytes();

        boolean getVisible();

        int getWidth();

        String getX();

        ByteString getXBytes();

        String getY();

        ByteString getYBytes();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class Feature extends h0 implements FeatureOrBuilder {
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int VALUE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private volatile Object value_;
        private static final Feature DEFAULT_INSTANCE = new Feature();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.CreativeExtension.Feature.1
            @Override // com.explorestack.protobuf.p1
            public Feature parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new Feature(lVar, wVar);
            }
        };

        public static Feature getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_Feature_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Feature parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Feature) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Feature parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Feature) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Feature)) {
                return super.equals(obj);
            }
            Feature feature = (Feature) obj;
            return getName().equals(feature.getName()) && getValue().equals(feature.getValue()) && this.unknownFields.equals(feature.unknownFields);
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.FeatureOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.FeatureOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = !getNameBytes().isEmpty() ? h0.computeStringSize(1, this.name_) : 0;
            if (!getValueBytes().isEmpty()) {
                iComputeStringSize += h0.computeStringSize(2, this.value_);
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.FeatureOrBuilder
        public String getValue() {
            Object obj = this.value_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.value_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.FeatureOrBuilder
        public ByteString getValueBytes() {
            Object obj = this.value_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.value_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode()) * 37) + 2) * 53) + getValue().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_Feature_fieldAccessorTable.d(Feature.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.explorestack.protobuf.h0
        protected Object newInstance(h0.g gVar) {
            return new Feature();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            if (!getNameBytes().isEmpty()) {
                h0.writeString(nVar, 1, this.name_);
            }
            if (!getValueBytes().isEmpty()) {
                h0.writeString(nVar, 2, this.value_);
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements FeatureOrBuilder {
            private Object name_;
            private Object value_;

            public static final Descriptors.Descriptor getDescriptor() {
                return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_Feature_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = h0.alwaysUseFieldBuilders;
            }

            public Builder clearName() {
                this.name_ = Feature.getDefaultInstance().getName();
                onChanged();
                return this;
            }

            public Builder clearValue() {
                this.value_ = Feature.getDefaultInstance().getValue();
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_Feature_descriptor;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.FeatureOrBuilder
            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.name_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.FeatureOrBuilder
            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.FeatureOrBuilder
            public String getValue() {
                Object obj = this.value_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.value_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.FeatureOrBuilder
            public ByteString getValueBytes() {
                Object obj = this.value_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.value_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_Feature_fieldAccessorTable.d(Feature.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setName(String str) {
                str.getClass();
                this.name_ = str;
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.name_ = byteString;
                onChanged();
                return this;
            }

            public Builder setValue(String str) {
                str.getClass();
                this.value_ = str;
                onChanged();
                return this;
            }

            public Builder setValueBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.value_ = byteString;
                onChanged();
                return this;
            }

            private Builder() {
                this.name_ = "";
                this.value_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Feature build() {
                Feature featureBuildPartial = buildPartial();
                if (featureBuildPartial.isInitialized()) {
                    return featureBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) featureBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Feature buildPartial() {
                Feature feature = new Feature(this);
                feature.name_ = this.name_;
                feature.value_ = this.value_;
                onBuilt();
                return feature;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Feature getDefaultInstanceForType() {
                return Feature.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public final Builder setUnknownFields(r2 r2Var) {
                return (Builder) super.setUnknownFields(r2Var);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder mergeUnknownFields(r2 r2Var) {
                return (Builder) super.mergeUnknownFields(r2Var);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.name_ = "";
                this.value_ = "";
                return this;
            }

            private Builder(h0.c cVar) {
                super(cVar);
                this.name_ = "";
                this.value_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4427clone() {
                return (Builder) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Feature) {
                    return mergeFrom((Feature) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Feature feature) {
                if (feature == Feature.getDefaultInstance()) {
                    return this;
                }
                if (!feature.getName().isEmpty()) {
                    this.name_ = feature.name_;
                    onChanged();
                }
                if (!feature.getValue().isEmpty()) {
                    this.value_ = feature.value_;
                    onChanged();
                }
                mergeUnknownFields(((h0) feature).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public io.bidmachine.protobuf.CreativeExtension.Feature.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.CreativeExtension.Feature.access$5800()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.CreativeExtension$Feature r3 = (io.bidmachine.protobuf.CreativeExtension.Feature) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    if (r3 == 0) goto L10
                    r2.mergeFrom(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                    io.bidmachine.protobuf.CreativeExtension$Feature r4 = (io.bidmachine.protobuf.CreativeExtension.Feature) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.mergeFrom(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.CreativeExtension.Feature.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.CreativeExtension$Feature$Builder");
            }
        }

        public static Builder newBuilder(Feature feature) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(feature);
        }

        public static Feature parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (Feature) PARSER.parseFrom(byteBuffer, wVar);
        }

        private Feature(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Feature parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (Feature) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static Feature parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Feature) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Feature getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Feature parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (Feature) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Feature() {
            this.memoizedIsInitialized = (byte) -1;
            this.name_ = "";
            this.value_ = "";
        }

        public static Feature parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Feature) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static Feature parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (Feature) PARSER.parseFrom(bArr, wVar);
        }

        public static Feature parseFrom(InputStream inputStream) throws IOException {
            return (Feature) h0.parseWithIOException(PARSER, inputStream);
        }

        private Feature(l lVar, w wVar) throws InvalidProtocolBufferException {
            this();
            wVar.getClass();
            r2.b bVarG = r2.g();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iK = lVar.K();
                        if (iK != 0) {
                            if (iK == 10) {
                                this.name_ = lVar.J();
                            } else if (iK != 18) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                this.value_ = lVar.J();
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static Feature parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (Feature) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static Feature parseFrom(l lVar) throws IOException {
            return (Feature) h0.parseWithIOException(PARSER, lVar);
        }

        public static Feature parseFrom(l lVar, w wVar) throws IOException {
            return (Feature) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface FeatureOrBuilder extends MessageOrBuilder {
        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        String getName();

        ByteString getNameBytes();

        String getValue();

        ByteString getValueBytes();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class Postbanner extends h0 implements PostbannerOrBuilder {
        public static final int ASSET_FIELD_NUMBER = 3;
        public static final int FEATURES_FIELD_NUMBER = 4;
        public static final int SEQUENCE_FIELD_NUMBER = 2;
        public static final int TPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private AssetAppearance asset_;
        private List<Feature> features_;
        private byte memoizedIsInitialized;
        private int sequence_;
        private int tpe_;
        private static final Postbanner DEFAULT_INSTANCE = new Postbanner();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.CreativeExtension.Postbanner.1
            @Override // com.explorestack.protobuf.p1
            public Postbanner parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new Postbanner(lVar, wVar);
            }
        };

        public static Postbanner getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_Postbanner_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Postbanner parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Postbanner) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Postbanner parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Postbanner) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Postbanner)) {
                return super.equals(obj);
            }
            Postbanner postbanner = (Postbanner) obj;
            if (this.tpe_ == postbanner.tpe_ && getSequence() == postbanner.getSequence() && hasAsset() == postbanner.hasAsset()) {
                return (!hasAsset() || getAsset().equals(postbanner.getAsset())) && getFeaturesList().equals(postbanner.getFeaturesList()) && this.unknownFields.equals(postbanner.unknownFields);
            }
            return false;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
        public AssetAppearance getAsset() {
            AssetAppearance assetAppearance = this.asset_;
            return assetAppearance == null ? AssetAppearance.getDefaultInstance() : assetAppearance;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
        public AssetAppearanceOrBuilder getAssetOrBuilder() {
            return getAsset();
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
        public Feature getFeatures(int i10) {
            return this.features_.get(i10);
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
        public int getFeaturesCount() {
            return this.features_.size();
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
        public List<Feature> getFeaturesList() {
            return this.features_;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
        public FeatureOrBuilder getFeaturesOrBuilder(int i10) {
            return this.features_.get(i10);
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
        public List<? extends FeatureOrBuilder> getFeaturesOrBuilderList() {
            return this.features_;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public p1 getParserForType() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
        public int getSequence() {
            return this.sequence_;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iL = this.tpe_ != PostbannerType.DISABLED.getNumber() ? n.l(1, this.tpe_) : 0;
            int i11 = this.sequence_;
            if (i11 != 0) {
                iL += n.Y(2, i11);
            }
            if (this.asset_ != null) {
                iL += n.G(3, getAsset());
            }
            for (int i12 = 0; i12 < this.features_.size(); i12++) {
                iL += n.G(4, this.features_.get(i12));
            }
            int serializedSize = iL + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
        public PostbannerType getTpe() {
            PostbannerType postbannerTypeValueOf = PostbannerType.valueOf(this.tpe_);
            return postbannerTypeValueOf == null ? PostbannerType.UNRECOGNIZED : postbannerTypeValueOf;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
        public int getTpeValue() {
            return this.tpe_;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
        public boolean hasAsset() {
            return this.asset_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.tpe_) * 37) + 2) * 53) + getSequence();
            if (hasAsset()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getAsset().hashCode();
            }
            if (getFeaturesCount() > 0) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getFeaturesList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_Postbanner_fieldAccessorTable.d(Postbanner.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.explorestack.protobuf.h0
        protected Object newInstance(h0.g gVar) {
            return new Postbanner();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            if (this.tpe_ != PostbannerType.DISABLED.getNumber()) {
                nVar.v0(1, this.tpe_);
            }
            int i10 = this.sequence_;
            if (i10 != 0) {
                nVar.W0(2, i10);
            }
            if (this.asset_ != null) {
                nVar.J0(3, getAsset());
            }
            for (int i11 = 0; i11 < this.features_.size(); i11++) {
                nVar.J0(4, this.features_.get(i11));
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements PostbannerOrBuilder {
            private a2 assetBuilder_;
            private AssetAppearance asset_;
            private int bitField0_;
            private v1 featuresBuilder_;
            private List<Feature> features_;
            private int sequence_;
            private int tpe_;

            private void ensureFeaturesIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.features_ = new ArrayList(this.features_);
                    this.bitField0_ |= 1;
                }
            }

            private a2 getAssetFieldBuilder() {
                if (this.assetBuilder_ == null) {
                    this.assetBuilder_ = new a2(getAsset(), getParentForChildren(), isClean());
                    this.asset_ = null;
                }
                return this.assetBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_Postbanner_descriptor;
            }

            private v1 getFeaturesFieldBuilder() {
                if (this.featuresBuilder_ == null) {
                    this.featuresBuilder_ = new v1(this.features_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.features_ = null;
                }
                return this.featuresBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (h0.alwaysUseFieldBuilders) {
                    getFeaturesFieldBuilder();
                }
            }

            public Builder addAllFeatures(Iterable<? extends Feature> iterable) {
                v1 v1Var = this.featuresBuilder_;
                if (v1Var != null) {
                    v1Var.a(iterable);
                    return this;
                }
                ensureFeaturesIsMutable();
                a.AbstractC0320a.addAll((Iterable) iterable, (List) this.features_);
                onChanged();
                return this;
            }

            public Builder addFeatures(Feature feature) {
                v1 v1Var = this.featuresBuilder_;
                if (v1Var != null) {
                    v1Var.e(feature);
                    return this;
                }
                feature.getClass();
                ensureFeaturesIsMutable();
                this.features_.add(feature);
                onChanged();
                return this;
            }

            public Feature.Builder addFeaturesBuilder() {
                return (Feature.Builder) getFeaturesFieldBuilder().c(Feature.getDefaultInstance());
            }

            public Builder clearAsset() {
                if (this.assetBuilder_ == null) {
                    this.asset_ = null;
                    onChanged();
                    return this;
                }
                this.asset_ = null;
                this.assetBuilder_ = null;
                return this;
            }

            public Builder clearFeatures() {
                v1 v1Var = this.featuresBuilder_;
                if (v1Var != null) {
                    v1Var.g();
                    return this;
                }
                this.features_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearSequence() {
                this.sequence_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTpe() {
                this.tpe_ = 0;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
            public AssetAppearance getAsset() {
                a2 a2Var = this.assetBuilder_;
                if (a2Var != null) {
                    return (AssetAppearance) a2Var.e();
                }
                AssetAppearance assetAppearance = this.asset_;
                return assetAppearance == null ? AssetAppearance.getDefaultInstance() : assetAppearance;
            }

            public AssetAppearance.Builder getAssetBuilder() {
                onChanged();
                return (AssetAppearance.Builder) getAssetFieldBuilder().d();
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
            public AssetAppearanceOrBuilder getAssetOrBuilder() {
                a2 a2Var = this.assetBuilder_;
                if (a2Var != null) {
                    return (AssetAppearanceOrBuilder) a2Var.f();
                }
                AssetAppearance assetAppearance = this.asset_;
                return assetAppearance == null ? AssetAppearance.getDefaultInstance() : assetAppearance;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_Postbanner_descriptor;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
            public Feature getFeatures(int i10) {
                v1 v1Var = this.featuresBuilder_;
                return v1Var == null ? this.features_.get(i10) : (Feature) v1Var.n(i10);
            }

            public Feature.Builder getFeaturesBuilder(int i10) {
                return (Feature.Builder) getFeaturesFieldBuilder().k(i10);
            }

            public List<Feature.Builder> getFeaturesBuilderList() {
                return getFeaturesFieldBuilder().l();
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
            public int getFeaturesCount() {
                v1 v1Var = this.featuresBuilder_;
                return v1Var == null ? this.features_.size() : v1Var.m();
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
            public List<Feature> getFeaturesList() {
                v1 v1Var = this.featuresBuilder_;
                return v1Var == null ? DesugarCollections.unmodifiableList(this.features_) : v1Var.p();
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
            public FeatureOrBuilder getFeaturesOrBuilder(int i10) {
                v1 v1Var = this.featuresBuilder_;
                return v1Var == null ? this.features_.get(i10) : (FeatureOrBuilder) v1Var.q(i10);
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
            public List<? extends FeatureOrBuilder> getFeaturesOrBuilderList() {
                v1 v1Var = this.featuresBuilder_;
                return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.features_);
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
            public int getSequence() {
                return this.sequence_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
            public PostbannerType getTpe() {
                PostbannerType postbannerTypeValueOf = PostbannerType.valueOf(this.tpe_);
                return postbannerTypeValueOf == null ? PostbannerType.UNRECOGNIZED : postbannerTypeValueOf;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
            public int getTpeValue() {
                return this.tpe_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
            public boolean hasAsset() {
                return (this.assetBuilder_ == null && this.asset_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_Postbanner_fieldAccessorTable.d(Postbanner.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeAsset(AssetAppearance assetAppearance) {
                a2 a2Var = this.assetBuilder_;
                if (a2Var != null) {
                    a2Var.g(assetAppearance);
                    return this;
                }
                AssetAppearance assetAppearance2 = this.asset_;
                if (assetAppearance2 != null) {
                    this.asset_ = AssetAppearance.newBuilder(assetAppearance2).mergeFrom(assetAppearance).buildPartial();
                } else {
                    this.asset_ = assetAppearance;
                }
                onChanged();
                return this;
            }

            public Builder removeFeatures(int i10) {
                v1 v1Var = this.featuresBuilder_;
                if (v1Var != null) {
                    v1Var.v(i10);
                    return this;
                }
                ensureFeaturesIsMutable();
                this.features_.remove(i10);
                onChanged();
                return this;
            }

            public Builder setAsset(AssetAppearance assetAppearance) {
                a2 a2Var = this.assetBuilder_;
                if (a2Var != null) {
                    a2Var.i(assetAppearance);
                    return this;
                }
                assetAppearance.getClass();
                this.asset_ = assetAppearance;
                onChanged();
                return this;
            }

            public Builder setFeatures(int i10, Feature feature) {
                v1 v1Var = this.featuresBuilder_;
                if (v1Var != null) {
                    v1Var.w(i10, feature);
                    return this;
                }
                feature.getClass();
                ensureFeaturesIsMutable();
                this.features_.set(i10, feature);
                onChanged();
                return this;
            }

            public Builder setSequence(int i10) {
                this.sequence_ = i10;
                onChanged();
                return this;
            }

            public Builder setTpe(PostbannerType postbannerType) {
                postbannerType.getClass();
                this.tpe_ = postbannerType.getNumber();
                onChanged();
                return this;
            }

            public Builder setTpeValue(int i10) {
                this.tpe_ = i10;
                onChanged();
                return this;
            }

            private Builder() {
                this.tpe_ = 0;
                this.features_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Postbanner build() {
                Postbanner postbannerBuildPartial = buildPartial();
                if (postbannerBuildPartial.isInitialized()) {
                    return postbannerBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) postbannerBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Postbanner buildPartial() {
                Postbanner postbanner = new Postbanner(this);
                postbanner.tpe_ = this.tpe_;
                postbanner.sequence_ = this.sequence_;
                a2 a2Var = this.assetBuilder_;
                if (a2Var == null) {
                    postbanner.asset_ = this.asset_;
                } else {
                    postbanner.asset_ = (AssetAppearance) a2Var.a();
                }
                v1 v1Var = this.featuresBuilder_;
                if (v1Var != null) {
                    postbanner.features_ = v1Var.f();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.features_ = DesugarCollections.unmodifiableList(this.features_);
                        this.bitField0_ &= -2;
                    }
                    postbanner.features_ = this.features_;
                }
                onBuilt();
                return postbanner;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Postbanner getDefaultInstanceForType() {
                return Postbanner.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public final Builder setUnknownFields(r2 r2Var) {
                return (Builder) super.setUnknownFields(r2Var);
            }

            public Feature.Builder addFeaturesBuilder(int i10) {
                return (Feature.Builder) getFeaturesFieldBuilder().b(i10, Feature.getDefaultInstance());
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder mergeUnknownFields(r2 r2Var) {
                return (Builder) super.mergeUnknownFields(r2Var);
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.tpe_ = 0;
                this.sequence_ = 0;
                if (this.assetBuilder_ == null) {
                    this.asset_ = null;
                } else {
                    this.asset_ = null;
                    this.assetBuilder_ = null;
                }
                v1 v1Var = this.featuresBuilder_;
                if (v1Var == null) {
                    this.features_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -2;
                    return this;
                }
                v1Var.g();
                return this;
            }

            public Builder setAsset(AssetAppearance.Builder builder) {
                a2 a2Var = this.assetBuilder_;
                if (a2Var == null) {
                    this.asset_ = builder.build();
                    onChanged();
                    return this;
                }
                a2Var.i(builder.build());
                return this;
            }

            private Builder(h0.c cVar) {
                super(cVar);
                this.tpe_ = 0;
                this.features_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public Builder addFeatures(int i10, Feature feature) {
                v1 v1Var = this.featuresBuilder_;
                if (v1Var == null) {
                    feature.getClass();
                    ensureFeaturesIsMutable();
                    this.features_.add(i10, feature);
                    onChanged();
                    return this;
                }
                v1Var.d(i10, feature);
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4427clone() {
                return (Builder) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Postbanner) {
                    return mergeFrom((Postbanner) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setFeatures(int i10, Feature.Builder builder) {
                v1 v1Var = this.featuresBuilder_;
                if (v1Var == null) {
                    ensureFeaturesIsMutable();
                    this.features_.set(i10, builder.build());
                    onChanged();
                    return this;
                }
                v1Var.w(i10, builder.build());
                return this;
            }

            public Builder mergeFrom(Postbanner postbanner) {
                if (postbanner == Postbanner.getDefaultInstance()) {
                    return this;
                }
                if (postbanner.tpe_ != 0) {
                    setTpeValue(postbanner.getTpeValue());
                }
                if (postbanner.getSequence() != 0) {
                    setSequence(postbanner.getSequence());
                }
                if (postbanner.hasAsset()) {
                    mergeAsset(postbanner.getAsset());
                }
                if (this.featuresBuilder_ == null) {
                    if (!postbanner.features_.isEmpty()) {
                        if (this.features_.isEmpty()) {
                            this.features_ = postbanner.features_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureFeaturesIsMutable();
                            this.features_.addAll(postbanner.features_);
                        }
                        onChanged();
                    }
                } else if (!postbanner.features_.isEmpty()) {
                    if (!this.featuresBuilder_.t()) {
                        this.featuresBuilder_.a(postbanner.features_);
                    } else {
                        this.featuresBuilder_.h();
                        this.featuresBuilder_ = null;
                        this.features_ = postbanner.features_;
                        this.bitField0_ &= -2;
                        this.featuresBuilder_ = h0.alwaysUseFieldBuilders ? getFeaturesFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((h0) postbanner).unknownFields);
                onChanged();
                return this;
            }

            public Builder addFeatures(Feature.Builder builder) {
                v1 v1Var = this.featuresBuilder_;
                if (v1Var == null) {
                    ensureFeaturesIsMutable();
                    this.features_.add(builder.build());
                    onChanged();
                    return this;
                }
                v1Var.e(builder.build());
                return this;
            }

            public Builder addFeatures(int i10, Feature.Builder builder) {
                v1 v1Var = this.featuresBuilder_;
                if (v1Var == null) {
                    ensureFeaturesIsMutable();
                    this.features_.add(i10, builder.build());
                    onChanged();
                    return this;
                }
                v1Var.d(i10, builder.build());
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public io.bidmachine.protobuf.CreativeExtension.Postbanner.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.CreativeExtension.Postbanner.access$7200()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.CreativeExtension$Postbanner r3 = (io.bidmachine.protobuf.CreativeExtension.Postbanner) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    if (r3 == 0) goto L10
                    r2.mergeFrom(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                    io.bidmachine.protobuf.CreativeExtension$Postbanner r4 = (io.bidmachine.protobuf.CreativeExtension.Postbanner) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.mergeFrom(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.CreativeExtension.Postbanner.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.CreativeExtension$Postbanner$Builder");
            }
        }

        public static Builder newBuilder(Postbanner postbanner) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(postbanner);
        }

        public static Postbanner parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (Postbanner) PARSER.parseFrom(byteBuffer, wVar);
        }

        private Postbanner(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Postbanner parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (Postbanner) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static Postbanner parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Postbanner) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public Postbanner getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Postbanner parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (Postbanner) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Postbanner() {
            this.memoizedIsInitialized = (byte) -1;
            this.tpe_ = 0;
            this.features_ = Collections.EMPTY_LIST;
        }

        public static Postbanner parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Postbanner) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static Postbanner parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (Postbanner) PARSER.parseFrom(bArr, wVar);
        }

        public static Postbanner parseFrom(InputStream inputStream) throws IOException {
            return (Postbanner) h0.parseWithIOException(PARSER, inputStream);
        }

        private Postbanner(l lVar, w wVar) throws InvalidProtocolBufferException {
            this();
            wVar.getClass();
            r2.b bVarG = r2.g();
            boolean z10 = false;
            boolean z11 = false;
            while (!z10) {
                try {
                    try {
                        int iK = lVar.K();
                        if (iK != 0) {
                            if (iK == 8) {
                                this.tpe_ = lVar.t();
                            } else if (iK == 16) {
                                this.sequence_ = lVar.L();
                            } else if (iK == 26) {
                                AssetAppearance assetAppearance = this.asset_;
                                AssetAppearance.Builder builder = assetAppearance != null ? assetAppearance.toBuilder() : null;
                                AssetAppearance assetAppearance2 = (AssetAppearance) lVar.A(AssetAppearance.parser(), wVar);
                                this.asset_ = assetAppearance2;
                                if (builder != null) {
                                    builder.mergeFrom(assetAppearance2);
                                    this.asset_ = builder.buildPartial();
                                }
                            } else if (iK != 34) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                if (!z11) {
                                    this.features_ = new ArrayList();
                                    z11 = true;
                                }
                                this.features_.add((Feature) lVar.A(Feature.parser(), wVar));
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if (z11) {
                        this.features_ = DesugarCollections.unmodifiableList(this.features_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (z11) {
                this.features_ = DesugarCollections.unmodifiableList(this.features_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static Postbanner parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (Postbanner) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static Postbanner parseFrom(l lVar) throws IOException {
            return (Postbanner) h0.parseWithIOException(PARSER, lVar);
        }

        public static Postbanner parseFrom(l lVar, w wVar) throws IOException {
            return (Postbanner) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface PostbannerOrBuilder extends MessageOrBuilder {
        AssetAppearance getAsset();

        AssetAppearanceOrBuilder getAssetOrBuilder();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        Feature getFeatures(int i10);

        int getFeaturesCount();

        List<Feature> getFeaturesList();

        FeatureOrBuilder getFeaturesOrBuilder(int i10);

        List<? extends FeatureOrBuilder> getFeaturesOrBuilderList();

        int getSequence();

        PostbannerType getTpe();

        int getTpeValue();

        boolean hasAsset();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static CreativeExtension getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static CreativeExtension parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CreativeExtension) h0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static CreativeExtension parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CreativeExtension) PARSER.parseFrom(byteBuffer);
    }

    public static p1 parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreativeExtension)) {
            return super.equals(obj);
        }
        CreativeExtension creativeExtension = (CreativeExtension) obj;
        if (hasAsset() != creativeExtension.hasAsset()) {
            return false;
        }
        return (!hasAsset() || getAsset().equals(creativeExtension.getAsset())) && getFeaturesList().equals(creativeExtension.getFeaturesList()) && getPostbannersList().equals(creativeExtension.getPostbannersList()) && this.unknownFields.equals(creativeExtension.unknownFields);
    }

    @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
    public AssetAppearance getAsset() {
        AssetAppearance assetAppearance = this.asset_;
        return assetAppearance == null ? AssetAppearance.getDefaultInstance() : assetAppearance;
    }

    @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
    public AssetAppearanceOrBuilder getAssetOrBuilder() {
        return getAsset();
    }

    @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
    public Feature getFeatures(int i10) {
        return this.features_.get(i10);
    }

    @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
    public int getFeaturesCount() {
        return this.features_.size();
    }

    @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
    public List<Feature> getFeaturesList() {
        return this.features_;
    }

    @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
    public FeatureOrBuilder getFeaturesOrBuilder(int i10) {
        return this.features_.get(i10);
    }

    @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
    public List<? extends FeatureOrBuilder> getFeaturesOrBuilderList() {
        return this.features_;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p1 getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
    public Postbanner getPostbanners(int i10) {
        return this.postbanners_.get(i10);
    }

    @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
    public int getPostbannersCount() {
        return this.postbanners_.size();
    }

    @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
    public List<Postbanner> getPostbannersList() {
        return this.postbanners_;
    }

    @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
    public PostbannerOrBuilder getPostbannersOrBuilder(int i10) {
        return this.postbanners_.get(i10);
    }

    @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
    public List<? extends PostbannerOrBuilder> getPostbannersOrBuilderList() {
        return this.postbanners_;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iG = this.asset_ != null ? n.G(1, getAsset()) : 0;
        for (int i11 = 0; i11 < this.features_.size(); i11++) {
            iG += n.G(2, this.features_.get(i11));
        }
        for (int i12 = 0; i12 < this.postbanners_.size(); i12++) {
            iG += n.G(3, this.postbanners_.get(i12));
        }
        int serializedSize = iG + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final r2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
    public boolean hasAsset() {
        return this.asset_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (hasAsset()) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + getAsset().hashCode();
        }
        if (getFeaturesCount() > 0) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getFeaturesList().hashCode();
        }
        if (getPostbannersCount() > 0) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getPostbannersList().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_fieldAccessorTable.d(CreativeExtension.class, Builder.class);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.memoizedIsInitialized;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.h0
    protected Object newInstance(h0.g gVar) {
        return new CreativeExtension();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        if (this.asset_ != null) {
            nVar.J0(1, getAsset());
        }
        for (int i10 = 0; i10 < this.features_.size(); i10++) {
            nVar.J0(2, this.features_.get(i10));
        }
        for (int i11 = 0; i11 < this.postbanners_.size(); i11++) {
            nVar.J0(3, this.postbanners_.get(i11));
        }
        this.unknownFields.writeTo(nVar);
    }

    public static final class Builder extends h0.b implements CreativeExtensionOrBuilder {
        private a2 assetBuilder_;
        private AssetAppearance asset_;
        private int bitField0_;
        private v1 featuresBuilder_;
        private List<Feature> features_;
        private v1 postbannersBuilder_;
        private List<Postbanner> postbanners_;

        private void ensureFeaturesIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.features_ = new ArrayList(this.features_);
                this.bitField0_ |= 1;
            }
        }

        private void ensurePostbannersIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.postbanners_ = new ArrayList(this.postbanners_);
                this.bitField0_ |= 2;
            }
        }

        private a2 getAssetFieldBuilder() {
            if (this.assetBuilder_ == null) {
                this.assetBuilder_ = new a2(getAsset(), getParentForChildren(), isClean());
                this.asset_ = null;
            }
            return this.assetBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_descriptor;
        }

        private v1 getFeaturesFieldBuilder() {
            if (this.featuresBuilder_ == null) {
                this.featuresBuilder_ = new v1(this.features_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.features_ = null;
            }
            return this.featuresBuilder_;
        }

        private v1 getPostbannersFieldBuilder() {
            if (this.postbannersBuilder_ == null) {
                this.postbannersBuilder_ = new v1(this.postbanners_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                this.postbanners_ = null;
            }
            return this.postbannersBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (h0.alwaysUseFieldBuilders) {
                getFeaturesFieldBuilder();
                getPostbannersFieldBuilder();
            }
        }

        public Builder addAllFeatures(Iterable<? extends Feature> iterable) {
            v1 v1Var = this.featuresBuilder_;
            if (v1Var != null) {
                v1Var.a(iterable);
                return this;
            }
            ensureFeaturesIsMutable();
            a.AbstractC0320a.addAll((Iterable) iterable, (List) this.features_);
            onChanged();
            return this;
        }

        public Builder addAllPostbanners(Iterable<? extends Postbanner> iterable) {
            v1 v1Var = this.postbannersBuilder_;
            if (v1Var != null) {
                v1Var.a(iterable);
                return this;
            }
            ensurePostbannersIsMutable();
            a.AbstractC0320a.addAll((Iterable) iterable, (List) this.postbanners_);
            onChanged();
            return this;
        }

        public Builder addFeatures(Feature feature) {
            v1 v1Var = this.featuresBuilder_;
            if (v1Var != null) {
                v1Var.e(feature);
                return this;
            }
            feature.getClass();
            ensureFeaturesIsMutable();
            this.features_.add(feature);
            onChanged();
            return this;
        }

        public Feature.Builder addFeaturesBuilder() {
            return (Feature.Builder) getFeaturesFieldBuilder().c(Feature.getDefaultInstance());
        }

        public Builder addPostbanners(Postbanner postbanner) {
            v1 v1Var = this.postbannersBuilder_;
            if (v1Var != null) {
                v1Var.e(postbanner);
                return this;
            }
            postbanner.getClass();
            ensurePostbannersIsMutable();
            this.postbanners_.add(postbanner);
            onChanged();
            return this;
        }

        public Postbanner.Builder addPostbannersBuilder() {
            return (Postbanner.Builder) getPostbannersFieldBuilder().c(Postbanner.getDefaultInstance());
        }

        public Builder clearAsset() {
            if (this.assetBuilder_ == null) {
                this.asset_ = null;
                onChanged();
                return this;
            }
            this.asset_ = null;
            this.assetBuilder_ = null;
            return this;
        }

        public Builder clearFeatures() {
            v1 v1Var = this.featuresBuilder_;
            if (v1Var != null) {
                v1Var.g();
                return this;
            }
            this.features_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder clearPostbanners() {
            v1 v1Var = this.postbannersBuilder_;
            if (v1Var != null) {
                v1Var.g();
                return this;
            }
            this.postbanners_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
        public AssetAppearance getAsset() {
            a2 a2Var = this.assetBuilder_;
            if (a2Var != null) {
                return (AssetAppearance) a2Var.e();
            }
            AssetAppearance assetAppearance = this.asset_;
            return assetAppearance == null ? AssetAppearance.getDefaultInstance() : assetAppearance;
        }

        public AssetAppearance.Builder getAssetBuilder() {
            onChanged();
            return (AssetAppearance.Builder) getAssetFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
        public AssetAppearanceOrBuilder getAssetOrBuilder() {
            a2 a2Var = this.assetBuilder_;
            if (a2Var != null) {
                return (AssetAppearanceOrBuilder) a2Var.f();
            }
            AssetAppearance assetAppearance = this.asset_;
            return assetAppearance == null ? AssetAppearance.getDefaultInstance() : assetAppearance;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_descriptor;
        }

        @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
        public Feature getFeatures(int i10) {
            v1 v1Var = this.featuresBuilder_;
            return v1Var == null ? this.features_.get(i10) : (Feature) v1Var.n(i10);
        }

        public Feature.Builder getFeaturesBuilder(int i10) {
            return (Feature.Builder) getFeaturesFieldBuilder().k(i10);
        }

        public List<Feature.Builder> getFeaturesBuilderList() {
            return getFeaturesFieldBuilder().l();
        }

        @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
        public int getFeaturesCount() {
            v1 v1Var = this.featuresBuilder_;
            return v1Var == null ? this.features_.size() : v1Var.m();
        }

        @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
        public List<Feature> getFeaturesList() {
            v1 v1Var = this.featuresBuilder_;
            return v1Var == null ? DesugarCollections.unmodifiableList(this.features_) : v1Var.p();
        }

        @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
        public FeatureOrBuilder getFeaturesOrBuilder(int i10) {
            v1 v1Var = this.featuresBuilder_;
            return v1Var == null ? this.features_.get(i10) : (FeatureOrBuilder) v1Var.q(i10);
        }

        @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
        public List<? extends FeatureOrBuilder> getFeaturesOrBuilderList() {
            v1 v1Var = this.featuresBuilder_;
            return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.features_);
        }

        @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
        public Postbanner getPostbanners(int i10) {
            v1 v1Var = this.postbannersBuilder_;
            return v1Var == null ? this.postbanners_.get(i10) : (Postbanner) v1Var.n(i10);
        }

        public Postbanner.Builder getPostbannersBuilder(int i10) {
            return (Postbanner.Builder) getPostbannersFieldBuilder().k(i10);
        }

        public List<Postbanner.Builder> getPostbannersBuilderList() {
            return getPostbannersFieldBuilder().l();
        }

        @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
        public int getPostbannersCount() {
            v1 v1Var = this.postbannersBuilder_;
            return v1Var == null ? this.postbanners_.size() : v1Var.m();
        }

        @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
        public List<Postbanner> getPostbannersList() {
            v1 v1Var = this.postbannersBuilder_;
            return v1Var == null ? DesugarCollections.unmodifiableList(this.postbanners_) : v1Var.p();
        }

        @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
        public PostbannerOrBuilder getPostbannersOrBuilder(int i10) {
            v1 v1Var = this.postbannersBuilder_;
            return v1Var == null ? this.postbanners_.get(i10) : (PostbannerOrBuilder) v1Var.q(i10);
        }

        @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
        public List<? extends PostbannerOrBuilder> getPostbannersOrBuilderList() {
            v1 v1Var = this.postbannersBuilder_;
            return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.postbanners_);
        }

        @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
        public boolean hasAsset() {
            return (this.assetBuilder_ == null && this.asset_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_fieldAccessorTable.d(CreativeExtension.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeAsset(AssetAppearance assetAppearance) {
            a2 a2Var = this.assetBuilder_;
            if (a2Var != null) {
                a2Var.g(assetAppearance);
                return this;
            }
            AssetAppearance assetAppearance2 = this.asset_;
            if (assetAppearance2 != null) {
                this.asset_ = AssetAppearance.newBuilder(assetAppearance2).mergeFrom(assetAppearance).buildPartial();
            } else {
                this.asset_ = assetAppearance;
            }
            onChanged();
            return this;
        }

        public Builder removeFeatures(int i10) {
            v1 v1Var = this.featuresBuilder_;
            if (v1Var != null) {
                v1Var.v(i10);
                return this;
            }
            ensureFeaturesIsMutable();
            this.features_.remove(i10);
            onChanged();
            return this;
        }

        public Builder removePostbanners(int i10) {
            v1 v1Var = this.postbannersBuilder_;
            if (v1Var != null) {
                v1Var.v(i10);
                return this;
            }
            ensurePostbannersIsMutable();
            this.postbanners_.remove(i10);
            onChanged();
            return this;
        }

        public Builder setAsset(AssetAppearance assetAppearance) {
            a2 a2Var = this.assetBuilder_;
            if (a2Var != null) {
                a2Var.i(assetAppearance);
                return this;
            }
            assetAppearance.getClass();
            this.asset_ = assetAppearance;
            onChanged();
            return this;
        }

        public Builder setFeatures(int i10, Feature feature) {
            v1 v1Var = this.featuresBuilder_;
            if (v1Var != null) {
                v1Var.w(i10, feature);
                return this;
            }
            feature.getClass();
            ensureFeaturesIsMutable();
            this.features_.set(i10, feature);
            onChanged();
            return this;
        }

        public Builder setPostbanners(int i10, Postbanner postbanner) {
            v1 v1Var = this.postbannersBuilder_;
            if (v1Var != null) {
                v1Var.w(i10, postbanner);
                return this;
            }
            postbanner.getClass();
            ensurePostbannersIsMutable();
            this.postbanners_.set(i10, postbanner);
            onChanged();
            return this;
        }

        private Builder() {
            List list = Collections.EMPTY_LIST;
            this.features_ = list;
            this.postbanners_ = list;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public CreativeExtension build() {
            CreativeExtension creativeExtensionBuildPartial = buildPartial();
            if (creativeExtensionBuildPartial.isInitialized()) {
                return creativeExtensionBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) creativeExtensionBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public CreativeExtension buildPartial() {
            CreativeExtension creativeExtension = new CreativeExtension(this);
            a2 a2Var = this.assetBuilder_;
            if (a2Var == null) {
                creativeExtension.asset_ = this.asset_;
            } else {
                creativeExtension.asset_ = (AssetAppearance) a2Var.a();
            }
            v1 v1Var = this.featuresBuilder_;
            if (v1Var != null) {
                creativeExtension.features_ = v1Var.f();
            } else {
                if ((this.bitField0_ & 1) != 0) {
                    this.features_ = DesugarCollections.unmodifiableList(this.features_);
                    this.bitField0_ &= -2;
                }
                creativeExtension.features_ = this.features_;
            }
            v1 v1Var2 = this.postbannersBuilder_;
            if (v1Var2 != null) {
                creativeExtension.postbanners_ = v1Var2.f();
            } else {
                if ((this.bitField0_ & 2) != 0) {
                    this.postbanners_ = DesugarCollections.unmodifiableList(this.postbanners_);
                    this.bitField0_ &= -3;
                }
                creativeExtension.postbanners_ = this.postbanners_;
            }
            onBuilt();
            return creativeExtension;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public CreativeExtension getDefaultInstanceForType() {
            return CreativeExtension.getDefaultInstance();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.setField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
            return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public final Builder setUnknownFields(r2 r2Var) {
            return (Builder) super.setUnknownFields(r2Var);
        }

        public Feature.Builder addFeaturesBuilder(int i10) {
            return (Feature.Builder) getFeaturesFieldBuilder().b(i10, Feature.getDefaultInstance());
        }

        public Postbanner.Builder addPostbannersBuilder(int i10) {
            return (Postbanner.Builder) getPostbannersFieldBuilder().b(i10, Postbanner.getDefaultInstance());
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public final Builder mergeUnknownFields(r2 r2Var) {
            return (Builder) super.mergeUnknownFields(r2Var);
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            if (this.assetBuilder_ == null) {
                this.asset_ = null;
            } else {
                this.asset_ = null;
                this.assetBuilder_ = null;
            }
            v1 v1Var = this.featuresBuilder_;
            if (v1Var == null) {
                this.features_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
            } else {
                v1Var.g();
            }
            v1 v1Var2 = this.postbannersBuilder_;
            if (v1Var2 == null) {
                this.postbanners_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
                return this;
            }
            v1Var2.g();
            return this;
        }

        public Builder setAsset(AssetAppearance.Builder builder) {
            a2 a2Var = this.assetBuilder_;
            if (a2Var == null) {
                this.asset_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        private Builder(h0.c cVar) {
            super(cVar);
            List list = Collections.EMPTY_LIST;
            this.features_ = list;
            this.postbanners_ = list;
            maybeForceBuilderInitialization();
        }

        public Builder addFeatures(int i10, Feature feature) {
            v1 v1Var = this.featuresBuilder_;
            if (v1Var == null) {
                feature.getClass();
                ensureFeaturesIsMutable();
                this.features_.add(i10, feature);
                onChanged();
                return this;
            }
            v1Var.d(i10, feature);
            return this;
        }

        public Builder addPostbanners(int i10, Postbanner postbanner) {
            v1 v1Var = this.postbannersBuilder_;
            if (v1Var == null) {
                postbanner.getClass();
                ensurePostbannersIsMutable();
                this.postbanners_.add(i10, postbanner);
                onChanged();
                return this;
            }
            v1Var.d(i10, postbanner);
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4427clone() {
            return (Builder) super.mo4427clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof CreativeExtension) {
                return mergeFrom((CreativeExtension) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setFeatures(int i10, Feature.Builder builder) {
            v1 v1Var = this.featuresBuilder_;
            if (v1Var == null) {
                ensureFeaturesIsMutable();
                this.features_.set(i10, builder.build());
                onChanged();
                return this;
            }
            v1Var.w(i10, builder.build());
            return this;
        }

        public Builder setPostbanners(int i10, Postbanner.Builder builder) {
            v1 v1Var = this.postbannersBuilder_;
            if (v1Var == null) {
                ensurePostbannersIsMutable();
                this.postbanners_.set(i10, builder.build());
                onChanged();
                return this;
            }
            v1Var.w(i10, builder.build());
            return this;
        }

        public Builder mergeFrom(CreativeExtension creativeExtension) {
            if (creativeExtension == CreativeExtension.getDefaultInstance()) {
                return this;
            }
            if (creativeExtension.hasAsset()) {
                mergeAsset(creativeExtension.getAsset());
            }
            if (this.featuresBuilder_ == null) {
                if (!creativeExtension.features_.isEmpty()) {
                    if (this.features_.isEmpty()) {
                        this.features_ = creativeExtension.features_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureFeaturesIsMutable();
                        this.features_.addAll(creativeExtension.features_);
                    }
                    onChanged();
                }
            } else if (!creativeExtension.features_.isEmpty()) {
                if (!this.featuresBuilder_.t()) {
                    this.featuresBuilder_.a(creativeExtension.features_);
                } else {
                    this.featuresBuilder_.h();
                    this.featuresBuilder_ = null;
                    this.features_ = creativeExtension.features_;
                    this.bitField0_ &= -2;
                    this.featuresBuilder_ = h0.alwaysUseFieldBuilders ? getFeaturesFieldBuilder() : null;
                }
            }
            if (this.postbannersBuilder_ == null) {
                if (!creativeExtension.postbanners_.isEmpty()) {
                    if (this.postbanners_.isEmpty()) {
                        this.postbanners_ = creativeExtension.postbanners_;
                        this.bitField0_ &= -3;
                    } else {
                        ensurePostbannersIsMutable();
                        this.postbanners_.addAll(creativeExtension.postbanners_);
                    }
                    onChanged();
                }
            } else if (!creativeExtension.postbanners_.isEmpty()) {
                if (!this.postbannersBuilder_.t()) {
                    this.postbannersBuilder_.a(creativeExtension.postbanners_);
                } else {
                    this.postbannersBuilder_.h();
                    this.postbannersBuilder_ = null;
                    this.postbanners_ = creativeExtension.postbanners_;
                    this.bitField0_ &= -3;
                    this.postbannersBuilder_ = h0.alwaysUseFieldBuilders ? getPostbannersFieldBuilder() : null;
                }
            }
            mergeUnknownFields(((h0) creativeExtension).unknownFields);
            onChanged();
            return this;
        }

        public Builder addFeatures(Feature.Builder builder) {
            v1 v1Var = this.featuresBuilder_;
            if (v1Var == null) {
                ensureFeaturesIsMutable();
                this.features_.add(builder.build());
                onChanged();
                return this;
            }
            v1Var.e(builder.build());
            return this;
        }

        public Builder addPostbanners(Postbanner.Builder builder) {
            v1 v1Var = this.postbannersBuilder_;
            if (v1Var == null) {
                ensurePostbannersIsMutable();
                this.postbanners_.add(builder.build());
                onChanged();
                return this;
            }
            v1Var.e(builder.build());
            return this;
        }

        public Builder addFeatures(int i10, Feature.Builder builder) {
            v1 v1Var = this.featuresBuilder_;
            if (v1Var == null) {
                ensureFeaturesIsMutable();
                this.features_.add(i10, builder.build());
                onChanged();
                return this;
            }
            v1Var.d(i10, builder.build());
            return this;
        }

        public Builder addPostbanners(int i10, Postbanner.Builder builder) {
            v1 v1Var = this.postbannersBuilder_;
            if (v1Var == null) {
                ensurePostbannersIsMutable();
                this.postbanners_.add(i10, builder.build());
                onChanged();
                return this;
            }
            v1Var.d(i10, builder.build());
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public io.bidmachine.protobuf.CreativeExtension.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.CreativeExtension.access$8400()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.CreativeExtension r3 = (io.bidmachine.protobuf.CreativeExtension) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                if (r3 == 0) goto L10
                r2.mergeFrom(r3)
            L10:
                return r2
            L11:
                r3 = move-exception
                goto L21
            L13:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                io.bidmachine.protobuf.CreativeExtension r4 = (io.bidmachine.protobuf.CreativeExtension) r4     // Catch: java.lang.Throwable -> L11
                java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                throw r3     // Catch: java.lang.Throwable -> L1f
            L1f:
                r3 = move-exception
                r0 = r4
            L21:
                if (r0 == 0) goto L26
                r2.mergeFrom(r0)
            L26:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.CreativeExtension.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.CreativeExtension$Builder");
        }
    }

    public static Builder newBuilder(CreativeExtension creativeExtension) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(creativeExtension);
    }

    public static CreativeExtension parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
        return (CreativeExtension) PARSER.parseFrom(byteBuffer, wVar);
    }

    private CreativeExtension(h0.b bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static CreativeExtension parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
        return (CreativeExtension) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
    }

    public static CreativeExtension parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CreativeExtension) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public CreativeExtension getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static CreativeExtension parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
        return (CreativeExtension) PARSER.parseFrom(byteString, wVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private CreativeExtension() {
        this.memoizedIsInitialized = (byte) -1;
        List list = Collections.EMPTY_LIST;
        this.features_ = list;
        this.postbanners_ = list;
    }

    public static CreativeExtension parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CreativeExtension) PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    public Builder newBuilderForType(h0.c cVar) {
        return new Builder(cVar);
    }

    public static CreativeExtension parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
        return (CreativeExtension) PARSER.parseFrom(bArr, wVar);
    }

    public static CreativeExtension parseFrom(InputStream inputStream) throws IOException {
        return (CreativeExtension) h0.parseWithIOException(PARSER, inputStream);
    }

    private CreativeExtension(l lVar, w wVar) throws InvalidProtocolBufferException {
        this();
        wVar.getClass();
        r2.b bVarG = r2.g();
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    try {
                        int iK = lVar.K();
                        if (iK != 0) {
                            if (iK == 10) {
                                AssetAppearance assetAppearance = this.asset_;
                                AssetAppearance.Builder builder = assetAppearance != null ? assetAppearance.toBuilder() : null;
                                AssetAppearance assetAppearance2 = (AssetAppearance) lVar.A(AssetAppearance.parser(), wVar);
                                this.asset_ = assetAppearance2;
                                if (builder != null) {
                                    builder.mergeFrom(assetAppearance2);
                                    this.asset_ = builder.buildPartial();
                                }
                            } else if (iK == 18) {
                                if ((i10 & 1) == 0) {
                                    this.features_ = new ArrayList();
                                    i10 |= 1;
                                }
                                this.features_.add((Feature) lVar.A(Feature.parser(), wVar));
                            } else if (iK != 26) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                if ((i10 & 2) == 0) {
                                    this.postbanners_ = new ArrayList();
                                    i10 |= 2;
                                }
                                this.postbanners_.add((Postbanner) lVar.A(Postbanner.parser(), wVar));
                            }
                        }
                        z10 = true;
                    } catch (IOException e10) {
                        throw new InvalidProtocolBufferException(e10).setUnfinishedMessage(this);
                    }
                } catch (InvalidProtocolBufferException e11) {
                    throw e11.setUnfinishedMessage(this);
                }
            } catch (Throwable th2) {
                if ((i10 & 1) != 0) {
                    this.features_ = DesugarCollections.unmodifiableList(this.features_);
                }
                if ((i10 & 2) != 0) {
                    this.postbanners_ = DesugarCollections.unmodifiableList(this.postbanners_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        if ((i10 & 1) != 0) {
            this.features_ = DesugarCollections.unmodifiableList(this.features_);
        }
        if ((i10 & 2) != 0) {
            this.postbanners_ = DesugarCollections.unmodifiableList(this.postbanners_);
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }

    public static CreativeExtension parseFrom(InputStream inputStream, w wVar) throws IOException {
        return (CreativeExtension) h0.parseWithIOException(PARSER, inputStream, wVar);
    }

    public static CreativeExtension parseFrom(l lVar) throws IOException {
        return (CreativeExtension) h0.parseWithIOException(PARSER, lVar);
    }

    public static CreativeExtension parseFrom(l lVar, w wVar) throws IOException {
        return (CreativeExtension) h0.parseWithIOException(PARSER, lVar, wVar);
    }
}
