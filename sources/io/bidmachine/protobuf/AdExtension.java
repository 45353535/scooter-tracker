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
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.h0;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.l;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.p1;
import com.explorestack.protobuf.r2;
import com.explorestack.protobuf.u0;
import com.explorestack.protobuf.v1;
import com.explorestack.protobuf.w;
import com.explorestack.protobuf.w0;
import com.explorestack.protobuf.z2;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import io.bidmachine.protobuf.CreativeExtension;
import io.bidmachine.protobuf.rendering.Rendering;
import io.bidmachine.protobuf.rendering.RenderingOrBuilder;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class AdExtension extends h0 implements AdExtensionOrBuilder {
    public static final int AD_CACHE_CONTROL_FIELD_NUMBER = 21;
    public static final int AD_CACHE_MAX_AGE_FIELD_NUMBER = 22;
    public static final int AD_FLEXIBLE_SIZE_FIELD_NUMBER = 32;
    public static final int AD_MARKUP_LOADING_TIMEOUT_FIELD_NUMBER = 24;
    public static final int CLOSE_BUTTON_FIELD_NUMBER = 15;
    public static final int COMPANION_SKIPOFFSET_FIELD_NUMBER = 10;
    public static final int COUNTDOWN_FIELD_NUMBER = 14;
    public static final int CREATIVE_EXTENSION_FIELD_NUMBER = 31;
    public static final int CREATIVE_LOADING_METHOD_FIELD_NUMBER = 27;
    public static final int CREATIVE_LOADING_TIMEOUT_FIELD_NUMBER = 35;
    public static final int CRID_MONITORING_ENABLED_FIELD_NUMBER = 36;
    public static final int CUSTOM_PARAMS_FIELD_NUMBER = 8;
    public static final int EVENT_CONFIGURATION_FIELD_NUMBER = 29;
    public static final int EVENT_FIELD_NUMBER = 7;
    public static final int IGNORES_SAFE_AREA_LAYOUT_GUIDE_FIELD_NUMBER = 16;
    public static final int LOAD_SKIPOFFSET_FIELD_NUMBER = 3;
    public static final int MRAID_CREATIVE_VALIDATION_REQUIRED_FIELD_NUMBER = 34;
    public static final int PLACEHOLDER_TIMEOUT_FIELD_NUMBER = 28;
    public static final int PRELOAD_AD_FIELD_NUMBER = 26;
    public static final int PRELOAD_FIELD_NUMBER = 2;
    public static final int PROGRESS_DURATION_FIELD_NUMBER = 19;
    public static final int PROGRESS_FIELD_NUMBER = 18;
    public static final int R1_DELAY_FIELD_NUMBER = 23;
    public static final int R1_FIELD_NUMBER = 12;
    public static final int R2_FIELD_NUMBER = 13;
    public static final int RENDERING_CONFIGURATION_FIELD_NUMBER = 33;
    public static final int SKIPOFFSET_FIELD_NUMBER = 9;
    public static final int STORE_URL_FIELD_NUMBER = 17;
    public static final int USE_EMBEDDED_BROWSER_FIELD_NUMBER = 25;
    public static final int USE_NATIVE_CLOSE_FIELD_NUMBER = 11;
    public static final int VIEWABILITY_DURATION_THRESHOLD_FIELD_NUMBER = 6;
    public static final int VIEWABILITY_IGNORE_OVERLAP_FIELD_NUMBER = 30;
    public static final int VIEWABILITY_IGNORE_WINDOW_FOCUS_FIELD_NUMBER = 20;
    public static final int VIEWABILITY_PIXEL_THRESHOLD_FIELD_NUMBER = 5;
    public static final int VIEWABILITY_TIME_THRESHOLD_FIELD_NUMBER = 4;
    private static final long serialVersionUID = 0;
    private int adCacheControl_;
    private int adCacheMaxAge_;
    private boolean adFlexibleSize_;
    private int adMarkupLoadingTimeout_;
    private ControlAsset closeButton_;
    private int companionSkipoffset_;
    private ControlAsset countdown_;
    private CreativeExtension creativeExtension_;
    private int creativeLoadingMethod_;
    private int creativeLoadingTimeout_;
    private boolean cridMonitoringEnabled_;
    private w0 customParams_;
    private EventConfiguration eventConfiguration_;
    private List<Ad.Event> event_;
    private boolean ignoresSafeAreaLayoutGuide_;
    private int loadSkipoffset_;
    private byte memoizedIsInitialized;
    private boolean mraidCreativeValidationRequired_;
    private float placeholderTimeout_;
    private boolean preloadAd_;
    private boolean preload_;
    private int progressDuration_;
    private ControlAsset progress_;
    private int r1Delay_;
    private boolean r1_;
    private boolean r2_;
    private Rendering renderingConfiguration_;
    private int skipoffset_;
    private volatile Object storeUrl_;
    private boolean useEmbeddedBrowser_;
    private boolean useNativeClose_;
    private float viewabilityDurationThreshold_;
    private boolean viewabilityIgnoreOverlap_;
    private boolean viewabilityIgnoreWindowFocus_;
    private float viewabilityPixelThreshold_;
    private int viewabilityTimeThreshold_;
    private static final AdExtension DEFAULT_INSTANCE = new AdExtension();
    private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.AdExtension.1
        @Override // com.explorestack.protobuf.p1
        public AdExtension parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
            return new AdExtension(lVar, wVar);
        }
    };

    public static final class ControlAsset extends h0 implements ControlAssetOrBuilder {
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
        private volatile Object margin_;
        private byte memoizedIsInitialized;
        private float opacity_;
        private boolean outlined_;
        private volatile Object padding_;
        private volatile Object shadow_;
        private float strokeWidth_;
        private volatile Object stroke_;
        private volatile Object style_;
        private boolean visible_;
        private int width_;
        private volatile Object x_;
        private volatile Object y_;
        private static final ControlAsset DEFAULT_INSTANCE = new ControlAsset();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.AdExtension.ControlAsset.1
            @Override // com.explorestack.protobuf.p1
            public ControlAsset parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new ControlAsset(lVar, wVar);
            }
        };

        public static ControlAsset getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_ControlAsset_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ControlAsset parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ControlAsset) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ControlAsset parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ControlAsset) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ControlAsset)) {
                return super.equals(obj);
            }
            ControlAsset controlAsset = (ControlAsset) obj;
            return getContent().equals(controlAsset.getContent()) && getFill().equals(controlAsset.getFill()) && getFontStyle() == controlAsset.getFontStyle() && getHeight() == controlAsset.getHeight() && getHideafter() == controlAsset.getHideafter() && getMargin().equals(controlAsset.getMargin()) && Float.floatToIntBits(getOpacity()) == Float.floatToIntBits(controlAsset.getOpacity()) && getOutlined() == controlAsset.getOutlined() && getPadding().equals(controlAsset.getPadding()) && getShadow().equals(controlAsset.getShadow()) && getStroke().equals(controlAsset.getStroke()) && Float.floatToIntBits(getStrokeWidth()) == Float.floatToIntBits(controlAsset.getStrokeWidth()) && getStyle().equals(controlAsset.getStyle()) && getVisible() == controlAsset.getVisible() && getWidth() == controlAsset.getWidth() && getX().equals(controlAsset.getX()) && getY().equals(controlAsset.getY()) && this.unknownFields.equals(controlAsset.unknownFields);
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public String getContent() {
            Object obj = this.content_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.content_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public ByteString getContentBytes() {
            Object obj = this.content_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.content_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public String getFill() {
            Object obj = this.fill_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.fill_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public ByteString getFillBytes() {
            Object obj = this.fill_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.fill_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public int getFontStyle() {
            return this.fontStyle_;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public int getHeight() {
            return this.height_;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public int getHideafter() {
            return this.hideafter_;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public String getMargin() {
            Object obj = this.margin_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.margin_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public ByteString getMarginBytes() {
            Object obj = this.margin_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.margin_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public float getOpacity() {
            return this.opacity_;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public boolean getOutlined() {
            return this.outlined_;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public String getPadding() {
            Object obj = this.padding_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.padding_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public ByteString getPaddingBytes() {
            Object obj = this.padding_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.padding_ = byteStringCopyFromUtf8;
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
            if (!getMarginBytes().isEmpty()) {
                iComputeStringSize += h0.computeStringSize(6, this.margin_);
            }
            float f10 = this.opacity_;
            if (f10 != 0.0f) {
                iComputeStringSize += n.r(7, f10);
            }
            boolean z10 = this.outlined_;
            if (z10) {
                iComputeStringSize += n.e(8, z10);
            }
            if (!getPaddingBytes().isEmpty()) {
                iComputeStringSize += h0.computeStringSize(9, this.padding_);
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
            float f11 = this.strokeWidth_;
            if (f11 != 0.0f) {
                iComputeStringSize += n.r(18, f11);
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public String getShadow() {
            Object obj = this.shadow_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.shadow_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public ByteString getShadowBytes() {
            Object obj = this.shadow_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.shadow_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public String getStroke() {
            Object obj = this.stroke_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.stroke_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public ByteString getStrokeBytes() {
            Object obj = this.stroke_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.stroke_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public float getStrokeWidth() {
            return this.strokeWidth_;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public String getStyle() {
            Object obj = this.style_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.style_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
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

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public boolean getVisible() {
            return this.visible_;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public int getWidth() {
            return this.width_;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public String getX() {
            Object obj = this.x_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.x_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public ByteString getXBytes() {
            Object obj = this.x_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.x_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public String getY() {
            Object obj = this.y_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.y_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
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
            int iHashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getContent().hashCode()) * 37) + 2) * 53) + getFill().hashCode()) * 37) + 3) * 53) + getFontStyle()) * 37) + 4) * 53) + getHeight()) * 37) + 5) * 53) + getHideafter()) * 37) + 6) * 53) + getMargin().hashCode()) * 37) + 7) * 53) + Float.floatToIntBits(getOpacity())) * 37) + 8) * 53) + j0.d(getOutlined())) * 37) + 9) * 53) + getPadding().hashCode()) * 37) + 10) * 53) + getShadow().hashCode()) * 37) + 11) * 53) + getStroke().hashCode()) * 37) + 18) * 53) + Float.floatToIntBits(getStrokeWidth())) * 37) + 13) * 53) + getStyle().hashCode()) * 37) + 14) * 53) + j0.d(getVisible())) * 37) + 15) * 53) + getWidth()) * 37) + 16) * 53) + getX().hashCode()) * 37) + 17) * 53) + getY().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_ControlAsset_fieldAccessorTable.d(ControlAsset.class, Builder.class);
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
            return new ControlAsset();
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
            if (!getMarginBytes().isEmpty()) {
                h0.writeString(nVar, 6, this.margin_);
            }
            float f10 = this.opacity_;
            if (f10 != 0.0f) {
                nVar.B0(7, f10);
            }
            boolean z10 = this.outlined_;
            if (z10) {
                nVar.n0(8, z10);
            }
            if (!getPaddingBytes().isEmpty()) {
                h0.writeString(nVar, 9, this.padding_);
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
            float f11 = this.strokeWidth_;
            if (f11 != 0.0f) {
                nVar.B0(18, f11);
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements ControlAssetOrBuilder {
            private Object content_;
            private Object fill_;
            private int fontStyle_;
            private int height_;
            private int hideafter_;
            private Object margin_;
            private float opacity_;
            private boolean outlined_;
            private Object padding_;
            private Object shadow_;
            private float strokeWidth_;
            private Object stroke_;
            private Object style_;
            private boolean visible_;
            private int width_;
            private Object x_;
            private Object y_;

            public static final Descriptors.Descriptor getDescriptor() {
                return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_ControlAsset_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = h0.alwaysUseFieldBuilders;
            }

            public Builder clearContent() {
                this.content_ = ControlAsset.getDefaultInstance().getContent();
                onChanged();
                return this;
            }

            public Builder clearFill() {
                this.fill_ = ControlAsset.getDefaultInstance().getFill();
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
                this.margin_ = ControlAsset.getDefaultInstance().getMargin();
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
                this.padding_ = ControlAsset.getDefaultInstance().getPadding();
                onChanged();
                return this;
            }

            public Builder clearShadow() {
                this.shadow_ = ControlAsset.getDefaultInstance().getShadow();
                onChanged();
                return this;
            }

            public Builder clearStroke() {
                this.stroke_ = ControlAsset.getDefaultInstance().getStroke();
                onChanged();
                return this;
            }

            public Builder clearStrokeWidth() {
                this.strokeWidth_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearStyle() {
                this.style_ = ControlAsset.getDefaultInstance().getStyle();
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
                this.x_ = ControlAsset.getDefaultInstance().getX();
                onChanged();
                return this;
            }

            public Builder clearY() {
                this.y_ = ControlAsset.getDefaultInstance().getY();
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public String getContent() {
                Object obj = this.content_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.content_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
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
                return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_ControlAsset_descriptor;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public String getFill() {
                Object obj = this.fill_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.fill_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public ByteString getFillBytes() {
                Object obj = this.fill_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.fill_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public int getFontStyle() {
                return this.fontStyle_;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public int getHeight() {
                return this.height_;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public int getHideafter() {
                return this.hideafter_;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public String getMargin() {
                Object obj = this.margin_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.margin_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public ByteString getMarginBytes() {
                Object obj = this.margin_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.margin_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public float getOpacity() {
                return this.opacity_;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public boolean getOutlined() {
                return this.outlined_;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public String getPadding() {
                Object obj = this.padding_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.padding_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public ByteString getPaddingBytes() {
                Object obj = this.padding_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.padding_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public String getShadow() {
                Object obj = this.shadow_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.shadow_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public ByteString getShadowBytes() {
                Object obj = this.shadow_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.shadow_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public String getStroke() {
                Object obj = this.stroke_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.stroke_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public ByteString getStrokeBytes() {
                Object obj = this.stroke_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.stroke_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public float getStrokeWidth() {
                return this.strokeWidth_;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public String getStyle() {
                Object obj = this.style_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.style_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public ByteString getStyleBytes() {
                Object obj = this.style_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.style_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public boolean getVisible() {
                return this.visible_;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public int getWidth() {
                return this.width_;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public String getX() {
                Object obj = this.x_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.x_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public ByteString getXBytes() {
                Object obj = this.x_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.x_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public String getY() {
                Object obj = this.y_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.y_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
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
                return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_ControlAsset_fieldAccessorTable.d(ControlAsset.class, Builder.class);
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

            public Builder setMargin(String str) {
                str.getClass();
                this.margin_ = str;
                onChanged();
                return this;
            }

            public Builder setMarginBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.margin_ = byteString;
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

            public Builder setPadding(String str) {
                str.getClass();
                this.padding_ = str;
                onChanged();
                return this;
            }

            public Builder setPaddingBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.padding_ = byteString;
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
                this.margin_ = "";
                this.padding_ = "";
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
            public ControlAsset build() {
                ControlAsset controlAssetBuildPartial = buildPartial();
                if (controlAssetBuildPartial.isInitialized()) {
                    return controlAssetBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) controlAssetBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public ControlAsset buildPartial() {
                ControlAsset controlAsset = new ControlAsset(this);
                controlAsset.content_ = this.content_;
                controlAsset.fill_ = this.fill_;
                controlAsset.fontStyle_ = this.fontStyle_;
                controlAsset.height_ = this.height_;
                controlAsset.hideafter_ = this.hideafter_;
                controlAsset.margin_ = this.margin_;
                controlAsset.opacity_ = this.opacity_;
                controlAsset.outlined_ = this.outlined_;
                controlAsset.padding_ = this.padding_;
                controlAsset.shadow_ = this.shadow_;
                controlAsset.stroke_ = this.stroke_;
                controlAsset.strokeWidth_ = this.strokeWidth_;
                controlAsset.style_ = this.style_;
                controlAsset.visible_ = this.visible_;
                controlAsset.width_ = this.width_;
                controlAsset.x_ = this.x_;
                controlAsset.y_ = this.y_;
                onBuilt();
                return controlAsset;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public ControlAsset getDefaultInstanceForType() {
                return ControlAsset.getDefaultInstance();
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
                this.margin_ = "";
                this.opacity_ = 0.0f;
                this.outlined_ = false;
                this.padding_ = "";
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
                if (message instanceof ControlAsset) {
                    return mergeFrom((ControlAsset) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ControlAsset controlAsset) {
                if (controlAsset == ControlAsset.getDefaultInstance()) {
                    return this;
                }
                if (!controlAsset.getContent().isEmpty()) {
                    this.content_ = controlAsset.content_;
                    onChanged();
                }
                if (!controlAsset.getFill().isEmpty()) {
                    this.fill_ = controlAsset.fill_;
                    onChanged();
                }
                if (controlAsset.getFontStyle() != 0) {
                    setFontStyle(controlAsset.getFontStyle());
                }
                if (controlAsset.getHeight() != 0) {
                    setHeight(controlAsset.getHeight());
                }
                if (controlAsset.getHideafter() != 0) {
                    setHideafter(controlAsset.getHideafter());
                }
                if (!controlAsset.getMargin().isEmpty()) {
                    this.margin_ = controlAsset.margin_;
                    onChanged();
                }
                if (controlAsset.getOpacity() != 0.0f) {
                    setOpacity(controlAsset.getOpacity());
                }
                if (controlAsset.getOutlined()) {
                    setOutlined(controlAsset.getOutlined());
                }
                if (!controlAsset.getPadding().isEmpty()) {
                    this.padding_ = controlAsset.padding_;
                    onChanged();
                }
                if (!controlAsset.getShadow().isEmpty()) {
                    this.shadow_ = controlAsset.shadow_;
                    onChanged();
                }
                if (!controlAsset.getStroke().isEmpty()) {
                    this.stroke_ = controlAsset.stroke_;
                    onChanged();
                }
                if (controlAsset.getStrokeWidth() != 0.0f) {
                    setStrokeWidth(controlAsset.getStrokeWidth());
                }
                if (!controlAsset.getStyle().isEmpty()) {
                    this.style_ = controlAsset.style_;
                    onChanged();
                }
                if (controlAsset.getVisible()) {
                    setVisible(controlAsset.getVisible());
                }
                if (controlAsset.getWidth() != 0) {
                    setWidth(controlAsset.getWidth());
                }
                if (!controlAsset.getX().isEmpty()) {
                    this.x_ = controlAsset.x_;
                    onChanged();
                }
                if (!controlAsset.getY().isEmpty()) {
                    this.y_ = controlAsset.y_;
                    onChanged();
                }
                mergeUnknownFields(((h0) controlAsset).unknownFields);
                onChanged();
                return this;
            }

            private Builder(h0.c cVar) {
                super(cVar);
                this.content_ = "";
                this.fill_ = "";
                this.margin_ = "";
                this.padding_ = "";
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
            public io.bidmachine.protobuf.AdExtension.ControlAsset.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.AdExtension.ControlAsset.access$2200()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.AdExtension$ControlAsset r3 = (io.bidmachine.protobuf.AdExtension.ControlAsset) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.AdExtension$ControlAsset r4 = (io.bidmachine.protobuf.AdExtension.ControlAsset) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.AdExtension.ControlAsset.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.AdExtension$ControlAsset$Builder");
            }
        }

        public static Builder newBuilder(ControlAsset controlAsset) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(controlAsset);
        }

        public static ControlAsset parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (ControlAsset) PARSER.parseFrom(byteBuffer, wVar);
        }

        private ControlAsset(h0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ControlAsset parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (ControlAsset) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static ControlAsset parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ControlAsset) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public ControlAsset getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static ControlAsset parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (ControlAsset) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private ControlAsset() {
            this.memoizedIsInitialized = (byte) -1;
            this.content_ = "";
            this.fill_ = "";
            this.margin_ = "";
            this.padding_ = "";
            this.shadow_ = "";
            this.stroke_ = "";
            this.style_ = "";
            this.x_ = "";
            this.y_ = "";
        }

        public static ControlAsset parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ControlAsset) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        public static ControlAsset parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (ControlAsset) PARSER.parseFrom(bArr, wVar);
        }

        public static ControlAsset parseFrom(InputStream inputStream) throws IOException {
            return (ControlAsset) h0.parseWithIOException(PARSER, inputStream);
        }

        public static ControlAsset parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (ControlAsset) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static ControlAsset parseFrom(l lVar) throws IOException {
            return (ControlAsset) h0.parseWithIOException(PARSER, lVar);
        }

        public static ControlAsset parseFrom(l lVar, w wVar) throws IOException {
            return (ControlAsset) h0.parseWithIOException(PARSER, lVar, wVar);
        }

        private ControlAsset(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                            case 50:
                                this.margin_ = lVar.J();
                                break;
                            case 61:
                                this.opacity_ = lVar.w();
                                break;
                            case 64:
                                this.outlined_ = lVar.q();
                                break;
                            case 74:
                                this.padding_ = lVar.J();
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

    public interface ControlAssetOrBuilder extends MessageOrBuilder {
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

        String getMargin();

        ByteString getMarginBytes();

        float getOpacity();

        boolean getOutlined();

        String getPadding();

        ByteString getPaddingBytes();

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

    private static final class CustomParamsDefaultEntryHolder {
        static final u0 defaultEntry;

        static {
            Descriptors.Descriptor descriptor = ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_CustomParamsEntry_descriptor;
            z2.b bVar = z2.b.f19481l;
            defaultEntry = u0.n(descriptor, bVar, "", bVar, "");
        }

        private CustomParamsDefaultEntryHolder() {
        }
    }

    public static final class EventConfiguration extends h0 implements EventConfigurationOrBuilder {
        public static final int ACTIONS_FIELD_NUMBER = 3;
        public static final int CONTEXT_FIELD_NUMBER = 2;
        private static final EventConfiguration DEFAULT_INSTANCE = new EventConfiguration();
        private static final p1 PARSER = new b() { // from class: io.bidmachine.protobuf.AdExtension.EventConfiguration.1
            @Override // com.explorestack.protobuf.p1
            public EventConfiguration parsePartialFrom(l lVar, w wVar) throws InvalidProtocolBufferException {
                return new EventConfiguration(lVar, wVar);
            }
        };
        public static final int URL_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int actionsMemoizedSerializedSize;
        private j0.g actions_;
        private volatile Object context_;
        private byte memoizedIsInitialized;
        private volatile Object url_;

        public static EventConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_EventConfiguration_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EventConfiguration parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (EventConfiguration) h0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EventConfiguration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (EventConfiguration) PARSER.parseFrom(byteBuffer);
        }

        public static p1 parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EventConfiguration)) {
                return super.equals(obj);
            }
            EventConfiguration eventConfiguration = (EventConfiguration) obj;
            return getUrl().equals(eventConfiguration.getUrl()) && getContext().equals(eventConfiguration.getContext()) && getActionsList().equals(eventConfiguration.getActionsList()) && this.unknownFields.equals(eventConfiguration.unknownFields);
        }

        @Override // io.bidmachine.protobuf.AdExtension.EventConfigurationOrBuilder
        public int getActions(int i10) {
            return this.actions_.getInt(i10);
        }

        @Override // io.bidmachine.protobuf.AdExtension.EventConfigurationOrBuilder
        public int getActionsCount() {
            return this.actions_.size();
        }

        @Override // io.bidmachine.protobuf.AdExtension.EventConfigurationOrBuilder
        public List<Integer> getActionsList() {
            return this.actions_;
        }

        @Override // io.bidmachine.protobuf.AdExtension.EventConfigurationOrBuilder
        public String getContext() {
            Object obj = this.context_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.context_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.EventConfigurationOrBuilder
        public ByteString getContextBytes() {
            Object obj = this.context_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.context_ = byteStringCopyFromUtf8;
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
            int iComputeStringSize = !getUrlBytes().isEmpty() ? h0.computeStringSize(1, this.url_) : 0;
            if (!getContextBytes().isEmpty()) {
                iComputeStringSize += h0.computeStringSize(2, this.context_);
            }
            int iZ = 0;
            for (int i11 = 0; i11 < this.actions_.size(); i11++) {
                iZ += n.Z(this.actions_.getInt(i11));
            }
            int iY = iComputeStringSize + iZ;
            if (!getActionsList().isEmpty()) {
                iY = iY + 1 + n.y(iZ);
            }
            this.actionsMemoizedSerializedSize = iZ;
            int serializedSize = iY + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.MessageOrBuilder
        public final r2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.AdExtension.EventConfigurationOrBuilder
        public String getUrl() {
            Object obj = this.url_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.url_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.EventConfigurationOrBuilder
        public ByteString getUrlBytes() {
            Object obj = this.url_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.url_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getUrl().hashCode()) * 37) + 2) * 53) + getContext().hashCode();
            if (getActionsCount() > 0) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getActionsList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.h0
        protected h0.f internalGetFieldAccessorTable() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_EventConfiguration_fieldAccessorTable.d(EventConfiguration.class, Builder.class);
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
            return new EventConfiguration();
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(n nVar) throws IOException {
            getSerializedSize();
            if (!getUrlBytes().isEmpty()) {
                h0.writeString(nVar, 1, this.url_);
            }
            if (!getContextBytes().isEmpty()) {
                h0.writeString(nVar, 2, this.context_);
            }
            if (getActionsList().size() > 0) {
                nVar.X0(26);
                nVar.X0(this.actionsMemoizedSerializedSize);
            }
            for (int i10 = 0; i10 < this.actions_.size(); i10++) {
                nVar.X0(this.actions_.getInt(i10));
            }
            this.unknownFields.writeTo(nVar);
        }

        public static final class Builder extends h0.b implements EventConfigurationOrBuilder {
            private j0.g actions_;
            private int bitField0_;
            private Object context_;
            private Object url_;

            private void ensureActionsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.actions_ = h0.mutableCopy(this.actions_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_EventConfiguration_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = h0.alwaysUseFieldBuilders;
            }

            public Builder addActions(int i10) {
                ensureActionsIsMutable();
                this.actions_.addInt(i10);
                onChanged();
                return this;
            }

            public Builder addAllActions(Iterable<? extends Integer> iterable) {
                ensureActionsIsMutable();
                a.AbstractC0320a.addAll((Iterable) iterable, (List) this.actions_);
                onChanged();
                return this;
            }

            public Builder clearActions() {
                this.actions_ = h0.emptyIntList();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearContext() {
                this.context_ = EventConfiguration.getDefaultInstance().getContext();
                onChanged();
                return this;
            }

            public Builder clearUrl() {
                this.url_ = EventConfiguration.getDefaultInstance().getUrl();
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.AdExtension.EventConfigurationOrBuilder
            public int getActions(int i10) {
                return this.actions_.getInt(i10);
            }

            @Override // io.bidmachine.protobuf.AdExtension.EventConfigurationOrBuilder
            public int getActionsCount() {
                return this.actions_.size();
            }

            @Override // io.bidmachine.protobuf.AdExtension.EventConfigurationOrBuilder
            public List<Integer> getActionsList() {
                return (this.bitField0_ & 1) != 0 ? DesugarCollections.unmodifiableList(this.actions_) : this.actions_;
            }

            @Override // io.bidmachine.protobuf.AdExtension.EventConfigurationOrBuilder
            public String getContext() {
                Object obj = this.context_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.context_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.EventConfigurationOrBuilder
            public ByteString getContextBytes() {
                Object obj = this.context_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.context_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_EventConfiguration_descriptor;
            }

            @Override // io.bidmachine.protobuf.AdExtension.EventConfigurationOrBuilder
            public String getUrl() {
                Object obj = this.url_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.url_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.EventConfigurationOrBuilder
            public ByteString getUrlBytes() {
                Object obj = this.url_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.url_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.h0.b
            protected h0.f internalGetFieldAccessorTable() {
                return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_EventConfiguration_fieldAccessorTable.d(EventConfiguration.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setActions(int i10, int i11) {
                ensureActionsIsMutable();
                this.actions_.setInt(i10, i11);
                onChanged();
                return this;
            }

            public Builder setContext(String str) {
                str.getClass();
                this.context_ = str;
                onChanged();
                return this;
            }

            public Builder setContextBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.context_ = byteString;
                onChanged();
                return this;
            }

            public Builder setUrl(String str) {
                str.getClass();
                this.url_ = str;
                onChanged();
                return this;
            }

            public Builder setUrlBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.url_ = byteString;
                onChanged();
                return this;
            }

            private Builder() {
                this.url_ = "";
                this.context_ = "";
                this.actions_ = h0.emptyIntList();
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public EventConfiguration build() {
                EventConfiguration eventConfigurationBuildPartial = buildPartial();
                if (eventConfigurationBuildPartial.isInitialized()) {
                    return eventConfigurationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) eventConfigurationBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public EventConfiguration buildPartial() {
                EventConfiguration eventConfiguration = new EventConfiguration(this);
                eventConfiguration.url_ = this.url_;
                eventConfiguration.context_ = this.context_;
                if ((this.bitField0_ & 1) != 0) {
                    this.actions_.makeImmutable();
                    this.bitField0_ &= -2;
                }
                eventConfiguration.actions_ = this.actions_;
                onBuilt();
                return eventConfiguration;
            }

            @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public EventConfiguration getDefaultInstanceForType() {
                return EventConfiguration.getDefaultInstance();
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
                this.url_ = "";
                this.context_ = "";
                this.actions_ = h0.emptyIntList();
                this.bitField0_ &= -2;
                return this;
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo4427clone() {
                return (Builder) super.mo4427clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof EventConfiguration) {
                    return mergeFrom((EventConfiguration) message);
                }
                super.mergeFrom(message);
                return this;
            }

            private Builder(h0.c cVar) {
                super(cVar);
                this.url_ = "";
                this.context_ = "";
                this.actions_ = h0.emptyIntList();
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(EventConfiguration eventConfiguration) {
                if (eventConfiguration == EventConfiguration.getDefaultInstance()) {
                    return this;
                }
                if (!eventConfiguration.getUrl().isEmpty()) {
                    this.url_ = eventConfiguration.url_;
                    onChanged();
                }
                if (!eventConfiguration.getContext().isEmpty()) {
                    this.context_ = eventConfiguration.context_;
                    onChanged();
                }
                if (!eventConfiguration.actions_.isEmpty()) {
                    if (this.actions_.isEmpty()) {
                        this.actions_ = eventConfiguration.actions_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureActionsIsMutable();
                        this.actions_.addAll(eventConfiguration.actions_);
                    }
                    onChanged();
                }
                mergeUnknownFields(((h0) eventConfiguration).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0320a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public io.bidmachine.protobuf.AdExtension.EventConfiguration.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.AdExtension.EventConfiguration.access$4200()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                    io.bidmachine.protobuf.AdExtension$EventConfiguration r3 = (io.bidmachine.protobuf.AdExtension.EventConfiguration) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                    io.bidmachine.protobuf.AdExtension$EventConfiguration r4 = (io.bidmachine.protobuf.AdExtension.EventConfiguration) r4     // Catch: java.lang.Throwable -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.AdExtension.EventConfiguration.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.AdExtension$EventConfiguration$Builder");
            }
        }

        public static Builder newBuilder(EventConfiguration eventConfiguration) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(eventConfiguration);
        }

        public static EventConfiguration parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
            return (EventConfiguration) PARSER.parseFrom(byteBuffer, wVar);
        }

        private EventConfiguration(h0.b bVar) {
            super(bVar);
            this.actionsMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EventConfiguration parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
            return (EventConfiguration) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
        }

        public static EventConfiguration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (EventConfiguration) PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public EventConfiguration getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static EventConfiguration parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
            return (EventConfiguration) PARSER.parseFrom(byteString, wVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static EventConfiguration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (EventConfiguration) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.h0
        public Builder newBuilderForType(h0.c cVar) {
            return new Builder(cVar);
        }

        private EventConfiguration() {
            this.actionsMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.url_ = "";
            this.context_ = "";
            this.actions_ = h0.emptyIntList();
        }

        public static EventConfiguration parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
            return (EventConfiguration) PARSER.parseFrom(bArr, wVar);
        }

        public static EventConfiguration parseFrom(InputStream inputStream) throws IOException {
            return (EventConfiguration) h0.parseWithIOException(PARSER, inputStream);
        }

        public static EventConfiguration parseFrom(InputStream inputStream, w wVar) throws IOException {
            return (EventConfiguration) h0.parseWithIOException(PARSER, inputStream, wVar);
        }

        public static EventConfiguration parseFrom(l lVar) throws IOException {
            return (EventConfiguration) h0.parseWithIOException(PARSER, lVar);
        }

        private EventConfiguration(l lVar, w wVar) throws InvalidProtocolBufferException {
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
                            if (iK == 10) {
                                this.url_ = lVar.J();
                            } else if (iK == 18) {
                                this.context_ = lVar.J();
                            } else if (iK == 24) {
                                if (!z11) {
                                    this.actions_ = h0.newIntList();
                                    z11 = true;
                                }
                                this.actions_.addInt(lVar.L());
                            } else if (iK != 26) {
                                if (!parseUnknownField(lVar, bVarG, wVar, iK)) {
                                }
                            } else {
                                int iP = lVar.p(lVar.C());
                                if (!z11 && lVar.d() > 0) {
                                    this.actions_ = h0.newIntList();
                                    z11 = true;
                                }
                                while (lVar.d() > 0) {
                                    this.actions_.addInt(lVar.L());
                                }
                                lVar.o(iP);
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
                        this.actions_.makeImmutable();
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (z11) {
                this.actions_.makeImmutable();
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static EventConfiguration parseFrom(l lVar, w wVar) throws IOException {
            return (EventConfiguration) h0.parseWithIOException(PARSER, lVar, wVar);
        }
    }

    public interface EventConfigurationOrBuilder extends MessageOrBuilder {
        int getActions(int i10);

        int getActionsCount();

        List<Integer> getActionsList();

        String getContext();

        ByteString getContextBytes();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo4439getDefaultInstanceForType();

        String getUrl();

        ByteString getUrlBytes();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static AdExtension getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public w0 internalGetCustomParams() {
        w0 w0Var = this.customParams_;
        return w0Var == null ? w0.g(CustomParamsDefaultEntryHolder.defaultEntry) : w0Var;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static AdExtension parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AdExtension) h0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static AdExtension parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AdExtension) PARSER.parseFrom(byteBuffer);
    }

    public static p1 parser() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean containsCustomParams(String str) {
        str.getClass();
        return internalGetCustomParams().i().containsKey(str);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdExtension)) {
            return super.equals(obj);
        }
        AdExtension adExtension = (AdExtension) obj;
        if (getPreload() != adExtension.getPreload() || getLoadSkipoffset() != adExtension.getLoadSkipoffset() || getViewabilityTimeThreshold() != adExtension.getViewabilityTimeThreshold() || Float.floatToIntBits(getViewabilityPixelThreshold()) != Float.floatToIntBits(adExtension.getViewabilityPixelThreshold()) || Float.floatToIntBits(getViewabilityDurationThreshold()) != Float.floatToIntBits(adExtension.getViewabilityDurationThreshold()) || !getEventList().equals(adExtension.getEventList()) || !internalGetCustomParams().equals(adExtension.internalGetCustomParams()) || getSkipoffset() != adExtension.getSkipoffset() || getCompanionSkipoffset() != adExtension.getCompanionSkipoffset() || getUseNativeClose() != adExtension.getUseNativeClose() || getR1() != adExtension.getR1() || getR2() != adExtension.getR2() || hasCountdown() != adExtension.hasCountdown()) {
            return false;
        }
        if ((hasCountdown() && !getCountdown().equals(adExtension.getCountdown())) || hasCloseButton() != adExtension.hasCloseButton()) {
            return false;
        }
        if ((hasCloseButton() && !getCloseButton().equals(adExtension.getCloseButton())) || getIgnoresSafeAreaLayoutGuide() != adExtension.getIgnoresSafeAreaLayoutGuide() || !getStoreUrl().equals(adExtension.getStoreUrl()) || hasProgress() != adExtension.hasProgress()) {
            return false;
        }
        if ((hasProgress() && !getProgress().equals(adExtension.getProgress())) || getProgressDuration() != adExtension.getProgressDuration() || getViewabilityIgnoreWindowFocus() != adExtension.getViewabilityIgnoreWindowFocus() || this.adCacheControl_ != adExtension.adCacheControl_ || getAdCacheMaxAge() != adExtension.getAdCacheMaxAge() || getR1Delay() != adExtension.getR1Delay() || getAdMarkupLoadingTimeout() != adExtension.getAdMarkupLoadingTimeout() || getUseEmbeddedBrowser() != adExtension.getUseEmbeddedBrowser() || getPreloadAd() != adExtension.getPreloadAd() || this.creativeLoadingMethod_ != adExtension.creativeLoadingMethod_ || Float.floatToIntBits(getPlaceholderTimeout()) != Float.floatToIntBits(adExtension.getPlaceholderTimeout()) || hasEventConfiguration() != adExtension.hasEventConfiguration()) {
            return false;
        }
        if ((hasEventConfiguration() && !getEventConfiguration().equals(adExtension.getEventConfiguration())) || getViewabilityIgnoreOverlap() != adExtension.getViewabilityIgnoreOverlap() || hasCreativeExtension() != adExtension.hasCreativeExtension()) {
            return false;
        }
        if ((!hasCreativeExtension() || getCreativeExtension().equals(adExtension.getCreativeExtension())) && getAdFlexibleSize() == adExtension.getAdFlexibleSize() && hasRenderingConfiguration() == adExtension.hasRenderingConfiguration()) {
            return (!hasRenderingConfiguration() || getRenderingConfiguration().equals(adExtension.getRenderingConfiguration())) && getMraidCreativeValidationRequired() == adExtension.getMraidCreativeValidationRequired() && getCreativeLoadingTimeout() == adExtension.getCreativeLoadingTimeout() && getCridMonitoringEnabled() == adExtension.getCridMonitoringEnabled() && this.unknownFields.equals(adExtension.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public AdCacheControl getAdCacheControl() {
        AdCacheControl adCacheControlValueOf = AdCacheControl.valueOf(this.adCacheControl_);
        return adCacheControlValueOf == null ? AdCacheControl.UNRECOGNIZED : adCacheControlValueOf;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public int getAdCacheControlValue() {
        return this.adCacheControl_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public int getAdCacheMaxAge() {
        return this.adCacheMaxAge_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean getAdFlexibleSize() {
        return this.adFlexibleSize_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public int getAdMarkupLoadingTimeout() {
        return this.adMarkupLoadingTimeout_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public ControlAsset getCloseButton() {
        ControlAsset controlAsset = this.closeButton_;
        return controlAsset == null ? ControlAsset.getDefaultInstance() : controlAsset;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public ControlAssetOrBuilder getCloseButtonOrBuilder() {
        return getCloseButton();
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public int getCompanionSkipoffset() {
        return this.companionSkipoffset_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public ControlAsset getCountdown() {
        ControlAsset controlAsset = this.countdown_;
        return controlAsset == null ? ControlAsset.getDefaultInstance() : controlAsset;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public ControlAssetOrBuilder getCountdownOrBuilder() {
        return getCountdown();
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    @Deprecated
    public CreativeExtension getCreativeExtension() {
        CreativeExtension creativeExtension = this.creativeExtension_;
        return creativeExtension == null ? CreativeExtension.getDefaultInstance() : creativeExtension;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    @Deprecated
    public CreativeExtensionOrBuilder getCreativeExtensionOrBuilder() {
        return getCreativeExtension();
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public CreativeLoadingMethod getCreativeLoadingMethod() {
        CreativeLoadingMethod creativeLoadingMethodValueOf = CreativeLoadingMethod.valueOf(this.creativeLoadingMethod_);
        return creativeLoadingMethodValueOf == null ? CreativeLoadingMethod.UNRECOGNIZED : creativeLoadingMethodValueOf;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public int getCreativeLoadingMethodValue() {
        return this.creativeLoadingMethod_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public int getCreativeLoadingTimeout() {
        return this.creativeLoadingTimeout_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean getCridMonitoringEnabled() {
        return this.cridMonitoringEnabled_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    @Deprecated
    public Map<String, String> getCustomParams() {
        return getCustomParamsMap();
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public int getCustomParamsCount() {
        return internalGetCustomParams().i().size();
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public Map<String, String> getCustomParamsMap() {
        return internalGetCustomParams().i();
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public String getCustomParamsOrDefault(String str, String str2) {
        str.getClass();
        Map mapI = internalGetCustomParams().i();
        return mapI.containsKey(str) ? (String) mapI.get(str) : str2;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public String getCustomParamsOrThrow(String str) {
        str.getClass();
        Map mapI = internalGetCustomParams().i();
        if (mapI.containsKey(str)) {
            return (String) mapI.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public Ad.Event getEvent(int i10) {
        return this.event_.get(i10);
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public EventConfiguration getEventConfiguration() {
        EventConfiguration eventConfiguration = this.eventConfiguration_;
        return eventConfiguration == null ? EventConfiguration.getDefaultInstance() : eventConfiguration;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public EventConfigurationOrBuilder getEventConfigurationOrBuilder() {
        return getEventConfiguration();
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public int getEventCount() {
        return this.event_.size();
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public List<Ad.Event> getEventList() {
        return this.event_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public Ad.EventOrBuilder getEventOrBuilder(int i10) {
        return this.event_.get(i10);
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public List<? extends Ad.EventOrBuilder> getEventOrBuilderList() {
        return this.event_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean getIgnoresSafeAreaLayoutGuide() {
        return this.ignoresSafeAreaLayoutGuide_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    @Deprecated
    public int getLoadSkipoffset() {
        return this.loadSkipoffset_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean getMraidCreativeValidationRequired() {
        return this.mraidCreativeValidationRequired_;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public p1 getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public float getPlaceholderTimeout() {
        return this.placeholderTimeout_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    @Deprecated
    public boolean getPreload() {
        return this.preload_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean getPreloadAd() {
        return this.preloadAd_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public ControlAsset getProgress() {
        ControlAsset controlAsset = this.progress_;
        return controlAsset == null ? ControlAsset.getDefaultInstance() : controlAsset;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public int getProgressDuration() {
        return this.progressDuration_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public ControlAssetOrBuilder getProgressOrBuilder() {
        return getProgress();
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean getR1() {
        return this.r1_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public int getR1Delay() {
        return this.r1Delay_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean getR2() {
        return this.r2_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public Rendering getRenderingConfiguration() {
        Rendering rendering = this.renderingConfiguration_;
        return rendering == null ? Rendering.getDefaultInstance() : rendering;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public RenderingOrBuilder getRenderingConfigurationOrBuilder() {
        return getRenderingConfiguration();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        boolean z10 = this.preload_;
        int iE = z10 ? n.e(2, z10) : 0;
        int i11 = this.loadSkipoffset_;
        if (i11 != 0) {
            iE += n.Y(3, i11);
        }
        int i12 = this.viewabilityTimeThreshold_;
        if (i12 != 0) {
            iE += n.Y(4, i12);
        }
        float f10 = this.viewabilityPixelThreshold_;
        if (f10 != 0.0f) {
            iE += n.r(5, f10);
        }
        float f11 = this.viewabilityDurationThreshold_;
        if (f11 != 0.0f) {
            iE += n.r(6, f11);
        }
        for (int i13 = 0; i13 < this.event_.size(); i13++) {
            iE += n.G(7, this.event_.get(i13));
        }
        for (Map.Entry entry : internalGetCustomParams().i().entrySet()) {
            iE += n.G(8, CustomParamsDefaultEntryHolder.defaultEntry.newBuilderForType().t(entry.getKey()).w(entry.getValue()).build());
        }
        int i14 = this.skipoffset_;
        if (i14 != 0) {
            iE += n.Y(9, i14);
        }
        int i15 = this.companionSkipoffset_;
        if (i15 != 0) {
            iE += n.Y(10, i15);
        }
        boolean z11 = this.useNativeClose_;
        if (z11) {
            iE += n.e(11, z11);
        }
        boolean z12 = this.r1_;
        if (z12) {
            iE += n.e(12, z12);
        }
        boolean z13 = this.r2_;
        if (z13) {
            iE += n.e(13, z13);
        }
        if (this.countdown_ != null) {
            iE += n.G(14, getCountdown());
        }
        if (this.closeButton_ != null) {
            iE += n.G(15, getCloseButton());
        }
        boolean z14 = this.ignoresSafeAreaLayoutGuide_;
        if (z14) {
            iE += n.e(16, z14);
        }
        if (!getStoreUrlBytes().isEmpty()) {
            iE += h0.computeStringSize(17, this.storeUrl_);
        }
        if (this.progress_ != null) {
            iE += n.G(18, getProgress());
        }
        int i16 = this.progressDuration_;
        if (i16 != 0) {
            iE += n.Y(19, i16);
        }
        boolean z15 = this.viewabilityIgnoreWindowFocus_;
        if (z15) {
            iE += n.e(20, z15);
        }
        if (this.adCacheControl_ != AdCacheControl.AD_CACHE_CONTROL_DISABLED.getNumber()) {
            iE += n.l(21, this.adCacheControl_);
        }
        int i17 = this.adCacheMaxAge_;
        if (i17 != 0) {
            iE += n.Y(22, i17);
        }
        int i18 = this.r1Delay_;
        if (i18 != 0) {
            iE += n.Y(23, i18);
        }
        int i19 = this.adMarkupLoadingTimeout_;
        if (i19 != 0) {
            iE += n.Y(24, i19);
        }
        boolean z16 = this.useEmbeddedBrowser_;
        if (z16) {
            iE += n.e(25, z16);
        }
        boolean z17 = this.preloadAd_;
        if (z17) {
            iE += n.e(26, z17);
        }
        if (this.creativeLoadingMethod_ != CreativeLoadingMethod.FullLoad.getNumber()) {
            iE += n.l(27, this.creativeLoadingMethod_);
        }
        float f12 = this.placeholderTimeout_;
        if (f12 != 0.0f) {
            iE += n.r(28, f12);
        }
        if (this.eventConfiguration_ != null) {
            iE += n.G(29, getEventConfiguration());
        }
        boolean z18 = this.viewabilityIgnoreOverlap_;
        if (z18) {
            iE += n.e(30, z18);
        }
        if (this.creativeExtension_ != null) {
            iE += n.G(31, getCreativeExtension());
        }
        boolean z19 = this.adFlexibleSize_;
        if (z19) {
            iE += n.e(32, z19);
        }
        if (this.renderingConfiguration_ != null) {
            iE += n.G(33, getRenderingConfiguration());
        }
        boolean z20 = this.mraidCreativeValidationRequired_;
        if (z20) {
            iE += n.e(34, z20);
        }
        int i20 = this.creativeLoadingTimeout_;
        if (i20 != 0) {
            iE += n.x(35, i20);
        }
        boolean z21 = this.cridMonitoringEnabled_;
        if (z21) {
            iE += n.e(36, z21);
        }
        int serializedSize = iE + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public int getSkipoffset() {
        return this.skipoffset_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public String getStoreUrl() {
        Object obj = this.storeUrl_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.storeUrl_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public ByteString getStoreUrlBytes() {
        Object obj = this.storeUrl_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.storeUrl_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public final r2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean getUseEmbeddedBrowser() {
        return this.useEmbeddedBrowser_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean getUseNativeClose() {
        return this.useNativeClose_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public float getViewabilityDurationThreshold() {
        return this.viewabilityDurationThreshold_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean getViewabilityIgnoreOverlap() {
        return this.viewabilityIgnoreOverlap_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean getViewabilityIgnoreWindowFocus() {
        return this.viewabilityIgnoreWindowFocus_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public float getViewabilityPixelThreshold() {
        return this.viewabilityPixelThreshold_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public int getViewabilityTimeThreshold() {
        return this.viewabilityTimeThreshold_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean hasCloseButton() {
        return this.closeButton_ != null;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean hasCountdown() {
        return this.countdown_ != null;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    @Deprecated
    public boolean hasCreativeExtension() {
        return this.creativeExtension_ != null;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean hasEventConfiguration() {
        return this.eventConfiguration_ != null;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean hasProgress() {
        return this.progress_ != null;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean hasRenderingConfiguration() {
        return this.renderingConfiguration_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 2) * 53) + j0.d(getPreload())) * 37) + 3) * 53) + getLoadSkipoffset()) * 37) + 4) * 53) + getViewabilityTimeThreshold()) * 37) + 5) * 53) + Float.floatToIntBits(getViewabilityPixelThreshold())) * 37) + 6) * 53) + Float.floatToIntBits(getViewabilityDurationThreshold());
        if (getEventCount() > 0) {
            iHashCode = (((iHashCode * 37) + 7) * 53) + getEventList().hashCode();
        }
        if (!internalGetCustomParams().i().isEmpty()) {
            iHashCode = (((iHashCode * 37) + 8) * 53) + internalGetCustomParams().hashCode();
        }
        int skipoffset = (((((((((((((((((((iHashCode * 37) + 9) * 53) + getSkipoffset()) * 37) + 10) * 53) + getCompanionSkipoffset()) * 37) + 11) * 53) + j0.d(getUseNativeClose())) * 37) + 12) * 53) + j0.d(getR1())) * 37) + 13) * 53) + j0.d(getR2());
        if (hasCountdown()) {
            skipoffset = (((skipoffset * 37) + 14) * 53) + getCountdown().hashCode();
        }
        if (hasCloseButton()) {
            skipoffset = (((skipoffset * 37) + 15) * 53) + getCloseButton().hashCode();
        }
        int iD = (((((((skipoffset * 37) + 16) * 53) + j0.d(getIgnoresSafeAreaLayoutGuide())) * 37) + 17) * 53) + getStoreUrl().hashCode();
        if (hasProgress()) {
            iD = (((iD * 37) + 18) * 53) + getProgress().hashCode();
        }
        int progressDuration = (((((((((((((((((((((((((((((((((((((((iD * 37) + 19) * 53) + getProgressDuration()) * 37) + 20) * 53) + j0.d(getViewabilityIgnoreWindowFocus())) * 37) + 21) * 53) + this.adCacheControl_) * 37) + 22) * 53) + getAdCacheMaxAge()) * 37) + 23) * 53) + getR1Delay()) * 37) + 24) * 53) + getAdMarkupLoadingTimeout()) * 37) + 25) * 53) + j0.d(getUseEmbeddedBrowser())) * 37) + 26) * 53) + j0.d(getPreloadAd())) * 37) + 27) * 53) + this.creativeLoadingMethod_) * 37) + 28) * 53) + Float.floatToIntBits(getPlaceholderTimeout());
        if (hasEventConfiguration()) {
            progressDuration = (((progressDuration * 37) + 29) * 53) + getEventConfiguration().hashCode();
        }
        int iD2 = (((progressDuration * 37) + 30) * 53) + j0.d(getViewabilityIgnoreOverlap());
        if (hasCreativeExtension()) {
            iD2 = (((iD2 * 37) + 31) * 53) + getCreativeExtension().hashCode();
        }
        int iD3 = (((iD2 * 37) + 32) * 53) + j0.d(getAdFlexibleSize());
        if (hasRenderingConfiguration()) {
            iD3 = (((iD3 * 37) + 33) * 53) + getRenderingConfiguration().hashCode();
        }
        int iD4 = (((((((((((((iD3 * 37) + 34) * 53) + j0.d(getMraidCreativeValidationRequired())) * 37) + 35) * 53) + getCreativeLoadingTimeout()) * 37) + 36) * 53) + j0.d(getCridMonitoringEnabled())) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iD4;
        return iD4;
    }

    @Override // com.explorestack.protobuf.h0
    protected h0.f internalGetFieldAccessorTable() {
        return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_fieldAccessorTable.d(AdExtension.class, Builder.class);
    }

    @Override // com.explorestack.protobuf.h0
    protected w0 internalGetMapField(int i10) {
        if (i10 == 8) {
            return internalGetCustomParams();
        }
        throw new RuntimeException("Invalid map field number: " + i10);
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
        return new AdExtension();
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(n nVar) throws IOException {
        boolean z10 = this.preload_;
        if (z10) {
            nVar.n0(2, z10);
        }
        int i10 = this.loadSkipoffset_;
        if (i10 != 0) {
            nVar.W0(3, i10);
        }
        int i11 = this.viewabilityTimeThreshold_;
        if (i11 != 0) {
            nVar.W0(4, i11);
        }
        float f10 = this.viewabilityPixelThreshold_;
        if (f10 != 0.0f) {
            nVar.B0(5, f10);
        }
        float f11 = this.viewabilityDurationThreshold_;
        if (f11 != 0.0f) {
            nVar.B0(6, f11);
        }
        for (int i12 = 0; i12 < this.event_.size(); i12++) {
            nVar.J0(7, this.event_.get(i12));
        }
        h0.serializeStringMapTo(nVar, internalGetCustomParams(), CustomParamsDefaultEntryHolder.defaultEntry, 8);
        int i13 = this.skipoffset_;
        if (i13 != 0) {
            nVar.W0(9, i13);
        }
        int i14 = this.companionSkipoffset_;
        if (i14 != 0) {
            nVar.W0(10, i14);
        }
        boolean z11 = this.useNativeClose_;
        if (z11) {
            nVar.n0(11, z11);
        }
        boolean z12 = this.r1_;
        if (z12) {
            nVar.n0(12, z12);
        }
        boolean z13 = this.r2_;
        if (z13) {
            nVar.n0(13, z13);
        }
        if (this.countdown_ != null) {
            nVar.J0(14, getCountdown());
        }
        if (this.closeButton_ != null) {
            nVar.J0(15, getCloseButton());
        }
        boolean z14 = this.ignoresSafeAreaLayoutGuide_;
        if (z14) {
            nVar.n0(16, z14);
        }
        if (!getStoreUrlBytes().isEmpty()) {
            h0.writeString(nVar, 17, this.storeUrl_);
        }
        if (this.progress_ != null) {
            nVar.J0(18, getProgress());
        }
        int i15 = this.progressDuration_;
        if (i15 != 0) {
            nVar.W0(19, i15);
        }
        boolean z15 = this.viewabilityIgnoreWindowFocus_;
        if (z15) {
            nVar.n0(20, z15);
        }
        if (this.adCacheControl_ != AdCacheControl.AD_CACHE_CONTROL_DISABLED.getNumber()) {
            nVar.v0(21, this.adCacheControl_);
        }
        int i16 = this.adCacheMaxAge_;
        if (i16 != 0) {
            nVar.W0(22, i16);
        }
        int i17 = this.r1Delay_;
        if (i17 != 0) {
            nVar.W0(23, i17);
        }
        int i18 = this.adMarkupLoadingTimeout_;
        if (i18 != 0) {
            nVar.W0(24, i18);
        }
        boolean z16 = this.useEmbeddedBrowser_;
        if (z16) {
            nVar.n0(25, z16);
        }
        boolean z17 = this.preloadAd_;
        if (z17) {
            nVar.n0(26, z17);
        }
        if (this.creativeLoadingMethod_ != CreativeLoadingMethod.FullLoad.getNumber()) {
            nVar.v0(27, this.creativeLoadingMethod_);
        }
        float f12 = this.placeholderTimeout_;
        if (f12 != 0.0f) {
            nVar.B0(28, f12);
        }
        if (this.eventConfiguration_ != null) {
            nVar.J0(29, getEventConfiguration());
        }
        boolean z18 = this.viewabilityIgnoreOverlap_;
        if (z18) {
            nVar.n0(30, z18);
        }
        if (this.creativeExtension_ != null) {
            nVar.J0(31, getCreativeExtension());
        }
        boolean z19 = this.adFlexibleSize_;
        if (z19) {
            nVar.n0(32, z19);
        }
        if (this.renderingConfiguration_ != null) {
            nVar.J0(33, getRenderingConfiguration());
        }
        boolean z20 = this.mraidCreativeValidationRequired_;
        if (z20) {
            nVar.n0(34, z20);
        }
        int i19 = this.creativeLoadingTimeout_;
        if (i19 != 0) {
            nVar.F0(35, i19);
        }
        boolean z21 = this.cridMonitoringEnabled_;
        if (z21) {
            nVar.n0(36, z21);
        }
        this.unknownFields.writeTo(nVar);
    }

    public static final class Builder extends h0.b implements AdExtensionOrBuilder {
        private int adCacheControl_;
        private int adCacheMaxAge_;
        private boolean adFlexibleSize_;
        private int adMarkupLoadingTimeout_;
        private int bitField0_;
        private a2 closeButtonBuilder_;
        private ControlAsset closeButton_;
        private int companionSkipoffset_;
        private a2 countdownBuilder_;
        private ControlAsset countdown_;
        private a2 creativeExtensionBuilder_;
        private CreativeExtension creativeExtension_;
        private int creativeLoadingMethod_;
        private int creativeLoadingTimeout_;
        private boolean cridMonitoringEnabled_;
        private w0 customParams_;
        private v1 eventBuilder_;
        private a2 eventConfigurationBuilder_;
        private EventConfiguration eventConfiguration_;
        private List<Ad.Event> event_;
        private boolean ignoresSafeAreaLayoutGuide_;
        private int loadSkipoffset_;
        private boolean mraidCreativeValidationRequired_;
        private float placeholderTimeout_;
        private boolean preloadAd_;
        private boolean preload_;
        private a2 progressBuilder_;
        private int progressDuration_;
        private ControlAsset progress_;
        private int r1Delay_;
        private boolean r1_;
        private boolean r2_;
        private a2 renderingConfigurationBuilder_;
        private Rendering renderingConfiguration_;
        private int skipoffset_;
        private Object storeUrl_;
        private boolean useEmbeddedBrowser_;
        private boolean useNativeClose_;
        private float viewabilityDurationThreshold_;
        private boolean viewabilityIgnoreOverlap_;
        private boolean viewabilityIgnoreWindowFocus_;
        private float viewabilityPixelThreshold_;
        private int viewabilityTimeThreshold_;

        private void ensureEventIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.event_ = new ArrayList(this.event_);
                this.bitField0_ |= 1;
            }
        }

        private a2 getCloseButtonFieldBuilder() {
            if (this.closeButtonBuilder_ == null) {
                this.closeButtonBuilder_ = new a2(getCloseButton(), getParentForChildren(), isClean());
                this.closeButton_ = null;
            }
            return this.closeButtonBuilder_;
        }

        private a2 getCountdownFieldBuilder() {
            if (this.countdownBuilder_ == null) {
                this.countdownBuilder_ = new a2(getCountdown(), getParentForChildren(), isClean());
                this.countdown_ = null;
            }
            return this.countdownBuilder_;
        }

        private a2 getCreativeExtensionFieldBuilder() {
            if (this.creativeExtensionBuilder_ == null) {
                this.creativeExtensionBuilder_ = new a2(getCreativeExtension(), getParentForChildren(), isClean());
                this.creativeExtension_ = null;
            }
            return this.creativeExtensionBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_descriptor;
        }

        private a2 getEventConfigurationFieldBuilder() {
            if (this.eventConfigurationBuilder_ == null) {
                this.eventConfigurationBuilder_ = new a2(getEventConfiguration(), getParentForChildren(), isClean());
                this.eventConfiguration_ = null;
            }
            return this.eventConfigurationBuilder_;
        }

        private v1 getEventFieldBuilder() {
            if (this.eventBuilder_ == null) {
                this.eventBuilder_ = new v1(this.event_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.event_ = null;
            }
            return this.eventBuilder_;
        }

        private a2 getProgressFieldBuilder() {
            if (this.progressBuilder_ == null) {
                this.progressBuilder_ = new a2(getProgress(), getParentForChildren(), isClean());
                this.progress_ = null;
            }
            return this.progressBuilder_;
        }

        private a2 getRenderingConfigurationFieldBuilder() {
            if (this.renderingConfigurationBuilder_ == null) {
                this.renderingConfigurationBuilder_ = new a2(getRenderingConfiguration(), getParentForChildren(), isClean());
                this.renderingConfiguration_ = null;
            }
            return this.renderingConfigurationBuilder_;
        }

        private w0 internalGetCustomParams() {
            w0 w0Var = this.customParams_;
            return w0Var == null ? w0.g(CustomParamsDefaultEntryHolder.defaultEntry) : w0Var;
        }

        private w0 internalGetMutableCustomParams() {
            onChanged();
            if (this.customParams_ == null) {
                this.customParams_ = w0.p(CustomParamsDefaultEntryHolder.defaultEntry);
            }
            if (!this.customParams_.m()) {
                this.customParams_ = this.customParams_.f();
            }
            return this.customParams_;
        }

        private void maybeForceBuilderInitialization() {
            if (h0.alwaysUseFieldBuilders) {
                getEventFieldBuilder();
            }
        }

        public Builder addAllEvent(Iterable<? extends Ad.Event> iterable) {
            v1 v1Var = this.eventBuilder_;
            if (v1Var != null) {
                v1Var.a(iterable);
                return this;
            }
            ensureEventIsMutable();
            a.AbstractC0320a.addAll((Iterable) iterable, (List) this.event_);
            onChanged();
            return this;
        }

        public Builder addEvent(Ad.Event event) {
            v1 v1Var = this.eventBuilder_;
            if (v1Var != null) {
                v1Var.e(event);
                return this;
            }
            event.getClass();
            ensureEventIsMutable();
            this.event_.add(event);
            onChanged();
            return this;
        }

        public Ad.Event.Builder addEventBuilder() {
            return (Ad.Event.Builder) getEventFieldBuilder().c(Ad.Event.getDefaultInstance());
        }

        public Builder clearAdCacheControl() {
            this.adCacheControl_ = 0;
            onChanged();
            return this;
        }

        public Builder clearAdCacheMaxAge() {
            this.adCacheMaxAge_ = 0;
            onChanged();
            return this;
        }

        public Builder clearAdFlexibleSize() {
            this.adFlexibleSize_ = false;
            onChanged();
            return this;
        }

        public Builder clearAdMarkupLoadingTimeout() {
            this.adMarkupLoadingTimeout_ = 0;
            onChanged();
            return this;
        }

        public Builder clearCloseButton() {
            if (this.closeButtonBuilder_ == null) {
                this.closeButton_ = null;
                onChanged();
                return this;
            }
            this.closeButton_ = null;
            this.closeButtonBuilder_ = null;
            return this;
        }

        public Builder clearCompanionSkipoffset() {
            this.companionSkipoffset_ = 0;
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

        @Deprecated
        public Builder clearCreativeExtension() {
            if (this.creativeExtensionBuilder_ == null) {
                this.creativeExtension_ = null;
                onChanged();
                return this;
            }
            this.creativeExtension_ = null;
            this.creativeExtensionBuilder_ = null;
            return this;
        }

        public Builder clearCreativeLoadingMethod() {
            this.creativeLoadingMethod_ = 0;
            onChanged();
            return this;
        }

        public Builder clearCreativeLoadingTimeout() {
            this.creativeLoadingTimeout_ = 0;
            onChanged();
            return this;
        }

        public Builder clearCridMonitoringEnabled() {
            this.cridMonitoringEnabled_ = false;
            onChanged();
            return this;
        }

        public Builder clearCustomParams() {
            internalGetMutableCustomParams().l().clear();
            return this;
        }

        public Builder clearEvent() {
            v1 v1Var = this.eventBuilder_;
            if (v1Var != null) {
                v1Var.g();
                return this;
            }
            this.event_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder clearEventConfiguration() {
            if (this.eventConfigurationBuilder_ == null) {
                this.eventConfiguration_ = null;
                onChanged();
                return this;
            }
            this.eventConfiguration_ = null;
            this.eventConfigurationBuilder_ = null;
            return this;
        }

        public Builder clearIgnoresSafeAreaLayoutGuide() {
            this.ignoresSafeAreaLayoutGuide_ = false;
            onChanged();
            return this;
        }

        @Deprecated
        public Builder clearLoadSkipoffset() {
            this.loadSkipoffset_ = 0;
            onChanged();
            return this;
        }

        public Builder clearMraidCreativeValidationRequired() {
            this.mraidCreativeValidationRequired_ = false;
            onChanged();
            return this;
        }

        public Builder clearPlaceholderTimeout() {
            this.placeholderTimeout_ = 0.0f;
            onChanged();
            return this;
        }

        @Deprecated
        public Builder clearPreload() {
            this.preload_ = false;
            onChanged();
            return this;
        }

        public Builder clearPreloadAd() {
            this.preloadAd_ = false;
            onChanged();
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

        public Builder clearProgressDuration() {
            this.progressDuration_ = 0;
            onChanged();
            return this;
        }

        public Builder clearR1() {
            this.r1_ = false;
            onChanged();
            return this;
        }

        public Builder clearR1Delay() {
            this.r1Delay_ = 0;
            onChanged();
            return this;
        }

        public Builder clearR2() {
            this.r2_ = false;
            onChanged();
            return this;
        }

        public Builder clearRenderingConfiguration() {
            if (this.renderingConfigurationBuilder_ == null) {
                this.renderingConfiguration_ = null;
                onChanged();
                return this;
            }
            this.renderingConfiguration_ = null;
            this.renderingConfigurationBuilder_ = null;
            return this;
        }

        public Builder clearSkipoffset() {
            this.skipoffset_ = 0;
            onChanged();
            return this;
        }

        public Builder clearStoreUrl() {
            this.storeUrl_ = AdExtension.getDefaultInstance().getStoreUrl();
            onChanged();
            return this;
        }

        public Builder clearUseEmbeddedBrowser() {
            this.useEmbeddedBrowser_ = false;
            onChanged();
            return this;
        }

        public Builder clearUseNativeClose() {
            this.useNativeClose_ = false;
            onChanged();
            return this;
        }

        public Builder clearViewabilityDurationThreshold() {
            this.viewabilityDurationThreshold_ = 0.0f;
            onChanged();
            return this;
        }

        public Builder clearViewabilityIgnoreOverlap() {
            this.viewabilityIgnoreOverlap_ = false;
            onChanged();
            return this;
        }

        public Builder clearViewabilityIgnoreWindowFocus() {
            this.viewabilityIgnoreWindowFocus_ = false;
            onChanged();
            return this;
        }

        public Builder clearViewabilityPixelThreshold() {
            this.viewabilityPixelThreshold_ = 0.0f;
            onChanged();
            return this;
        }

        public Builder clearViewabilityTimeThreshold() {
            this.viewabilityTimeThreshold_ = 0;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean containsCustomParams(String str) {
            str.getClass();
            return internalGetCustomParams().i().containsKey(str);
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public AdCacheControl getAdCacheControl() {
            AdCacheControl adCacheControlValueOf = AdCacheControl.valueOf(this.adCacheControl_);
            return adCacheControlValueOf == null ? AdCacheControl.UNRECOGNIZED : adCacheControlValueOf;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public int getAdCacheControlValue() {
            return this.adCacheControl_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public int getAdCacheMaxAge() {
            return this.adCacheMaxAge_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean getAdFlexibleSize() {
            return this.adFlexibleSize_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public int getAdMarkupLoadingTimeout() {
            return this.adMarkupLoadingTimeout_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public ControlAsset getCloseButton() {
            a2 a2Var = this.closeButtonBuilder_;
            if (a2Var != null) {
                return (ControlAsset) a2Var.e();
            }
            ControlAsset controlAsset = this.closeButton_;
            return controlAsset == null ? ControlAsset.getDefaultInstance() : controlAsset;
        }

        public ControlAsset.Builder getCloseButtonBuilder() {
            onChanged();
            return (ControlAsset.Builder) getCloseButtonFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public ControlAssetOrBuilder getCloseButtonOrBuilder() {
            a2 a2Var = this.closeButtonBuilder_;
            if (a2Var != null) {
                return (ControlAssetOrBuilder) a2Var.f();
            }
            ControlAsset controlAsset = this.closeButton_;
            return controlAsset == null ? ControlAsset.getDefaultInstance() : controlAsset;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public int getCompanionSkipoffset() {
            return this.companionSkipoffset_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public ControlAsset getCountdown() {
            a2 a2Var = this.countdownBuilder_;
            if (a2Var != null) {
                return (ControlAsset) a2Var.e();
            }
            ControlAsset controlAsset = this.countdown_;
            return controlAsset == null ? ControlAsset.getDefaultInstance() : controlAsset;
        }

        public ControlAsset.Builder getCountdownBuilder() {
            onChanged();
            return (ControlAsset.Builder) getCountdownFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public ControlAssetOrBuilder getCountdownOrBuilder() {
            a2 a2Var = this.countdownBuilder_;
            if (a2Var != null) {
                return (ControlAssetOrBuilder) a2Var.f();
            }
            ControlAsset controlAsset = this.countdown_;
            return controlAsset == null ? ControlAsset.getDefaultInstance() : controlAsset;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        @Deprecated
        public CreativeExtension getCreativeExtension() {
            a2 a2Var = this.creativeExtensionBuilder_;
            if (a2Var != null) {
                return (CreativeExtension) a2Var.e();
            }
            CreativeExtension creativeExtension = this.creativeExtension_;
            return creativeExtension == null ? CreativeExtension.getDefaultInstance() : creativeExtension;
        }

        @Deprecated
        public CreativeExtension.Builder getCreativeExtensionBuilder() {
            onChanged();
            return (CreativeExtension.Builder) getCreativeExtensionFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        @Deprecated
        public CreativeExtensionOrBuilder getCreativeExtensionOrBuilder() {
            a2 a2Var = this.creativeExtensionBuilder_;
            if (a2Var != null) {
                return (CreativeExtensionOrBuilder) a2Var.f();
            }
            CreativeExtension creativeExtension = this.creativeExtension_;
            return creativeExtension == null ? CreativeExtension.getDefaultInstance() : creativeExtension;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public CreativeLoadingMethod getCreativeLoadingMethod() {
            CreativeLoadingMethod creativeLoadingMethodValueOf = CreativeLoadingMethod.valueOf(this.creativeLoadingMethod_);
            return creativeLoadingMethodValueOf == null ? CreativeLoadingMethod.UNRECOGNIZED : creativeLoadingMethodValueOf;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public int getCreativeLoadingMethodValue() {
            return this.creativeLoadingMethod_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public int getCreativeLoadingTimeout() {
            return this.creativeLoadingTimeout_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean getCridMonitoringEnabled() {
            return this.cridMonitoringEnabled_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        @Deprecated
        public Map<String, String> getCustomParams() {
            return getCustomParamsMap();
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public int getCustomParamsCount() {
            return internalGetCustomParams().i().size();
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public Map<String, String> getCustomParamsMap() {
            return internalGetCustomParams().i();
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public String getCustomParamsOrDefault(String str, String str2) {
            str.getClass();
            Map mapI = internalGetCustomParams().i();
            return mapI.containsKey(str) ? (String) mapI.get(str) : str2;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public String getCustomParamsOrThrow(String str) {
            str.getClass();
            Map mapI = internalGetCustomParams().i();
            if (mapI.containsKey(str)) {
                return (String) mapI.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_descriptor;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public Ad.Event getEvent(int i10) {
            v1 v1Var = this.eventBuilder_;
            return v1Var == null ? this.event_.get(i10) : (Ad.Event) v1Var.n(i10);
        }

        public Ad.Event.Builder getEventBuilder(int i10) {
            return (Ad.Event.Builder) getEventFieldBuilder().k(i10);
        }

        public List<Ad.Event.Builder> getEventBuilderList() {
            return getEventFieldBuilder().l();
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public EventConfiguration getEventConfiguration() {
            a2 a2Var = this.eventConfigurationBuilder_;
            if (a2Var != null) {
                return (EventConfiguration) a2Var.e();
            }
            EventConfiguration eventConfiguration = this.eventConfiguration_;
            return eventConfiguration == null ? EventConfiguration.getDefaultInstance() : eventConfiguration;
        }

        public EventConfiguration.Builder getEventConfigurationBuilder() {
            onChanged();
            return (EventConfiguration.Builder) getEventConfigurationFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public EventConfigurationOrBuilder getEventConfigurationOrBuilder() {
            a2 a2Var = this.eventConfigurationBuilder_;
            if (a2Var != null) {
                return (EventConfigurationOrBuilder) a2Var.f();
            }
            EventConfiguration eventConfiguration = this.eventConfiguration_;
            return eventConfiguration == null ? EventConfiguration.getDefaultInstance() : eventConfiguration;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public int getEventCount() {
            v1 v1Var = this.eventBuilder_;
            return v1Var == null ? this.event_.size() : v1Var.m();
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public List<Ad.Event> getEventList() {
            v1 v1Var = this.eventBuilder_;
            return v1Var == null ? DesugarCollections.unmodifiableList(this.event_) : v1Var.p();
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public Ad.EventOrBuilder getEventOrBuilder(int i10) {
            v1 v1Var = this.eventBuilder_;
            return v1Var == null ? this.event_.get(i10) : (Ad.EventOrBuilder) v1Var.q(i10);
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public List<? extends Ad.EventOrBuilder> getEventOrBuilderList() {
            v1 v1Var = this.eventBuilder_;
            return v1Var != null ? v1Var.r() : DesugarCollections.unmodifiableList(this.event_);
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean getIgnoresSafeAreaLayoutGuide() {
            return this.ignoresSafeAreaLayoutGuide_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        @Deprecated
        public int getLoadSkipoffset() {
            return this.loadSkipoffset_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean getMraidCreativeValidationRequired() {
            return this.mraidCreativeValidationRequired_;
        }

        @Deprecated
        public Map<String, String> getMutableCustomParams() {
            return internalGetMutableCustomParams().l();
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public float getPlaceholderTimeout() {
            return this.placeholderTimeout_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        @Deprecated
        public boolean getPreload() {
            return this.preload_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean getPreloadAd() {
            return this.preloadAd_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public ControlAsset getProgress() {
            a2 a2Var = this.progressBuilder_;
            if (a2Var != null) {
                return (ControlAsset) a2Var.e();
            }
            ControlAsset controlAsset = this.progress_;
            return controlAsset == null ? ControlAsset.getDefaultInstance() : controlAsset;
        }

        public ControlAsset.Builder getProgressBuilder() {
            onChanged();
            return (ControlAsset.Builder) getProgressFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public int getProgressDuration() {
            return this.progressDuration_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public ControlAssetOrBuilder getProgressOrBuilder() {
            a2 a2Var = this.progressBuilder_;
            if (a2Var != null) {
                return (ControlAssetOrBuilder) a2Var.f();
            }
            ControlAsset controlAsset = this.progress_;
            return controlAsset == null ? ControlAsset.getDefaultInstance() : controlAsset;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean getR1() {
            return this.r1_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public int getR1Delay() {
            return this.r1Delay_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean getR2() {
            return this.r2_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public Rendering getRenderingConfiguration() {
            a2 a2Var = this.renderingConfigurationBuilder_;
            if (a2Var != null) {
                return (Rendering) a2Var.e();
            }
            Rendering rendering = this.renderingConfiguration_;
            return rendering == null ? Rendering.getDefaultInstance() : rendering;
        }

        public Rendering.Builder getRenderingConfigurationBuilder() {
            onChanged();
            return (Rendering.Builder) getRenderingConfigurationFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public RenderingOrBuilder getRenderingConfigurationOrBuilder() {
            a2 a2Var = this.renderingConfigurationBuilder_;
            if (a2Var != null) {
                return (RenderingOrBuilder) a2Var.f();
            }
            Rendering rendering = this.renderingConfiguration_;
            return rendering == null ? Rendering.getDefaultInstance() : rendering;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public int getSkipoffset() {
            return this.skipoffset_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public String getStoreUrl() {
            Object obj = this.storeUrl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.storeUrl_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public ByteString getStoreUrlBytes() {
            Object obj = this.storeUrl_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.storeUrl_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean getUseEmbeddedBrowser() {
            return this.useEmbeddedBrowser_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean getUseNativeClose() {
            return this.useNativeClose_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public float getViewabilityDurationThreshold() {
            return this.viewabilityDurationThreshold_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean getViewabilityIgnoreOverlap() {
            return this.viewabilityIgnoreOverlap_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean getViewabilityIgnoreWindowFocus() {
            return this.viewabilityIgnoreWindowFocus_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public float getViewabilityPixelThreshold() {
            return this.viewabilityPixelThreshold_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public int getViewabilityTimeThreshold() {
            return this.viewabilityTimeThreshold_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean hasCloseButton() {
            return (this.closeButtonBuilder_ == null && this.closeButton_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean hasCountdown() {
            return (this.countdownBuilder_ == null && this.countdown_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        @Deprecated
        public boolean hasCreativeExtension() {
            return (this.creativeExtensionBuilder_ == null && this.creativeExtension_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean hasEventConfiguration() {
            return (this.eventConfigurationBuilder_ == null && this.eventConfiguration_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean hasProgress() {
            return (this.progressBuilder_ == null && this.progress_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean hasRenderingConfiguration() {
            return (this.renderingConfigurationBuilder_ == null && this.renderingConfiguration_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.h0.b
        protected h0.f internalGetFieldAccessorTable() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_fieldAccessorTable.d(AdExtension.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.h0.b
        protected w0 internalGetMapField(int i10) {
            if (i10 == 8) {
                return internalGetCustomParams();
            }
            throw new RuntimeException("Invalid map field number: " + i10);
        }

        @Override // com.explorestack.protobuf.h0.b
        protected w0 internalGetMutableMapField(int i10) {
            if (i10 == 8) {
                return internalGetMutableCustomParams();
            }
            throw new RuntimeException("Invalid map field number: " + i10);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeCloseButton(ControlAsset controlAsset) {
            a2 a2Var = this.closeButtonBuilder_;
            if (a2Var != null) {
                a2Var.g(controlAsset);
                return this;
            }
            ControlAsset controlAsset2 = this.closeButton_;
            if (controlAsset2 != null) {
                this.closeButton_ = ControlAsset.newBuilder(controlAsset2).mergeFrom(controlAsset).buildPartial();
            } else {
                this.closeButton_ = controlAsset;
            }
            onChanged();
            return this;
        }

        public Builder mergeCountdown(ControlAsset controlAsset) {
            a2 a2Var = this.countdownBuilder_;
            if (a2Var != null) {
                a2Var.g(controlAsset);
                return this;
            }
            ControlAsset controlAsset2 = this.countdown_;
            if (controlAsset2 != null) {
                this.countdown_ = ControlAsset.newBuilder(controlAsset2).mergeFrom(controlAsset).buildPartial();
            } else {
                this.countdown_ = controlAsset;
            }
            onChanged();
            return this;
        }

        @Deprecated
        public Builder mergeCreativeExtension(CreativeExtension creativeExtension) {
            a2 a2Var = this.creativeExtensionBuilder_;
            if (a2Var != null) {
                a2Var.g(creativeExtension);
                return this;
            }
            CreativeExtension creativeExtension2 = this.creativeExtension_;
            if (creativeExtension2 != null) {
                this.creativeExtension_ = CreativeExtension.newBuilder(creativeExtension2).mergeFrom(creativeExtension).buildPartial();
            } else {
                this.creativeExtension_ = creativeExtension;
            }
            onChanged();
            return this;
        }

        public Builder mergeEventConfiguration(EventConfiguration eventConfiguration) {
            a2 a2Var = this.eventConfigurationBuilder_;
            if (a2Var != null) {
                a2Var.g(eventConfiguration);
                return this;
            }
            EventConfiguration eventConfiguration2 = this.eventConfiguration_;
            if (eventConfiguration2 != null) {
                this.eventConfiguration_ = EventConfiguration.newBuilder(eventConfiguration2).mergeFrom(eventConfiguration).buildPartial();
            } else {
                this.eventConfiguration_ = eventConfiguration;
            }
            onChanged();
            return this;
        }

        public Builder mergeProgress(ControlAsset controlAsset) {
            a2 a2Var = this.progressBuilder_;
            if (a2Var != null) {
                a2Var.g(controlAsset);
                return this;
            }
            ControlAsset controlAsset2 = this.progress_;
            if (controlAsset2 != null) {
                this.progress_ = ControlAsset.newBuilder(controlAsset2).mergeFrom(controlAsset).buildPartial();
            } else {
                this.progress_ = controlAsset;
            }
            onChanged();
            return this;
        }

        public Builder mergeRenderingConfiguration(Rendering rendering) {
            a2 a2Var = this.renderingConfigurationBuilder_;
            if (a2Var != null) {
                a2Var.g(rendering);
                return this;
            }
            Rendering rendering2 = this.renderingConfiguration_;
            if (rendering2 != null) {
                this.renderingConfiguration_ = Rendering.newBuilder(rendering2).mergeFrom(rendering).buildPartial();
            } else {
                this.renderingConfiguration_ = rendering;
            }
            onChanged();
            return this;
        }

        public Builder putAllCustomParams(Map<String, String> map) {
            internalGetMutableCustomParams().l().putAll(map);
            return this;
        }

        public Builder putCustomParams(String str, String str2) {
            str.getClass();
            str2.getClass();
            internalGetMutableCustomParams().l().put(str, str2);
            return this;
        }

        public Builder removeCustomParams(String str) {
            str.getClass();
            internalGetMutableCustomParams().l().remove(str);
            return this;
        }

        public Builder removeEvent(int i10) {
            v1 v1Var = this.eventBuilder_;
            if (v1Var != null) {
                v1Var.v(i10);
                return this;
            }
            ensureEventIsMutable();
            this.event_.remove(i10);
            onChanged();
            return this;
        }

        public Builder setAdCacheControl(AdCacheControl adCacheControl) {
            adCacheControl.getClass();
            this.adCacheControl_ = adCacheControl.getNumber();
            onChanged();
            return this;
        }

        public Builder setAdCacheControlValue(int i10) {
            this.adCacheControl_ = i10;
            onChanged();
            return this;
        }

        public Builder setAdCacheMaxAge(int i10) {
            this.adCacheMaxAge_ = i10;
            onChanged();
            return this;
        }

        public Builder setAdFlexibleSize(boolean z10) {
            this.adFlexibleSize_ = z10;
            onChanged();
            return this;
        }

        public Builder setAdMarkupLoadingTimeout(int i10) {
            this.adMarkupLoadingTimeout_ = i10;
            onChanged();
            return this;
        }

        public Builder setCloseButton(ControlAsset controlAsset) {
            a2 a2Var = this.closeButtonBuilder_;
            if (a2Var != null) {
                a2Var.i(controlAsset);
                return this;
            }
            controlAsset.getClass();
            this.closeButton_ = controlAsset;
            onChanged();
            return this;
        }

        public Builder setCompanionSkipoffset(int i10) {
            this.companionSkipoffset_ = i10;
            onChanged();
            return this;
        }

        public Builder setCountdown(ControlAsset controlAsset) {
            a2 a2Var = this.countdownBuilder_;
            if (a2Var != null) {
                a2Var.i(controlAsset);
                return this;
            }
            controlAsset.getClass();
            this.countdown_ = controlAsset;
            onChanged();
            return this;
        }

        @Deprecated
        public Builder setCreativeExtension(CreativeExtension creativeExtension) {
            a2 a2Var = this.creativeExtensionBuilder_;
            if (a2Var != null) {
                a2Var.i(creativeExtension);
                return this;
            }
            creativeExtension.getClass();
            this.creativeExtension_ = creativeExtension;
            onChanged();
            return this;
        }

        public Builder setCreativeLoadingMethod(CreativeLoadingMethod creativeLoadingMethod) {
            creativeLoadingMethod.getClass();
            this.creativeLoadingMethod_ = creativeLoadingMethod.getNumber();
            onChanged();
            return this;
        }

        public Builder setCreativeLoadingMethodValue(int i10) {
            this.creativeLoadingMethod_ = i10;
            onChanged();
            return this;
        }

        public Builder setCreativeLoadingTimeout(int i10) {
            this.creativeLoadingTimeout_ = i10;
            onChanged();
            return this;
        }

        public Builder setCridMonitoringEnabled(boolean z10) {
            this.cridMonitoringEnabled_ = z10;
            onChanged();
            return this;
        }

        public Builder setEvent(int i10, Ad.Event event) {
            v1 v1Var = this.eventBuilder_;
            if (v1Var != null) {
                v1Var.w(i10, event);
                return this;
            }
            event.getClass();
            ensureEventIsMutable();
            this.event_.set(i10, event);
            onChanged();
            return this;
        }

        public Builder setEventConfiguration(EventConfiguration eventConfiguration) {
            a2 a2Var = this.eventConfigurationBuilder_;
            if (a2Var != null) {
                a2Var.i(eventConfiguration);
                return this;
            }
            eventConfiguration.getClass();
            this.eventConfiguration_ = eventConfiguration;
            onChanged();
            return this;
        }

        public Builder setIgnoresSafeAreaLayoutGuide(boolean z10) {
            this.ignoresSafeAreaLayoutGuide_ = z10;
            onChanged();
            return this;
        }

        @Deprecated
        public Builder setLoadSkipoffset(int i10) {
            this.loadSkipoffset_ = i10;
            onChanged();
            return this;
        }

        public Builder setMraidCreativeValidationRequired(boolean z10) {
            this.mraidCreativeValidationRequired_ = z10;
            onChanged();
            return this;
        }

        public Builder setPlaceholderTimeout(float f10) {
            this.placeholderTimeout_ = f10;
            onChanged();
            return this;
        }

        @Deprecated
        public Builder setPreload(boolean z10) {
            this.preload_ = z10;
            onChanged();
            return this;
        }

        public Builder setPreloadAd(boolean z10) {
            this.preloadAd_ = z10;
            onChanged();
            return this;
        }

        public Builder setProgress(ControlAsset controlAsset) {
            a2 a2Var = this.progressBuilder_;
            if (a2Var != null) {
                a2Var.i(controlAsset);
                return this;
            }
            controlAsset.getClass();
            this.progress_ = controlAsset;
            onChanged();
            return this;
        }

        public Builder setProgressDuration(int i10) {
            this.progressDuration_ = i10;
            onChanged();
            return this;
        }

        public Builder setR1(boolean z10) {
            this.r1_ = z10;
            onChanged();
            return this;
        }

        public Builder setR1Delay(int i10) {
            this.r1Delay_ = i10;
            onChanged();
            return this;
        }

        public Builder setR2(boolean z10) {
            this.r2_ = z10;
            onChanged();
            return this;
        }

        public Builder setRenderingConfiguration(Rendering rendering) {
            a2 a2Var = this.renderingConfigurationBuilder_;
            if (a2Var != null) {
                a2Var.i(rendering);
                return this;
            }
            rendering.getClass();
            this.renderingConfiguration_ = rendering;
            onChanged();
            return this;
        }

        public Builder setSkipoffset(int i10) {
            this.skipoffset_ = i10;
            onChanged();
            return this;
        }

        public Builder setStoreUrl(String str) {
            str.getClass();
            this.storeUrl_ = str;
            onChanged();
            return this;
        }

        public Builder setStoreUrlBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.storeUrl_ = byteString;
            onChanged();
            return this;
        }

        public Builder setUseEmbeddedBrowser(boolean z10) {
            this.useEmbeddedBrowser_ = z10;
            onChanged();
            return this;
        }

        public Builder setUseNativeClose(boolean z10) {
            this.useNativeClose_ = z10;
            onChanged();
            return this;
        }

        public Builder setViewabilityDurationThreshold(float f10) {
            this.viewabilityDurationThreshold_ = f10;
            onChanged();
            return this;
        }

        public Builder setViewabilityIgnoreOverlap(boolean z10) {
            this.viewabilityIgnoreOverlap_ = z10;
            onChanged();
            return this;
        }

        public Builder setViewabilityIgnoreWindowFocus(boolean z10) {
            this.viewabilityIgnoreWindowFocus_ = z10;
            onChanged();
            return this;
        }

        public Builder setViewabilityPixelThreshold(float f10) {
            this.viewabilityPixelThreshold_ = f10;
            onChanged();
            return this;
        }

        public Builder setViewabilityTimeThreshold(int i10) {
            this.viewabilityTimeThreshold_ = i10;
            onChanged();
            return this;
        }

        private Builder() {
            this.event_ = Collections.EMPTY_LIST;
            this.storeUrl_ = "";
            this.adCacheControl_ = 0;
            this.creativeLoadingMethod_ = 0;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public AdExtension build() {
            AdExtension adExtensionBuildPartial = buildPartial();
            if (adExtensionBuildPartial.isInitialized()) {
                return adExtensionBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) adExtensionBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public AdExtension buildPartial() {
            AdExtension adExtension = new AdExtension(this);
            adExtension.preload_ = this.preload_;
            adExtension.loadSkipoffset_ = this.loadSkipoffset_;
            adExtension.viewabilityTimeThreshold_ = this.viewabilityTimeThreshold_;
            adExtension.viewabilityPixelThreshold_ = this.viewabilityPixelThreshold_;
            adExtension.viewabilityDurationThreshold_ = this.viewabilityDurationThreshold_;
            v1 v1Var = this.eventBuilder_;
            if (v1Var != null) {
                adExtension.event_ = v1Var.f();
            } else {
                if ((this.bitField0_ & 1) != 0) {
                    this.event_ = DesugarCollections.unmodifiableList(this.event_);
                    this.bitField0_ &= -2;
                }
                adExtension.event_ = this.event_;
            }
            adExtension.customParams_ = internalGetCustomParams();
            adExtension.customParams_.n();
            adExtension.skipoffset_ = this.skipoffset_;
            adExtension.companionSkipoffset_ = this.companionSkipoffset_;
            adExtension.useNativeClose_ = this.useNativeClose_;
            adExtension.r1_ = this.r1_;
            adExtension.r2_ = this.r2_;
            a2 a2Var = this.countdownBuilder_;
            if (a2Var == null) {
                adExtension.countdown_ = this.countdown_;
            } else {
                adExtension.countdown_ = (ControlAsset) a2Var.a();
            }
            a2 a2Var2 = this.closeButtonBuilder_;
            if (a2Var2 == null) {
                adExtension.closeButton_ = this.closeButton_;
            } else {
                adExtension.closeButton_ = (ControlAsset) a2Var2.a();
            }
            adExtension.ignoresSafeAreaLayoutGuide_ = this.ignoresSafeAreaLayoutGuide_;
            adExtension.storeUrl_ = this.storeUrl_;
            a2 a2Var3 = this.progressBuilder_;
            if (a2Var3 == null) {
                adExtension.progress_ = this.progress_;
            } else {
                adExtension.progress_ = (ControlAsset) a2Var3.a();
            }
            adExtension.progressDuration_ = this.progressDuration_;
            adExtension.viewabilityIgnoreWindowFocus_ = this.viewabilityIgnoreWindowFocus_;
            adExtension.adCacheControl_ = this.adCacheControl_;
            adExtension.adCacheMaxAge_ = this.adCacheMaxAge_;
            adExtension.r1Delay_ = this.r1Delay_;
            adExtension.adMarkupLoadingTimeout_ = this.adMarkupLoadingTimeout_;
            adExtension.useEmbeddedBrowser_ = this.useEmbeddedBrowser_;
            adExtension.preloadAd_ = this.preloadAd_;
            adExtension.creativeLoadingMethod_ = this.creativeLoadingMethod_;
            adExtension.placeholderTimeout_ = this.placeholderTimeout_;
            a2 a2Var4 = this.eventConfigurationBuilder_;
            if (a2Var4 == null) {
                adExtension.eventConfiguration_ = this.eventConfiguration_;
            } else {
                adExtension.eventConfiguration_ = (EventConfiguration) a2Var4.a();
            }
            adExtension.viewabilityIgnoreOverlap_ = this.viewabilityIgnoreOverlap_;
            a2 a2Var5 = this.creativeExtensionBuilder_;
            if (a2Var5 == null) {
                adExtension.creativeExtension_ = this.creativeExtension_;
            } else {
                adExtension.creativeExtension_ = (CreativeExtension) a2Var5.a();
            }
            adExtension.adFlexibleSize_ = this.adFlexibleSize_;
            a2 a2Var6 = this.renderingConfigurationBuilder_;
            if (a2Var6 == null) {
                adExtension.renderingConfiguration_ = this.renderingConfiguration_;
            } else {
                adExtension.renderingConfiguration_ = (Rendering) a2Var6.a();
            }
            adExtension.mraidCreativeValidationRequired_ = this.mraidCreativeValidationRequired_;
            adExtension.creativeLoadingTimeout_ = this.creativeLoadingTimeout_;
            adExtension.cridMonitoringEnabled_ = this.cridMonitoringEnabled_;
            onBuilt();
            return adExtension;
        }

        @Override // com.explorestack.protobuf.h0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public AdExtension getDefaultInstanceForType() {
            return AdExtension.getDefaultInstance();
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

        public Ad.Event.Builder addEventBuilder(int i10) {
            return (Ad.Event.Builder) getEventFieldBuilder().b(i10, Ad.Event.getDefaultInstance());
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
            this.preload_ = false;
            this.loadSkipoffset_ = 0;
            this.viewabilityTimeThreshold_ = 0;
            this.viewabilityPixelThreshold_ = 0.0f;
            this.viewabilityDurationThreshold_ = 0.0f;
            v1 v1Var = this.eventBuilder_;
            if (v1Var == null) {
                this.event_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
            } else {
                v1Var.g();
            }
            internalGetMutableCustomParams().a();
            this.skipoffset_ = 0;
            this.companionSkipoffset_ = 0;
            this.useNativeClose_ = false;
            this.r1_ = false;
            this.r2_ = false;
            if (this.countdownBuilder_ == null) {
                this.countdown_ = null;
            } else {
                this.countdown_ = null;
                this.countdownBuilder_ = null;
            }
            if (this.closeButtonBuilder_ == null) {
                this.closeButton_ = null;
            } else {
                this.closeButton_ = null;
                this.closeButtonBuilder_ = null;
            }
            this.ignoresSafeAreaLayoutGuide_ = false;
            this.storeUrl_ = "";
            if (this.progressBuilder_ == null) {
                this.progress_ = null;
            } else {
                this.progress_ = null;
                this.progressBuilder_ = null;
            }
            this.progressDuration_ = 0;
            this.viewabilityIgnoreWindowFocus_ = false;
            this.adCacheControl_ = 0;
            this.adCacheMaxAge_ = 0;
            this.r1Delay_ = 0;
            this.adMarkupLoadingTimeout_ = 0;
            this.useEmbeddedBrowser_ = false;
            this.preloadAd_ = false;
            this.creativeLoadingMethod_ = 0;
            this.placeholderTimeout_ = 0.0f;
            if (this.eventConfigurationBuilder_ == null) {
                this.eventConfiguration_ = null;
            } else {
                this.eventConfiguration_ = null;
                this.eventConfigurationBuilder_ = null;
            }
            this.viewabilityIgnoreOverlap_ = false;
            if (this.creativeExtensionBuilder_ == null) {
                this.creativeExtension_ = null;
            } else {
                this.creativeExtension_ = null;
                this.creativeExtensionBuilder_ = null;
            }
            this.adFlexibleSize_ = false;
            if (this.renderingConfigurationBuilder_ == null) {
                this.renderingConfiguration_ = null;
            } else {
                this.renderingConfiguration_ = null;
                this.renderingConfigurationBuilder_ = null;
            }
            this.mraidCreativeValidationRequired_ = false;
            this.creativeLoadingTimeout_ = 0;
            this.cridMonitoringEnabled_ = false;
            return this;
        }

        public Builder setCloseButton(ControlAsset.Builder builder) {
            a2 a2Var = this.closeButtonBuilder_;
            if (a2Var == null) {
                this.closeButton_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        public Builder setCountdown(ControlAsset.Builder builder) {
            a2 a2Var = this.countdownBuilder_;
            if (a2Var == null) {
                this.countdown_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        @Deprecated
        public Builder setCreativeExtension(CreativeExtension.Builder builder) {
            a2 a2Var = this.creativeExtensionBuilder_;
            if (a2Var == null) {
                this.creativeExtension_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        public Builder setEventConfiguration(EventConfiguration.Builder builder) {
            a2 a2Var = this.eventConfigurationBuilder_;
            if (a2Var == null) {
                this.eventConfiguration_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        public Builder setProgress(ControlAsset.Builder builder) {
            a2 a2Var = this.progressBuilder_;
            if (a2Var == null) {
                this.progress_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        public Builder setRenderingConfiguration(Rendering.Builder builder) {
            a2 a2Var = this.renderingConfigurationBuilder_;
            if (a2Var == null) {
                this.renderingConfiguration_ = builder.build();
                onChanged();
                return this;
            }
            a2Var.i(builder.build());
            return this;
        }

        public Builder addEvent(int i10, Ad.Event event) {
            v1 v1Var = this.eventBuilder_;
            if (v1Var == null) {
                event.getClass();
                ensureEventIsMutable();
                this.event_.add(i10, event);
                onChanged();
                return this;
            }
            v1Var.d(i10, event);
            return this;
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4427clone() {
            return (Builder) super.mo4427clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof AdExtension) {
                return mergeFrom((AdExtension) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setEvent(int i10, Ad.Event.Builder builder) {
            v1 v1Var = this.eventBuilder_;
            if (v1Var == null) {
                ensureEventIsMutable();
                this.event_.set(i10, builder.build());
                onChanged();
                return this;
            }
            v1Var.w(i10, builder.build());
            return this;
        }

        private Builder(h0.c cVar) {
            super(cVar);
            this.event_ = Collections.EMPTY_LIST;
            this.storeUrl_ = "";
            this.adCacheControl_ = 0;
            this.creativeLoadingMethod_ = 0;
            maybeForceBuilderInitialization();
        }

        public Builder mergeFrom(AdExtension adExtension) {
            if (adExtension == AdExtension.getDefaultInstance()) {
                return this;
            }
            if (adExtension.getPreload()) {
                setPreload(adExtension.getPreload());
            }
            if (adExtension.getLoadSkipoffset() != 0) {
                setLoadSkipoffset(adExtension.getLoadSkipoffset());
            }
            if (adExtension.getViewabilityTimeThreshold() != 0) {
                setViewabilityTimeThreshold(adExtension.getViewabilityTimeThreshold());
            }
            if (adExtension.getViewabilityPixelThreshold() != 0.0f) {
                setViewabilityPixelThreshold(adExtension.getViewabilityPixelThreshold());
            }
            if (adExtension.getViewabilityDurationThreshold() != 0.0f) {
                setViewabilityDurationThreshold(adExtension.getViewabilityDurationThreshold());
            }
            if (this.eventBuilder_ == null) {
                if (!adExtension.event_.isEmpty()) {
                    if (this.event_.isEmpty()) {
                        this.event_ = adExtension.event_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureEventIsMutable();
                        this.event_.addAll(adExtension.event_);
                    }
                    onChanged();
                }
            } else if (!adExtension.event_.isEmpty()) {
                if (!this.eventBuilder_.t()) {
                    this.eventBuilder_.a(adExtension.event_);
                } else {
                    this.eventBuilder_.h();
                    this.eventBuilder_ = null;
                    this.event_ = adExtension.event_;
                    this.bitField0_ &= -2;
                    this.eventBuilder_ = h0.alwaysUseFieldBuilders ? getEventFieldBuilder() : null;
                }
            }
            internalGetMutableCustomParams().o(adExtension.internalGetCustomParams());
            if (adExtension.getSkipoffset() != 0) {
                setSkipoffset(adExtension.getSkipoffset());
            }
            if (adExtension.getCompanionSkipoffset() != 0) {
                setCompanionSkipoffset(adExtension.getCompanionSkipoffset());
            }
            if (adExtension.getUseNativeClose()) {
                setUseNativeClose(adExtension.getUseNativeClose());
            }
            if (adExtension.getR1()) {
                setR1(adExtension.getR1());
            }
            if (adExtension.getR2()) {
                setR2(adExtension.getR2());
            }
            if (adExtension.hasCountdown()) {
                mergeCountdown(adExtension.getCountdown());
            }
            if (adExtension.hasCloseButton()) {
                mergeCloseButton(adExtension.getCloseButton());
            }
            if (adExtension.getIgnoresSafeAreaLayoutGuide()) {
                setIgnoresSafeAreaLayoutGuide(adExtension.getIgnoresSafeAreaLayoutGuide());
            }
            if (!adExtension.getStoreUrl().isEmpty()) {
                this.storeUrl_ = adExtension.storeUrl_;
                onChanged();
            }
            if (adExtension.hasProgress()) {
                mergeProgress(adExtension.getProgress());
            }
            if (adExtension.getProgressDuration() != 0) {
                setProgressDuration(adExtension.getProgressDuration());
            }
            if (adExtension.getViewabilityIgnoreWindowFocus()) {
                setViewabilityIgnoreWindowFocus(adExtension.getViewabilityIgnoreWindowFocus());
            }
            if (adExtension.adCacheControl_ != 0) {
                setAdCacheControlValue(adExtension.getAdCacheControlValue());
            }
            if (adExtension.getAdCacheMaxAge() != 0) {
                setAdCacheMaxAge(adExtension.getAdCacheMaxAge());
            }
            if (adExtension.getR1Delay() != 0) {
                setR1Delay(adExtension.getR1Delay());
            }
            if (adExtension.getAdMarkupLoadingTimeout() != 0) {
                setAdMarkupLoadingTimeout(adExtension.getAdMarkupLoadingTimeout());
            }
            if (adExtension.getUseEmbeddedBrowser()) {
                setUseEmbeddedBrowser(adExtension.getUseEmbeddedBrowser());
            }
            if (adExtension.getPreloadAd()) {
                setPreloadAd(adExtension.getPreloadAd());
            }
            if (adExtension.creativeLoadingMethod_ != 0) {
                setCreativeLoadingMethodValue(adExtension.getCreativeLoadingMethodValue());
            }
            if (adExtension.getPlaceholderTimeout() != 0.0f) {
                setPlaceholderTimeout(adExtension.getPlaceholderTimeout());
            }
            if (adExtension.hasEventConfiguration()) {
                mergeEventConfiguration(adExtension.getEventConfiguration());
            }
            if (adExtension.getViewabilityIgnoreOverlap()) {
                setViewabilityIgnoreOverlap(adExtension.getViewabilityIgnoreOverlap());
            }
            if (adExtension.hasCreativeExtension()) {
                mergeCreativeExtension(adExtension.getCreativeExtension());
            }
            if (adExtension.getAdFlexibleSize()) {
                setAdFlexibleSize(adExtension.getAdFlexibleSize());
            }
            if (adExtension.hasRenderingConfiguration()) {
                mergeRenderingConfiguration(adExtension.getRenderingConfiguration());
            }
            if (adExtension.getMraidCreativeValidationRequired()) {
                setMraidCreativeValidationRequired(adExtension.getMraidCreativeValidationRequired());
            }
            if (adExtension.getCreativeLoadingTimeout() != 0) {
                setCreativeLoadingTimeout(adExtension.getCreativeLoadingTimeout());
            }
            if (adExtension.getCridMonitoringEnabled()) {
                setCridMonitoringEnabled(adExtension.getCridMonitoringEnabled());
            }
            mergeUnknownFields(((h0) adExtension).unknownFields);
            onChanged();
            return this;
        }

        public Builder addEvent(Ad.Event.Builder builder) {
            v1 v1Var = this.eventBuilder_;
            if (v1Var == null) {
                ensureEventIsMutable();
                this.event_.add(builder.build());
                onChanged();
                return this;
            }
            v1Var.e(builder.build());
            return this;
        }

        public Builder addEvent(int i10, Ad.Event.Builder builder) {
            v1 v1Var = this.eventBuilder_;
            if (v1Var == null) {
                ensureEventIsMutable();
                this.event_.add(i10, builder.build());
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
        public io.bidmachine.protobuf.AdExtension.Builder mergeFrom(com.explorestack.protobuf.l r3, com.explorestack.protobuf.w r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.p1 r1 = io.bidmachine.protobuf.AdExtension.access$9100()     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
                io.bidmachine.protobuf.AdExtension r3 = (io.bidmachine.protobuf.AdExtension) r3     // Catch: java.lang.Throwable -> L11 com.explorestack.protobuf.InvalidProtocolBufferException -> L13
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
                io.bidmachine.protobuf.AdExtension r4 = (io.bidmachine.protobuf.AdExtension) r4     // Catch: java.lang.Throwable -> L11
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
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.AdExtension.Builder.mergeFrom(com.explorestack.protobuf.l, com.explorestack.protobuf.w):io.bidmachine.protobuf.AdExtension$Builder");
        }
    }

    public static Builder newBuilder(AdExtension adExtension) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(adExtension);
    }

    public static AdExtension parseFrom(ByteBuffer byteBuffer, w wVar) throws InvalidProtocolBufferException {
        return (AdExtension) PARSER.parseFrom(byteBuffer, wVar);
    }

    private AdExtension(h0.b bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static AdExtension parseDelimitedFrom(InputStream inputStream, w wVar) throws IOException {
        return (AdExtension) h0.parseDelimitedWithIOException(PARSER, inputStream, wVar);
    }

    public static AdExtension parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AdExtension) PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public AdExtension getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static AdExtension parseFrom(ByteString byteString, w wVar) throws InvalidProtocolBufferException {
        return (AdExtension) PARSER.parseFrom(byteString, wVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private AdExtension() {
        this.memoizedIsInitialized = (byte) -1;
        this.event_ = Collections.EMPTY_LIST;
        this.storeUrl_ = "";
        this.adCacheControl_ = 0;
        this.creativeLoadingMethod_ = 0;
    }

    public static AdExtension parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AdExtension) PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.h0
    public Builder newBuilderForType(h0.c cVar) {
        return new Builder(cVar);
    }

    public static AdExtension parseFrom(byte[] bArr, w wVar) throws InvalidProtocolBufferException {
        return (AdExtension) PARSER.parseFrom(bArr, wVar);
    }

    public static AdExtension parseFrom(InputStream inputStream) throws IOException {
        return (AdExtension) h0.parseWithIOException(PARSER, inputStream);
    }

    public static AdExtension parseFrom(InputStream inputStream, w wVar) throws IOException {
        return (AdExtension) h0.parseWithIOException(PARSER, inputStream, wVar);
    }

    private AdExtension(l lVar, w wVar) throws InvalidProtocolBufferException {
        this();
        wVar.getClass();
        r2.b bVarG = r2.g();
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    int iK = lVar.K();
                    switch (iK) {
                        case 0:
                            z10 = true;
                            break;
                        case 16:
                            this.preload_ = lVar.q();
                            break;
                        case 24:
                            this.loadSkipoffset_ = lVar.L();
                            break;
                        case 32:
                            this.viewabilityTimeThreshold_ = lVar.L();
                            break;
                        case 45:
                            this.viewabilityPixelThreshold_ = lVar.w();
                            break;
                        case 53:
                            this.viewabilityDurationThreshold_ = lVar.w();
                            break;
                        case 58:
                            int i11 = (i10 == true ? 1 : 0) & 1;
                            i10 = i10;
                            if (i11 == 0) {
                                this.event_ = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 1;
                            }
                            this.event_.add((Ad.Event) lVar.A(Ad.Event.parser(), wVar));
                            break;
                        case 66:
                            int i12 = (i10 == true ? 1 : 0) & 2;
                            i10 = i10;
                            if (i12 == 0) {
                                this.customParams_ = w0.p(CustomParamsDefaultEntryHolder.defaultEntry);
                                i10 = (i10 == true ? 1 : 0) | 2;
                            }
                            u0 u0Var = (u0) lVar.A(CustomParamsDefaultEntryHolder.defaultEntry.getParserForType(), wVar);
                            this.customParams_.l().put(u0Var.i(), u0Var.k());
                            break;
                        case 72:
                            this.skipoffset_ = lVar.L();
                            break;
                        case 80:
                            this.companionSkipoffset_ = lVar.L();
                            break;
                        case 88:
                            this.useNativeClose_ = lVar.q();
                            break;
                        case 96:
                            this.r1_ = lVar.q();
                            break;
                        case 104:
                            this.r2_ = lVar.q();
                            break;
                        case 114:
                            ControlAsset controlAsset = this.countdown_;
                            ControlAsset.Builder builder = controlAsset != null ? controlAsset.toBuilder() : null;
                            ControlAsset controlAsset2 = (ControlAsset) lVar.A(ControlAsset.parser(), wVar);
                            this.countdown_ = controlAsset2;
                            if (builder != null) {
                                builder.mergeFrom(controlAsset2);
                                this.countdown_ = builder.buildPartial();
                            }
                            break;
                        case 122:
                            ControlAsset controlAsset3 = this.closeButton_;
                            ControlAsset.Builder builder2 = controlAsset3 != null ? controlAsset3.toBuilder() : null;
                            ControlAsset controlAsset4 = (ControlAsset) lVar.A(ControlAsset.parser(), wVar);
                            this.closeButton_ = controlAsset4;
                            if (builder2 != null) {
                                builder2.mergeFrom(controlAsset4);
                                this.closeButton_ = builder2.buildPartial();
                            }
                            break;
                        case 128:
                            this.ignoresSafeAreaLayoutGuide_ = lVar.q();
                            break;
                        case 138:
                            this.storeUrl_ = lVar.J();
                            break;
                        case POBCoreNativeConstants.POB_NATIVE_MAIN_IMG_H /* 146 */:
                            ControlAsset controlAsset5 = this.progress_;
                            ControlAsset.Builder builder3 = controlAsset5 != null ? controlAsset5.toBuilder() : null;
                            ControlAsset controlAsset6 = (ControlAsset) lVar.A(ControlAsset.parser(), wVar);
                            this.progress_ = controlAsset6;
                            if (builder3 != null) {
                                builder3.mergeFrom(controlAsset6);
                                this.progress_ = builder3.buildPartial();
                            }
                            break;
                        case 152:
                            this.progressDuration_ = lVar.L();
                            break;
                        case 160:
                            this.viewabilityIgnoreWindowFocus_ = lVar.q();
                            break;
                        case 168:
                            this.adCacheControl_ = lVar.t();
                            break;
                        case 176:
                            this.adCacheMaxAge_ = lVar.L();
                            break;
                        case 184:
                            this.r1Delay_ = lVar.L();
                            break;
                        case 192:
                            this.adMarkupLoadingTimeout_ = lVar.L();
                            break;
                        case 200:
                            this.useEmbeddedBrowser_ = lVar.q();
                            break;
                        case 208:
                            this.preloadAd_ = lVar.q();
                            break;
                        case AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE:
                            this.creativeLoadingMethod_ = lVar.t();
                            break;
                        case 229:
                            this.placeholderTimeout_ = lVar.w();
                            break;
                        case 234:
                            EventConfiguration eventConfiguration = this.eventConfiguration_;
                            EventConfiguration.Builder builder4 = eventConfiguration != null ? eventConfiguration.toBuilder() : null;
                            EventConfiguration eventConfiguration2 = (EventConfiguration) lVar.A(EventConfiguration.parser(), wVar);
                            this.eventConfiguration_ = eventConfiguration2;
                            if (builder4 != null) {
                                builder4.mergeFrom(eventConfiguration2);
                                this.eventConfiguration_ = builder4.buildPartial();
                            }
                            break;
                        case 240:
                            this.viewabilityIgnoreOverlap_ = lVar.q();
                            break;
                        case 250:
                            CreativeExtension creativeExtension = this.creativeExtension_;
                            CreativeExtension.Builder builder5 = creativeExtension != null ? creativeExtension.toBuilder() : null;
                            CreativeExtension creativeExtension2 = (CreativeExtension) lVar.A(CreativeExtension.parser(), wVar);
                            this.creativeExtension_ = creativeExtension2;
                            if (builder5 != null) {
                                builder5.mergeFrom(creativeExtension2);
                                this.creativeExtension_ = builder5.buildPartial();
                            }
                            break;
                        case 256:
                            this.adFlexibleSize_ = lVar.q();
                            break;
                        case 266:
                            Rendering rendering = this.renderingConfiguration_;
                            Rendering.Builder builder6 = rendering != null ? rendering.toBuilder() : null;
                            Rendering rendering2 = (Rendering) lVar.A(Rendering.parser(), wVar);
                            this.renderingConfiguration_ = rendering2;
                            if (builder6 != null) {
                                builder6.mergeFrom(rendering2);
                                this.renderingConfiguration_ = builder6.buildPartial();
                            }
                            break;
                        case 272:
                            this.mraidCreativeValidationRequired_ = lVar.q();
                            break;
                        case 280:
                            this.creativeLoadingTimeout_ = lVar.y();
                            break;
                        case 288:
                            this.cridMonitoringEnabled_ = lVar.q();
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
                if (((i10 == true ? 1 : 0) & 1) != 0) {
                    this.event_ = DesugarCollections.unmodifiableList(this.event_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        if (((i10 == true ? 1 : 0) & 1) != 0) {
            this.event_ = DesugarCollections.unmodifiableList(this.event_);
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }

    public static AdExtension parseFrom(l lVar) throws IOException {
        return (AdExtension) h0.parseWithIOException(PARSER, lVar);
    }

    public static AdExtension parseFrom(l lVar, w wVar) throws IOException {
        return (AdExtension) h0.parseWithIOException(PARSER, lVar, wVar);
    }
}
