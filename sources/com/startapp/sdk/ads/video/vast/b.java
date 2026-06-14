package com.startapp.sdk.ads.video.vast;

import androidx.media3.common.MimeTypes;
import com.startapp.sdk.internal.bj;
import com.taurusx.tax.vast.VastResourceXmlManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final List f63924f = Arrays.asList("image/jpeg", MimeTypes.IMAGE_PNG, MimeTypes.IMAGE_BMP, "image/gif");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f63925g = Collections.singletonList("application/x-javascript");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VASTResource$Type f63927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final VASTResource$CreativeType f63928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f63929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f63930e;

    public b(String str, VASTResource$Type vASTResource$Type, VASTResource$CreativeType vASTResource$CreativeType, int i10, int i11) {
        this.f63926a = str;
        this.f63927b = vASTResource$Type;
        this.f63928c = vASTResource$CreativeType;
        this.f63929d = i10;
        this.f63930e = i11;
    }

    public static b a(bj bjVar, VASTResource$Type vASTResource$Type, int i10, int i11) {
        String strF;
        VASTResource$CreativeType vASTResource$CreativeType;
        String str;
        String strC = bjVar.c();
        VASTResource$CreativeType vASTResource$CreativeType2 = VASTResource$CreativeType.NONE;
        int iOrdinal = vASTResource$Type.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    strF = bjVar.f(VastResourceXmlManager.IFRAME_RESOURCE);
                }
                vASTResource$CreativeType = vASTResource$CreativeType2;
                str = null;
            } else {
                strF = bjVar.f(VastResourceXmlManager.HTML_RESOURCE);
            }
            str = strF;
            vASTResource$CreativeType = vASTResource$CreativeType2;
        } else {
            strF = bjVar.f(VastResourceXmlManager.STATIC_RESOURCE);
            if (strF != null) {
                List list = f63924f;
                if (!list.contains(strC) && !f63925g.contains(strC)) {
                    strF = null;
                }
                vASTResource$CreativeType2 = list.contains(strC) ? VASTResource$CreativeType.IMAGE : VASTResource$CreativeType.JAVASCRIPT;
                str = strF;
                vASTResource$CreativeType = vASTResource$CreativeType2;
            }
            vASTResource$CreativeType = vASTResource$CreativeType2;
            str = null;
        }
        if (str == null) {
            return null;
        }
        return new b(str, vASTResource$Type, vASTResource$CreativeType, i10, i11);
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder("<!DOCTYPE html><html><head><link rel=\"icon\" href=\"data:;base64,iVBORw0KGgo=\" /><style type=\"text/css\"> html, body { background-color: black; height: 100%; margin: 0; } #content { border: 0px; position: absolute; top: 50%; left: 50%; margin: -");
        sb2.append(this.f63930e / 2);
        sb2.append("px 0 0 -");
        sb2.append(this.f63929d / 2);
        sb2.append("px; }</style><script>function performClick() { top.location.href = \"https://www.startapp.com\"; }</script></head><body onclick=\"performClick()\">");
        int iOrdinal = this.f63927b.ordinal();
        if (iOrdinal == 0) {
            VASTResource$CreativeType vASTResource$CreativeType = this.f63928c;
            if (vASTResource$CreativeType == VASTResource$CreativeType.IMAGE) {
                sb2.append("<img id=\"content\" width=\"");
                sb2.append(this.f63929d);
                sb2.append("\" height=\"");
                sb2.append(this.f63930e);
                sb2.append("\" src=\"");
                sb2.append(this.f63926a);
                sb2.append("\" />");
            } else if (vASTResource$CreativeType == VASTResource$CreativeType.JAVASCRIPT) {
                sb2.append("<script src=\"");
                sb2.append(this.f63926a);
                sb2.append("\" />");
            }
        } else {
            if (iOrdinal == 1) {
                return this.f63926a;
            }
            if (iOrdinal == 2) {
                sb2.append("<iframe id=\"content\" frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" width=\"");
                sb2.append(this.f63929d);
                sb2.append("\" height=\"");
                sb2.append(this.f63930e);
                sb2.append("\" src=\"");
                sb2.append(this.f63926a);
                sb2.append("\" />");
            }
        }
        sb2.append("</body></html>");
        return sb2.toString();
    }
}
