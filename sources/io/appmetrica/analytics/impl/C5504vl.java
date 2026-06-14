package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.vl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5504vl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Jc f78463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ic f78464b;

    public C5504vl(PublicLogger publicLogger, String str) {
        this(new Jc(str, publicLogger), new Ic(str, publicLogger));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized boolean a(Mc mc2, String str, String str2) {
        try {
            int size = mc2.size();
            int i10 = this.f78463a.f75992c.f78257a;
            if (size < i10 || (i10 == mc2.size() && mc2.containsKey(str))) {
                this.f78464b.getClass();
                int length = mc2.f76125a;
                if (str2 != null) {
                    length += str2.length();
                }
                if (mc2.containsKey(str)) {
                    String str3 = (String) mc2.get(str);
                    if (str3 != null) {
                        length -= str3.length();
                    }
                } else {
                    length += str.length();
                }
                if (length <= 4500) {
                    mc2.put(str, str2);
                    return true;
                }
                Ic ic2 = this.f78464b;
                ic2.f75937b.warning("The %s has reached the total size limit that equals %d symbols. Item with key %s will be ignored", ic2.f75936a, 4500, str);
            } else {
                Jc jc2 = this.f78463a;
                jc2.f75993d.warning("The %s has reached the limit of %d items. Item with key %s will be ignored", jc2.f75994e, Integer.valueOf(jc2.f75992c.f78257a), str);
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final boolean b(Mc mc2, String str, String str2) {
        if (mc2 == null) {
            return false;
        }
        String strA = this.f78463a.f75990a.a(str);
        String strA2 = this.f78463a.f75991b.a(str2);
        if (!mc2.containsKey(strA)) {
            if (strA2 != null) {
                return a(mc2, strA, strA2);
            }
            return false;
        }
        String str3 = (String) mc2.get(strA);
        if (strA2 == null || !strA2.equals(str3)) {
            return a(mc2, strA, strA2);
        }
        return false;
    }

    public C5504vl(Jc jc2, Ic ic2) {
        this.f78463a = jc2;
        this.f78464b = ic2;
    }
}
