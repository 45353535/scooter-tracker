package com.startapp.sdk.adsbase.commontracking;

import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.pg;
import com.startapp.sdk.internal.vi;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class TrackingParams implements Serializable {
    private static final long serialVersionUID = 8119468204117511007L;
    private String adTag;
    private String clientSessionId;
    private boolean mraid;
    private String nonImpressionReason;
    private int offset;
    private String profileId;

    public TrackingParams() {
        this(null);
    }

    public final String a() {
        return this.adTag;
    }

    public final int b() {
        return this.offset;
    }

    public String c() {
        if (this.offset <= 0) {
            return "";
        }
        return "&offset=" + this.offset;
    }

    public final String d() {
        return this.profileId;
    }

    public String e() {
        String str;
        String str2;
        String str3;
        StringBuilder sb2 = new StringBuilder();
        String str4 = this.adTag;
        String str5 = "";
        if (str4 == null || str4.equals("")) {
            str = "";
        } else {
            str = "&adTag=" + vi.a(this.adTag.substring(0, Math.min(this.adTag.length(), 200)));
        }
        sb2.append(str);
        if (this.clientSessionId != null) {
            str2 = "&clientSessionId=" + vi.a(this.clientSessionId);
        } else {
            str2 = "";
        }
        sb2.append(str2);
        if (this.profileId != null) {
            str3 = "&profileId=" + vi.a(this.profileId);
        } else {
            str3 = "";
        }
        sb2.append(str3);
        sb2.append(c());
        sb2.append(this.mraid ? "&mraid=true" : "");
        String str6 = this.nonImpressionReason;
        if (str6 != null && !str6.equals("")) {
            str5 = "&isShown=false&reason=" + vi.a(this.nonImpressionReason);
        }
        sb2.append(str5);
        return sb2.toString();
    }

    public TrackingParams(String str) {
        this.adTag = str;
        this.clientSessionId = pg.f65112d.f65113a;
        this.profileId = MetaData.E().Q();
        this.offset = 0;
    }

    public final TrackingParams a(int i10) {
        this.offset = i10;
        return this;
    }

    public final void a(boolean z10) {
        this.mraid = z10;
    }

    public final TrackingParams a(String str) {
        this.nonImpressionReason = str;
        return this;
    }
}
