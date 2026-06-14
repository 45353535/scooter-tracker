package com.taurusx.tax.vast;

import androidx.media3.common.MimeTypes;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.taurusx.tax.f.y;
import com.taurusx.tax.g.n;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000  2\u00020\u0001:\u0003 !\"B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003J\b\u0010\u001a\u001a\u00020\tH\u0016J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\b\u0010\u001f\u001a\u00020\u0003H\u0016R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006#"}, d2 = {"Lcom/taurusx/tax/vast/VastResource;", "Ljava/io/Serializable;", n.f66163g, "", "type", "Lcom/taurusx/tax/vast/VastResource$Type;", "creativeType", "Lcom/taurusx/tax/vast/VastResource$CreativeType;", "width", "", "height", "(Ljava/lang/String;Lcom/taurusx/tax/vast/VastResource$Type;Lcom/taurusx/tax/vast/VastResource$CreativeType;II)V", "getCreativeType", "()Lcom/taurusx/tax/vast/VastResource$CreativeType;", "getHeight", "()I", "getResource", "()Ljava/lang/String;", "getType", "()Lcom/taurusx/tax/vast/VastResource$Type;", "getWidth", "equals", "", "other", "", "getHtmlResourceValue", "hashCode", "initializeWebView", "", "webView", "Lcom/taurusx/tax/vast/VastWebView;", "toString", y.f66058y, "CreativeType", "Type", "tax_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class VastResource implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final List<String> f67012a = CollectionsKt.listOf((Object[]) new String[]{"image/jpeg", MimeTypes.IMAGE_PNG, MimeTypes.IMAGE_BMP, "image/gif", "image/jpg"});

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final List<String> f67013n = CollectionsKt.listOf("application/x-javascript");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final long f67014s = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from toString */
    @SerializedName("width")
    @Expose
    public final int width;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from toString */
    @SerializedName("height")
    @Expose
    public final int height;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from toString */
    @SerializedName("type")
    @Expose
    @NotNull
    public final Type type;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from toString */
    @SerializedName("creative_type")
    @Expose
    @NotNull
    public final CreativeType creativeType;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from toString */
    @SerializedName(n.f66163g)
    @Expose
    @NotNull
    public final String resource;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\"\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/taurusx/tax/vast/VastResource$Companion;", "", "()V", "VALID_APPLICATION_TYPES", "", "", "VALID_IMAGE_TYPES", "serialVersionUID", "", "fromVastResourceXmlManager", "Lcom/taurusx/tax/vast/VastResource;", "resourceXmlManager", "Lcom/taurusx/tax/vast/VastResourceXmlManager;", "type", "Lcom/taurusx/tax/vast/VastResource$Type;", "width", "", "height", "tax_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Type.valuesCustom().length];
                iArr[1] = 1;
                iArr[0] = 2;
                iArr[2] = 3;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final VastResource fromVastResourceXmlManager(@NotNull VastResourceXmlManager resourceXmlManager, int width, int height) {
            Intrinsics.checkNotNullParameter(resourceXmlManager, "resourceXmlManager");
            Type[] typeArrValuesCustom = Type.valuesCustom();
            ArrayList arrayList = new ArrayList();
            for (Type type : typeArrValuesCustom) {
                VastResource vastResourceFromVastResourceXmlManager = VastResource.INSTANCE.fromVastResourceXmlManager(resourceXmlManager, type, width, height);
                if (vastResourceFromVastResourceXmlManager != null) {
                    arrayList.add(vastResourceFromVastResourceXmlManager);
                }
            }
            return (VastResource) CollectionsKt.firstOrNull((List) arrayList);
        }

        public Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x005b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.taurusx.tax.vast.VastResource fromVastResourceXmlManager(@org.jetbrains.annotations.NotNull com.taurusx.tax.vast.VastResourceXmlManager r11, @org.jetbrains.annotations.NotNull com.taurusx.tax.vast.VastResource.Type r12, int r13, int r14) {
            /*
                r10 = this;
                java.lang.String r0 = "resourceXmlManager"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
                java.lang.String r0 = "type"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
                java.lang.String r0 = r11.c()
                com.taurusx.tax.vast.VastResource$CreativeType r1 = com.taurusx.tax.vast.VastResource.CreativeType.NONE
                int r2 = r12.ordinal()
                r3 = 0
                if (r2 == 0) goto L54
                r4 = 1
                if (r2 == r4) goto L27
                r0 = 2
                if (r2 == r0) goto L20
                r7 = r1
                r5 = r3
                goto L59
            L20:
                java.lang.String r11 = r11.w()
            L24:
                r5 = r11
                r7 = r1
                goto L59
            L27:
                java.lang.String r11 = r11.y()
                java.util.List r1 = com.taurusx.tax.vast.VastResource.access$getVALID_IMAGE_TYPES$cp()
                boolean r1 = r1.contains(r0)
                if (r1 != 0) goto L41
                java.util.List r1 = com.taurusx.tax.vast.VastResource.access$getVALID_APPLICATION_TYPES$cp()
                boolean r1 = r1.contains(r0)
                if (r1 == 0) goto L40
                goto L41
            L40:
                r11 = r3
            L41:
                com.taurusx.tax.vast.VastResource$CreativeType r1 = com.taurusx.tax.vast.VastResource.CreativeType.IMAGE
                java.util.List r2 = com.taurusx.tax.vast.VastResource.access$getVALID_IMAGE_TYPES$cp()
                boolean r0 = r2.contains(r0)
                if (r0 == 0) goto L4e
                goto L4f
            L4e:
                r1 = r3
            L4f:
                if (r1 != 0) goto L24
                com.taurusx.tax.vast.VastResource$CreativeType r1 = com.taurusx.tax.vast.VastResource.CreativeType.JAVASCRIPT
                goto L24
            L54:
                java.lang.String r11 = r11.z()
                goto L24
            L59:
                if (r5 != 0) goto L5c
                return r3
            L5c:
                com.taurusx.tax.vast.VastResource r4 = new com.taurusx.tax.vast.VastResource
                r6 = r12
                r8 = r13
                r9 = r14
                r4.<init>(r5, r6, r7, r8, r9)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.vast.VastResource.Companion.fromVastResourceXmlManager(com.taurusx.tax.vast.VastResourceXmlManager, com.taurusx.tax.vast.VastResource$Type, int, int):com.taurusx.tax.vast.VastResource");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/taurusx/tax/vast/VastResource$CreativeType;", "", "(Ljava/lang/String;I)V", "NONE", "IMAGE", "JAVASCRIPT", "tax_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum CreativeType {
        NONE,
        IMAGE,
        JAVASCRIPT;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static CreativeType[] valuesCustom() {
            CreativeType[] creativeTypeArrValuesCustom = values();
            return (CreativeType[]) Arrays.copyOf(creativeTypeArrValuesCustom, creativeTypeArrValuesCustom.length);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/taurusx/tax/vast/VastResource$Type;", "", "(Ljava/lang/String;I)V", "HTML_RESOURCE", "STATIC_RESOURCE", "IFRAME_RESOURCE", "BLURRED_LAST_FRAME", "tax_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum Type {
        HTML_RESOURCE,
        STATIC_RESOURCE,
        IFRAME_RESOURCE,
        BLURRED_LAST_FRAME;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static Type[] valuesCustom() {
            Type[] typeArrValuesCustom = values();
            return (Type[]) Arrays.copyOf(typeArrValuesCustom, typeArrValuesCustom.length);
        }
    }

    public VastResource(@NotNull String resource, @NotNull Type type, @NotNull CreativeType creativeType, int i10, int i11) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(creativeType, "creativeType");
        this.resource = resource;
        this.type = type;
        this.creativeType = creativeType;
        this.width = i10;
        this.height = i11;
    }

    @Nullable
    public static final VastResource fromVastResourceXmlManager(@NotNull VastResourceXmlManager vastResourceXmlManager, int i10, int i11) {
        return INSTANCE.fromVastResourceXmlManager(vastResourceXmlManager, i10, i11);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VastResource)) {
            return false;
        }
        VastResource vastResource = (VastResource) other;
        return Intrinsics.areEqual(this.resource, vastResource.resource) && this.type == vastResource.type && this.creativeType == vastResource.creativeType && this.width == vastResource.width && this.height == vastResource.height;
    }

    @NotNull
    public final CreativeType getCreativeType() {
        return this.creativeType;
    }

    public final int getHeight() {
        return this.height;
    }

    @Nullable
    public final String getHtmlResourceValue() {
        Type type = this.type;
        if (type == Type.HTML_RESOURCE) {
            return this.resource;
        }
        if (type == Type.IFRAME_RESOURCE) {
            return "<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=\"" + this.width + "\" height=\"" + this.height + "\" src=\"" + this.resource + "\"></iframe>";
        }
        Type type2 = Type.STATIC_RESOURCE;
        if (type == type2 && this.creativeType == CreativeType.IMAGE) {
            return this.resource;
        }
        if (type != type2 || this.creativeType != CreativeType.JAVASCRIPT) {
            if (type == Type.BLURRED_LAST_FRAME) {
                return this.resource;
            }
            return null;
        }
        return "<script src=\"" + this.resource + "\"></script>";
    }

    @NotNull
    public final String getResource() {
        return this.resource;
    }

    @NotNull
    public final Type getType() {
        return this.type;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (((((((this.resource.hashCode() * 31) + this.type.hashCode()) * 31) + this.creativeType.hashCode()) * 31) + this.width) * 31) + this.height;
    }

    public final void initializeWebView(@NotNull VastWebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        String htmlResourceValue = getHtmlResourceValue();
        if (htmlResourceValue == null) {
            return;
        }
        webView.z(htmlResourceValue);
    }

    @NotNull
    public String toString() {
        return "VastResource(resource='" + this.resource + "', type=" + this.type + ", creativeType=" + this.creativeType + ", width=" + this.width + ", height=" + this.height + ')';
    }

    @Nullable
    public static final VastResource fromVastResourceXmlManager(@NotNull VastResourceXmlManager vastResourceXmlManager, @NotNull Type type, int i10, int i11) {
        return INSTANCE.fromVastResourceXmlManager(vastResourceXmlManager, type, i10, i11);
    }
}
