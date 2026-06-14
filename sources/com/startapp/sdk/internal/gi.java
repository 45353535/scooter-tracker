package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Build;
import android.os.ext.SdkExtensions;
import b.a;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.TopicsClientMetadata;
import com.startapp.sdk.common.utils.Pair;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class gi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f64577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb f64578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lb f64579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q5 f64580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference f64581e = new AtomicReference();

    public gi(Context context, lb lbVar, lb lbVar2, q5 q5Var) {
        this.f64577a = context;
        this.f64578b = lbVar;
        this.f64579c = lbVar2;
        this.f64580d = q5Var;
    }

    public final void a() {
        if (Build.VERSION.SDK_INT < 33 || SdkExtensions.getExtensionVersion(30) < 4 || SdkExtensions.getExtensionVersion(1000000) < 5) {
            return;
        }
        try {
            this.f64580d.getClass();
            TopicsClientMetadata topicsClientMetadataB0 = MetaData.E().b0();
            if (topicsClientMetadataB0 != null && vi.a(topicsClientMetadataB0.a())) {
                androidx.privacysandbox.ads.adservices.topics.a.a(this.f64577a.getSystemService(b.d.class));
                new a.C0123a().b(this.f64577a.getPackageName()).c(true).a();
                new fi(this);
                throw null;
            }
        } catch (Throwable th2) {
            if (a(2)) {
                g9.a(th2);
            }
        }
    }

    public final void b() {
        m8 m8Var = (m8) this.f64578b.a();
        m8Var.f64912a.post(new Runnable() { // from class: com.startapp.sdk.internal.zl
            @Override // java.lang.Runnable
            public final void run() {
                this.f65700b.a();
            }
        });
    }

    public final boolean a(int i10) {
        TopicsClientMetadata topicsClientMetadata = (TopicsClientMetadata) this.f64580d.a();
        ComponentInfoEventConfig componentInfoEventConfigB = topicsClientMetadata != null ? topicsClientMetadata.b() : null;
        return componentInfoEventConfigB != null && componentInfoEventConfigB.a((long) i10);
    }

    public static String a(HashMap map) {
        StringBuilder sb2 = new StringBuilder();
        String str = "";
        for (Map.Entry entry : map.entrySet()) {
            sb2.append(str);
            sb2.append('M');
            sb2.append(((Pair) entry.getKey()).first);
            sb2.append('T');
            sb2.append(((Pair) entry.getKey()).second);
            String str2 = StringUtils.PROCESS_POSTFIX_DELIMITER;
            for (Integer num : (Set) entry.getValue()) {
                sb2.append(str2);
                sb2.append(num);
                str2 = StringUtils.COMMA;
            }
            str = ";";
        }
        return sb2.length() > 0 ? sb2.toString() : "NONE";
    }
}
