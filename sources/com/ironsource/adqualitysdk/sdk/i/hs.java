package com.ironsource.adqualitysdk.sdk.i;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class hs {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private hs f2421;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private dn f2422;

    static class a {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private hr f2423;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private int f2424;

        private a() {
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final boolean m6629(Method method) {
            if (this.f2423 == null || (method.getModifiers() & this.f2423.m6578()) != this.f2423.m6578() || (method.getModifiers() & this.f2423.m6579()) != 0 || this.f2423.m6604().contains(method.getReturnType())) {
                return false;
            }
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (this.f2423.m6599() != -1 && this.f2423.m6599() != parameterTypes.length) {
                return false;
            }
            List<Class> listM6600 = this.f2423.m6600();
            if (listM6600 != null) {
                if (listM6600.size() != parameterTypes.length) {
                    return false;
                }
                for (int i10 = 0; i10 < listM6600.size(); i10++) {
                    if (!listM6600.get(i10).equals(parameterTypes[i10])) {
                        return false;
                    }
                }
            }
            if (this.f2423.m6603() != null ? this.f2423.m6601() ? method.getReturnType().equals(this.f2423.m6603()) : this.f2423.m6603().isAssignableFrom(method.getReturnType()) : true) {
                int i11 = this.f2424;
                if (i11 == 0) {
                    return true;
                }
                this.f2424 = i11 - 1;
            }
            return false;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final void m6630(hr hrVar) {
            this.f2423 = hrVar;
            this.f2424 = hrVar.m6602();
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final hr m6631() {
            return this.f2423;
        }

        /* synthetic */ a(byte b10) {
            this();
        }
    }

    public hs() {
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m6619(Class cls, a aVar, List<Method> list) {
        hr hrVarM6631 = aVar.m6631();
        for (Method method : (hrVarM6631 == null || !hrVarM6631.m6577()) ? Arrays.asList(cls.getDeclaredMethods()) : m6622(cls, hrVarM6631.m6577(), hrVarM6631.m6580())) {
            if (aVar.m6629(method)) {
                list.add(method);
            }
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static List<Method> m6620(Class cls, hr hrVar) {
        ArrayList arrayList = new ArrayList();
        m6621(cls, hrVar, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m6621(Class cls, hr hrVar, List<Method> list) {
        a aVar = new a((byte) 0);
        aVar.m6630(hrVar);
        m6619(cls, aVar, list);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static List<Method> m6622(Class cls, boolean z10, int i10) {
        Method[] methodArrM7143 = new Method[0];
        if (cls != null) {
            methodArrM7143 = kb.m7143(cls.getDeclaredMethods(), cls.getMethods());
            if (!z10) {
                return Arrays.asList(methodArrM7143);
            }
            Class superclass = cls.getSuperclass();
            for (int i11 = 0; superclass != null && i11 != i10; i11++) {
                methodArrM7143 = kb.m7143(kb.m7143(methodArrM7143, superclass.getDeclaredMethods()), superclass.getMethods());
                superclass = superclass.getSuperclass();
            }
        }
        return Arrays.asList(methodArrM7143);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m6626() {
        return this.f2422.m6309();
    }

    public hs(dn dnVar, hs hsVar) {
        this.f2422 = dnVar;
        this.f2421 = hsVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final ds m6625(String str) {
        ds dsVar;
        hs hsVar = this;
        do {
            dsVar = hsVar.f2422.m6307().get(str);
            if (dsVar != null) {
                break;
            }
            hsVar = hsVar.f2421;
        } while (hsVar != null);
        return dsVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final hs m6624() {
        return this.f2421;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static Method m6618(Class cls, hr hrVar) {
        ArrayList arrayList = new ArrayList();
        m6621(cls, hrVar, arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return (Method) arrayList.get(0);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final List<String> m6628() {
        ArrayList arrayList = new ArrayList(this.f2422.m6310());
        hs hsVar = this.f2421;
        if (hsVar != null) {
            arrayList.addAll(hsVar.m6628());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final List<Cdo> m6623() {
        ArrayList arrayList = new ArrayList(this.f2422.m6305());
        hs hsVar = this.f2421;
        if (hsVar != null) {
            arrayList.addAll(hsVar.m6623());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final dl m6627(String str) {
        dl dlVar;
        hs hsVar = this;
        do {
            dlVar = hsVar.f2422.m6304().get(str);
            if (dlVar != null) {
                break;
            }
            hsVar = hsVar.f2421;
        } while (hsVar != null);
        return dlVar;
    }
}
