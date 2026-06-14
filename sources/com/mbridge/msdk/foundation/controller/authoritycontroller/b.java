package com.mbridge.msdk.foundation.controller.authoritycontroller;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.OnCompletionListener;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public abstract class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f48281h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static boolean f48282i = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected AuthorityInfoBean f48284b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private e f48289g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<String> f48283a = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f48285c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f48286d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f48287e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f48288f = "";

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f48290a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ OnCompletionListener f48291b;

        a(Context context, OnCompletionListener onCompletionListener) {
            this.f48290a = context;
            this.f48291b = onCompletionListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.f48290a);
            this.f48291b.onCompletion();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.controller.authoritycontroller.b$b, reason: collision with other inner class name */
    class C0509b implements e.a {
        C0509b() {
        }

        @Override // com.mbridge.msdk.foundation.controller.e.a
        public void a() {
            b.this.k();
        }
    }

    protected b() {
        h();
    }

    public static void b(boolean z10) {
        f48282i = z10;
    }

    public static boolean i() {
        return f48281h;
    }

    public static boolean j() {
        return f48282i;
    }

    /* JADX INFO: Access modifiers changed from: private */
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
    public void k() {
        boolean zC = this.f48289g.c();
        b(this.f48289g.b());
        d(zC ? 1 : 2);
        this.f48284b.authDeviceIdStatus(zC ? 1 : 0);
    }

    protected abstract int a(g gVar, String str);

    public int c() {
        return this.f48286d;
    }

    public int d() {
        return this.f48287e;
    }

    public int e() {
        return this.f48285c;
    }

    public String f() {
        return this.f48288f;
    }

    public String g() {
        JSONArray jSONArray = new JSONArray();
        g gVarC = h.b().c();
        for (int i10 = 0; i10 < this.f48283a.size(); i10++) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("keyname", String.valueOf(this.f48283a.get(i10)));
                jSONObject.put("client_status", a(this.f48283a.get(i10)));
                jSONObject.put("server_status", a(gVarC, this.f48283a.get(i10)));
                jSONArray.put(jSONObject);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        return jSONArray.toString();
    }

    protected void h() {
        AuthorityInfoBean authorityInfoBean = new AuthorityInfoBean();
        this.f48284b = authorityInfoBean;
        try {
            authorityInfoBean.authGenDataStatus(1);
            this.f48284b.authDeviceIdStatus(1);
            this.f48284b.authSerialIdStatus(1);
            this.f48284b.authOtherDataStatus(1);
            this.f48283a.add(MBridgeConstans.AUTHORITY_GENERAL_DATA);
            this.f48283a.add(MBridgeConstans.AUTHORITY_DEVICE_ID);
            this.f48283a.add(MBridgeConstans.AUTHORITY_SERIAL_ID);
            this.f48283a.add(MBridgeConstans.AUTHORITY_OTHER);
        } catch (Exception e10) {
            q0.b("SDKAuthorityController", e10.getMessage());
        }
    }

    private void d(int i10) {
        this.f48285c = i10 != 1 ? 2 : 1;
    }

    public boolean b() {
        int i10 = this.f48285c;
        return i10 == 1 || i10 == 3;
    }

    public void c(int i10) {
        this.f48287e = i10;
    }

    public static void a(boolean z10) {
        f48281h = z10;
    }

    public void b(int i10) {
        this.f48286d = i10;
    }

    private void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f48288f = str;
    }

    public AuthorityInfoBean a() {
        AuthorityInfoBean authorityInfoBean = this.f48284b;
        if (authorityInfoBean != null) {
            return authorityInfoBean;
        }
        AuthorityInfoBean authorityInfoBean2 = new AuthorityInfoBean();
        authorityInfoBean2.a(1);
        return authorityInfoBean2;
    }

    public void a(int i10) {
        this.f48285c = i10 != 1 ? 2 : 1;
        if (this.f48284b != null) {
            d(i10);
        }
    }

    public void a(Context context, OnCompletionListener onCompletionListener) {
        if (onCompletionListener != null) {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new a(context, onCompletionListener));
        } else {
            a(context);
        }
    }

    protected int a(String str) {
        AuthorityInfoBean authorityInfoBean;
        try {
            if (TextUtils.isEmpty(str) || (authorityInfoBean = this.f48284b) == null) {
                return 0;
            }
            return authorityInfoBean.getStatusByKey(str);
        } catch (Exception e10) {
            q0.b("SDKAuthorityController", e10.getMessage());
            return 0;
        }
    }

    public void a(String str, int i10) {
        if (TextUtils.isEmpty(str) || this.f48284b == null) {
            return;
        }
        str.getClass();
        switch (str) {
            case "authority_serial_id":
                this.f48284b.authSerialIdStatus(i10);
                break;
            case "authority_all_info":
                this.f48284b.a(i10);
                break;
            case "authority_device_id":
                this.f48284b.authDeviceIdStatus(i10);
                break;
            case "authority_general_data":
                this.f48284b.authGenDataStatus(i10);
                break;
            case "authority_other":
                this.f48284b.authOtherDataStatus(i10);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        try {
            if (this.f48289g == null) {
                e eVar = new e(context);
                this.f48289g = eVar;
                eVar.a(new C0509b());
            }
            k();
        } catch (Throwable th2) {
            q0.b("SDKAuthorityController", th2.getMessage());
        }
    }
}
