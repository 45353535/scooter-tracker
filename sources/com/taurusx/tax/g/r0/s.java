package com.taurusx.tax.g.r0;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.taurusx.tax.g.c0;
import com.taurusx.tax.g.r;
import com.taurusx.tax.g.r0.o;
import com.taurusx.tax.log.LogUtil;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes11.dex */
public class s {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final o f66322n = new z();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final InterfaceC0805s f66323t = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f66324a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f66325c;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f66326o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f66327s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public o f66328w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public InterfaceC0805s f66329y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public EnumSet<com.taurusx.tax.g.r0.y> f66330z;

    public static class c {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public String f66332o;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public EnumSet<com.taurusx.tax.g.r0.y> f66335z = EnumSet.of(com.taurusx.tax.g.r0.y.NOOP);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public o f66333w = s.f66322n;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public InterfaceC0805s f66334y = s.f66323t;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f66331c = false;

        public c w() {
            this.f66331c = true;
            return this;
        }

        public c z(com.taurusx.tax.g.r0.y yVar, com.taurusx.tax.g.r0.y... yVarArr) {
            this.f66335z = EnumSet.of(yVar, yVarArr);
            return this;
        }

        public c z(EnumSet<com.taurusx.tax.g.r0.y> enumSet) {
            this.f66335z = EnumSet.copyOf((EnumSet) enumSet);
            return this;
        }

        public c z(o oVar) {
            this.f66333w = oVar;
            return this;
        }

        public c z(InterfaceC0805s interfaceC0805s) {
            this.f66334y = interfaceC0805s;
            return this;
        }

        public c z(String str) {
            this.f66332o = str;
            return this;
        }

        public s z() {
            return new s(this.f66335z, this.f66333w, this.f66334y, this.f66331c, this.f66332o, null);
        }
    }

    public interface o {
        void w(String str, com.taurusx.tax.g.r0.y yVar);

        void z(String str, com.taurusx.tax.g.r0.y yVar);
    }

    /* JADX INFO: renamed from: com.taurusx.tax.g.r0.s$s, reason: collision with other inner class name */
    public interface InterfaceC0805s {
        void w();

        void y();

        void z();
    }

    public class w implements InterfaceC0805s {
        @Override // com.taurusx.tax.g.r0.s.InterfaceC0805s
        public void w() {
        }

        @Override // com.taurusx.tax.g.r0.s.InterfaceC0805s
        public void y() {
        }

        @Override // com.taurusx.tax.g.r0.s.InterfaceC0805s
        public void z() {
        }
    }

    public class z implements o {
        @Override // com.taurusx.tax.g.r0.s.o
        public void w(String str, com.taurusx.tax.g.r0.y yVar) {
        }

        @Override // com.taurusx.tax.g.r0.s.o
        public void z(String str, com.taurusx.tax.g.r0.y yVar) {
        }
    }

    public /* synthetic */ s(EnumSet enumSet, o oVar, InterfaceC0805s interfaceC0805s, boolean z10, String str, z zVar) {
        this(enumSet, oVar, interfaceC0805s, z10, str);
    }

    public EnumSet<com.taurusx.tax.g.r0.y> c() {
        return EnumSet.copyOf((EnumSet) this.f66330z);
    }

    public InterfaceC0805s o() {
        return this.f66329y;
    }

    public boolean s() {
        return this.f66326o;
    }

    public o y() {
        return this.f66328w;
    }

    public class y implements o.z {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f66336c;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ boolean f66338w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Iterable f66339y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Context f66340z;

        public y(Context context, boolean z10, Iterable iterable, String str) {
            this.f66340z = context;
            this.f66338w = z10;
            this.f66339y = iterable;
            this.f66336c = str;
        }

        @Override // com.taurusx.tax.g.r0.o.z
        public void z(String str) {
            s.this.f66324a = false;
            s.this.z(this.f66340z, str, this.f66338w, this.f66339y);
        }

        @Override // com.taurusx.tax.g.r0.o.z
        public void z(String str, Throwable th2) {
            s.this.f66324a = false;
            s.this.z(this.f66336c, (com.taurusx.tax.g.r0.y) null, str, th2);
        }
    }

    public s(EnumSet<com.taurusx.tax.g.r0.y> enumSet, o oVar, InterfaceC0805s interfaceC0805s, boolean z10, String str) {
        this.f66330z = EnumSet.copyOf((EnumSet) enumSet);
        this.f66328w = oVar;
        this.f66329y = interfaceC0805s;
        this.f66326o = z10;
        this.f66325c = str;
        this.f66327s = false;
        this.f66324a = false;
    }

    public void w(Context context, String str, boolean z10, Iterable<String> iterable) {
        r.z(context);
        if (TextUtils.isEmpty(str)) {
            z(str, (com.taurusx.tax.g.r0.y) null, "Attempted to handle empty url.", (Throwable) null);
        } else {
            com.taurusx.tax.g.r0.o.z(str, new y(context, z10, iterable, str));
            this.f66324a = true;
        }
    }

    public void z(Context context, String str) {
        r.z(context);
        z(context, str, true);
    }

    public void z(Context context, String str, boolean z10) {
        r.z(context);
        w(context, str, z10, null);
    }

    public boolean z(Context context, String str, boolean z10, Iterable<String> iterable) {
        Context context2;
        boolean z11;
        if (TextUtils.isEmpty(str)) {
            z(str, (com.taurusx.tax.g.r0.y) null, "Attempted to handle empty url.", (Throwable) null);
            return false;
        }
        com.taurusx.tax.g.r0.y yVar = com.taurusx.tax.g.r0.y.NOOP;
        Uri uri = Uri.parse(str);
        for (com.taurusx.tax.g.r0.y yVar2 : this.f66330z) {
            if (yVar2.shouldTryHandlingUrl(uri)) {
                try {
                    context2 = context;
                    z11 = z10;
                    try {
                        yVar2.handleUrl(this, context2, uri, z11, this.f66325c);
                        if (!this.f66327s && !this.f66324a && !com.taurusx.tax.g.r0.y.IGNORE_ABOUT_SCHEME.equals(yVar2) && !com.taurusx.tax.g.r0.y.HANDLE_TAX_SCHEME.equals(yVar2)) {
                            this.f66328w.z(uri.toString(), yVar2);
                            this.f66327s = true;
                        }
                        return true;
                    } catch (c0 e10) {
                        e = e10;
                        LogUtil.d("taurusx", e.getMessage());
                        yVar = yVar2;
                        context = context2;
                        z10 = z11;
                    }
                } catch (c0 e11) {
                    e = e11;
                    context2 = context;
                    z11 = z10;
                }
            } else {
                context2 = context;
                z11 = z10;
            }
            context = context2;
            z10 = z11;
        }
        z(str, yVar, "Link ignored. Unable to handle url: " + str, (Throwable) null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(String str, com.taurusx.tax.g.r0.y yVar, String str2, Throwable th2) {
        r.z(str2);
        if (yVar == null) {
            yVar = com.taurusx.tax.g.r0.y.NOOP;
        }
        this.f66328w.w(str, yVar);
    }
}
