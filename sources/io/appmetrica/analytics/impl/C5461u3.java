package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.u3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5461u3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f78319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4991bf f78320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f78321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SafePackageManager f78322d;

    public C5461u3(Context context, C4991bf c4991bf, String str, SafePackageManager safePackageManager) {
        this.f78319a = context;
        this.f78320b = c4991bf;
        this.f78321c = str;
        this.f78322d = safePackageManager;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final List a() {
        Signature[] apkContentsSigners;
        String sha1;
        List<String> listG = this.f78320b.g();
        boolean zIsEmpty = listG.isEmpty();
        List list = listG;
        if (zIsEmpty) {
            ArrayList arrayList = new ArrayList();
            try {
                if (AndroidUtils.isApiAchieved(28)) {
                    SigningInfo signingInfo = this.f78322d.getPackageInfo(this.f78319a, this.f78321c, 134217728).signingInfo;
                    apkContentsSigners = signingInfo.hasMultipleSigners() ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory();
                } else {
                    apkContentsSigners = this.f78322d.getPackageInfo(this.f78319a, this.f78321c, 64).signatures;
                }
                if (apkContentsSigners != null) {
                    for (Signature signature : apkContentsSigners) {
                        try {
                            sha1 = StringUtils.formatSha1(MessageDigest.getInstance(com.taurusx.tax.y.s.w.f67666t).digest(signature.toByteArray()));
                        } catch (Throwable unused) {
                            sha1 = null;
                        }
                        if (sha1 != null) {
                            arrayList.add(sha1);
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
            Collections.sort(arrayList);
            boolean zIsEmpty2 = arrayList.isEmpty();
            list = arrayList;
            if (!zIsEmpty2) {
                this.f78320b.a(arrayList).b();
                list = arrayList;
            }
        }
        return list;
    }
}
