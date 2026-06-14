package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.i.ho;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class hq {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private a f2403;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private List<Field> f2404;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private ho f2405;

    class a {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private int f2407;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private ho f2408;

        private a() {
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final void m6592(ho hoVar) {
            this.f2408 = hoVar;
            this.f2407 = hoVar.m6562();
        }

        /* synthetic */ a(hq hqVar) {
            this();
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final ho m6591() {
            return this.f2408;
        }

        /* JADX INFO: renamed from: ｋ */
        public boolean mo6590(Field field) {
            boolean zIsAssignableFrom;
            if (this.f2408 == null || (field.getModifiers() & this.f2408.m6578()) != this.f2408.m6578() || (field.getModifiers() & this.f2408.m6579()) != 0 || this.f2408.m6564().contains(field.getType())) {
                return false;
            }
            if (this.f2408.m6561()) {
                zIsAssignableFrom = field.getType().equals(this.f2408.m6563());
            } else {
                zIsAssignableFrom = this.f2408.m6563().isAssignableFrom(field.getType());
            }
            if (zIsAssignableFrom) {
                int i10 = this.f2407;
                if (i10 == 0) {
                    return true;
                }
                this.f2407 = i10 - 1;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Field[] m6581(Class cls, ho hoVar) {
        if (hoVar != null && hoVar.m6577()) {
            return m6583(cls, hoVar.m6577(), hoVar.m6580(), null);
        }
        try {
            return cls.getDeclaredFields();
        } catch (Error unused) {
            return cls.getFields();
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final Field m6586(Class cls, final String str) {
        a aVar = new a(this) { // from class: com.ironsource.adqualitysdk.sdk.i.hq.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.hq.a
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final boolean mo6590(Field field) {
                return field.getType().getName().toLowerCase().startsWith(str.toLowerCase());
            }
        };
        synchronized (hq.class) {
            try {
                if (this.f2404 == null) {
                    this.f2404 = new ArrayList();
                }
                this.f2404.clear();
                m6585(cls, aVar, this.f2404);
                if (this.f2404.isEmpty()) {
                    return null;
                }
                return this.f2404.get(0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final Field m6587(Class cls, ho hoVar) {
        synchronized (jx.class) {
            try {
                if (this.f2404 == null) {
                    this.f2404 = new ArrayList();
                }
                this.f2404.clear();
                m6582(cls, hoVar, this.f2404);
                if (this.f2404.isEmpty()) {
                    return null;
                }
                return this.f2404.get(0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final <T> Field m6588(Class cls, Class<T> cls2) {
        Field fieldM6587;
        synchronized (jx.class) {
            try {
                if (this.f2405 == null) {
                    this.f2405 = new ho();
                }
                this.f2405.m6565(cls2);
                fieldM6587 = m6587(cls, this.f2405);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fieldM6587;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final List<Field> m6589(Class cls, ho hoVar) {
        ArrayList arrayList = new ArrayList();
        m6582(cls, hoVar, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static ho.a m6584() {
        return new ho.a();
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m6585(Class cls, a aVar, List<Field> list) {
        for (Field field : m6581(cls, aVar.m6591())) {
            if (aVar.mo6590(field)) {
                field.setAccessible(true);
                list.add(field);
            }
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static Field[] m6583(Class cls, boolean z10, int i10, List<String> list) {
        while (cls != null && !kb.m7133(cls, list)) {
            cls = cls.getSuperclass();
        }
        Field[] fieldArrM7135 = new Field[0];
        if (cls != null) {
            Field[] declaredFields = new Field[0];
            Field[] fields = new Field[0];
            try {
                declaredFields = cls.getDeclaredFields();
            } catch (Error unused) {
            }
            try {
                fields = cls.getFields();
            } catch (Error unused2) {
            }
            fieldArrM7135 = kb.m7135(declaredFields, fields);
            if (!z10) {
                return fieldArrM7135;
            }
            Class superclass = cls.getSuperclass();
            for (int i11 = 0; superclass != null && i11 != i10; i11++) {
                try {
                    fieldArrM7135 = kb.m7135(fieldArrM7135, superclass.getDeclaredFields());
                } catch (Error unused3) {
                }
                try {
                    fieldArrM7135 = kb.m7135(fieldArrM7135, superclass.getFields());
                } catch (Error unused4) {
                }
                superclass = superclass.getSuperclass();
            }
        }
        return fieldArrM7135;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m6582(Class cls, ho hoVar, List<Field> list) {
        synchronized (hq.class) {
            try {
                if (this.f2403 == null) {
                    this.f2403 = new a(this);
                }
                this.f2403.m6592(hoVar);
                m6585(cls, this.f2403, list);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
