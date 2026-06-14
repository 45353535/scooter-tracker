package com.mbridge.msdk.foundation.feedback;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.feedback.bean.a;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.widget.FeedBackButton;
import com.mbridge.msdk.widget.dialog.MBFeedBackDialog;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f48547d = -2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f48548e = -2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile boolean f48549f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RelativeLayout.LayoutParams f48550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<String, com.mbridge.msdk.foundation.feedback.bean.a> f48551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g f48552c;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.feedback.b$b, reason: collision with other inner class name */
    static class C0513b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final b f48553a = new b();
    }

    public static b b() {
        return C0513b.f48553a;
    }

    private com.mbridge.msdk.foundation.feedback.bean.a c(String str) {
        if (TextUtils.isEmpty(str)) {
            str = c.n().b();
        }
        if (this.f48551b.containsKey(str)) {
            return this.f48551b.get(str);
        }
        return null;
    }

    public void a(String str, Context context, ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams, com.mbridge.msdk.foundation.feedback.a aVar) {
        if (a()) {
            com.mbridge.msdk.foundation.feedback.bean.a aVarB = b(str);
            if (aVar != null) {
                aVarB.a(new a.g(str, aVar));
            }
            FeedBackButton feedBackButtonI = aVarB.i();
            if (feedBackButtonI != null) {
                if (layoutParams == null) {
                    int iA = v0.a(c.n().d(), 10.0f);
                    this.f48550a.setMargins(iA, iA, iA, iA);
                    layoutParams = this.f48550a;
                }
                ViewGroup viewGroup2 = (ViewGroup) feedBackButtonI.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(feedBackButtonI);
                }
                Activity activityA = a(context);
                if (activityA != null && viewGroup == null) {
                    viewGroup = (ViewGroup) activityA.findViewById(R.id.content);
                }
                if (viewGroup != null) {
                    viewGroup.removeView(feedBackButtonI);
                    viewGroup.addView(feedBackButtonI, layoutParams);
                }
            }
        }
    }

    public void d(String str) {
        try {
            com.mbridge.msdk.foundation.feedback.bean.a aVarC = c(str);
            if (aVarC != null) {
                aVarC.f();
            }
            this.f48551b.remove(str);
            f48549f = false;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private b() {
        this.f48550a = new RelativeLayout.LayoutParams(f48548e, f48547d);
        this.f48551b = new ConcurrentHashMap<>();
    }

    public com.mbridge.msdk.foundation.feedback.bean.a b(String str) {
        com.mbridge.msdk.foundation.feedback.bean.a aVar;
        if (TextUtils.isEmpty(str)) {
            str = c.n().b();
        }
        if (this.f48551b.containsKey(str)) {
            aVar = this.f48551b.get(str);
        } else {
            aVar = new com.mbridge.msdk.foundation.feedback.bean.a(str);
            this.f48551b.put(str, aVar);
        }
        if (aVar != null) {
            return aVar;
        }
        com.mbridge.msdk.foundation.feedback.bean.a aVar2 = new com.mbridge.msdk.foundation.feedback.bean.a(str);
        this.f48551b.put(str, aVar2);
        return aVar2;
    }

    public void b(String str, int i10) {
        b(str).c(i10);
    }

    public boolean a() {
        g gVarD = h.b().d(c.n().b());
        this.f48552c = gVarD;
        if (gVarD != null) {
            return false;
        }
        this.f48552c = h.b().a();
        return false;
    }

    public Activity a(Context context) {
        Activity activity;
        Context contextF = c.n().f();
        Activity activity2 = null;
        try {
            Activity activity3 = contextF instanceof Activity ? (Activity) contextF : null;
            try {
                if ((context instanceof Activity) && !((Activity) context).isDestroyed()) {
                    activity3 = (Activity) context;
                }
                WeakReference<Activity> weakReferenceA = c.n().a();
                if (weakReferenceA != null && (activity = weakReferenceA.get()) != null && !activity.isFinishing() && !activity.isDestroyed()) {
                    activity3 = activity;
                }
                if (activity3 != null && !activity3.isFinishing()) {
                    if (!activity3.isDestroyed()) {
                        return activity3;
                    }
                }
                return null;
            } catch (Exception e10) {
                e = e10;
                activity2 = activity3;
                e.printStackTrace();
                return activity2;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public void a(String str, int i10, ViewGroup viewGroup) {
        com.mbridge.msdk.foundation.feedback.bean.a aVarB = b(str);
        if (aVarB.i() != null) {
            aVarB.d(i10);
            if (i10 == 0) {
                a(str, c.n().d(), viewGroup, (ViewGroup.LayoutParams) null, (com.mbridge.msdk.foundation.feedback.a) null);
            }
        }
    }

    public void a(String str, int i10, int i11, int i12, float f10, float f11, float f12, String str2, String str3, float f13, JSONArray jSONArray) {
        com.mbridge.msdk.foundation.feedback.bean.a aVarB = b(str);
        Context contextD = c.n().d();
        aVarB.a(v0.a(contextD, f10), v0.a(contextD, f11), v0.a(contextD, i10), v0.a(contextD, i11), v0.a(contextD, i12), f12, str2, str3, f13, jSONArray);
    }

    public void a(String str, int i10, com.mbridge.msdk.foundation.feedback.a aVar) {
        com.mbridge.msdk.foundation.feedback.bean.a aVarB = b(str);
        aVarB.a(new a.g(str, aVar));
        if (i10 == 1) {
            aVarB.g();
        } else {
            aVarB.p();
        }
    }

    public FeedBackButton a(String str) {
        return b(str).i();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006c A[PHI: r0
  0x006c: PHI (r0v8 com.mbridge.msdk.foundation.feedback.bean.a) = 
  (r0v7 com.mbridge.msdk.foundation.feedback.bean.a)
  (r0v11 com.mbridge.msdk.foundation.feedback.bean.a)
  (r0v14 com.mbridge.msdk.foundation.feedback.bean.a)
 binds: [B:5:0x0033, B:7:0x004c, B:9:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.lang.String r13, int r14, int r15, java.lang.String r16, java.lang.String r17) {
        /*
            r12 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r13)
            java.lang.String r1 = "_"
            r0.append(r1)
            r2 = 1
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.mbridge.msdk.foundation.feedback.bean.a r0 = r12.c(r0)
            r2 = 0
            if (r0 != 0) goto L6f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r13)
            r0.append(r1)
            r3 = 2
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.mbridge.msdk.foundation.feedback.bean.a r0 = r12.c(r0)
            if (r0 != 0) goto L6c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r13)
            r0.append(r1)
            r3 = 3
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.mbridge.msdk.foundation.feedback.bean.a r0 = r12.c(r0)
            if (r0 != 0) goto L6c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r13)
            r0.append(r1)
            r1 = 4
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.mbridge.msdk.foundation.feedback.bean.a r0 = r12.c(r0)
            if (r0 != 0) goto L6c
            com.mbridge.msdk.foundation.feedback.bean.a r0 = r12.b(r13)
            goto L6f
        L6c:
            r0.c(r2)
        L6f:
            if (r0 == 0) goto La0
            com.mbridge.msdk.foundation.entity.CampaignEx r3 = r0.h()
            java.lang.String r13 = ""
            if (r3 == 0) goto L7f
            java.lang.String r1 = r3.getCampaignUnitId()
            r4 = r1
            goto L80
        L7f:
            r4 = r13
        L80:
            int r5 = r0.k()
            int r6 = r0.j()
            boolean r0 = android.text.TextUtils.isEmpty(r16)
            if (r0 != 0) goto L91
            r7 = r16
            goto L92
        L91:
            r7 = r13
        L92:
            if (r3 == 0) goto L98
            int r2 = r3.getAdType()
        L98:
            r8 = r14
            r10 = r15
            r11 = r17
            r9 = r2
            com.mbridge.msdk.foundation.same.report.j.a(r3, r4, r5, r6, r7, r8, r9, r10, r11)
        La0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.feedback.b.a(java.lang.String, int, int, java.lang.String, java.lang.String):void");
    }

    public void a(String str, CampaignEx campaignEx) {
        b(str).a(campaignEx);
    }

    public void a(String str, String str2) {
        b(str).b(str2);
    }

    public void a(String str, FeedBackButton feedBackButton) {
        b(str).a(feedBackButton);
    }

    public void a(String str, com.mbridge.msdk.foundation.feedback.a aVar) {
        com.mbridge.msdk.foundation.feedback.bean.a aVarB = b(str);
        if (aVar != null) {
            aVarB.a(new a.g(str, aVar));
        }
    }

    public void a(String str, int i10) {
        b(str).b(i10);
    }

    public boolean a(String str, Context context, MBFeedBackDialog mBFeedBackDialog) {
        if (mBFeedBackDialog == null) {
            q0.c("", "mbAlertDialog  is null");
            return false;
        }
        return a(context, mBFeedBackDialog);
    }

    private boolean a(Context context, MBFeedBackDialog mBFeedBackDialog) {
        Activity activityA = a(context);
        if (activityA == null || mBFeedBackDialog == null || activityA.isDestroyed()) {
            return false;
        }
        try {
            if (!mBFeedBackDialog.isShowing() && !activityA.isFinishing()) {
                mBFeedBackDialog.show();
                return true;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return false;
    }
}
