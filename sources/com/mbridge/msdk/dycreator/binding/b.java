package com.mbridge.msdk.dycreator.binding;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.mbridge.msdk.dycreator.baseview.MBApkInfoView;
import com.mbridge.msdk.dycreator.baseview.MBFeedBack;
import com.mbridge.msdk.dycreator.baseview.MBLogoTextView;
import com.mbridge.msdk.dycreator.baseview.MBSplashClickView;
import com.mbridge.msdk.dycreator.baseview.MBSplashImageBgView;
import com.mbridge.msdk.dycreator.baseview.MBSplashPortView;
import com.mbridge.msdk.dycreator.baseview.MBSplashShakeView;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.binding.response.SplashResData;
import com.mbridge.msdk.dycreator.bridge.MBSplashData;
import com.mbridge.msdk.dycreator.bus.EventBus;
import com.mbridge.msdk.dycreator.listener.DyCountDownListenerWrapper;
import com.mbridge.msdk.dycreator.listener.action.EAction;
import com.mbridge.msdk.dycreator.subjectfactory.a;
import com.mbridge.msdk.dycreator.viewmodel.BaseViewModel;
import com.mbridge.msdk.dycreator.viewobserver.h;
import com.mbridge.msdk.dycreator.viewobserver.i;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.q0;
import com.startapp.simple.bloomfilter.codec.IOUtils;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile b f47993g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.dycreator.viewobserver.d f47994a = (com.mbridge.msdk.dycreator.viewobserver.d) com.mbridge.msdk.dycreator.subjectfactory.a.a().a(a.b.VIEW_OBSERVER);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.dycreator.viewobserver.c f47995b = (com.mbridge.msdk.dycreator.viewobserver.c) com.mbridge.msdk.dycreator.subjectfactory.a.a().a(a.b.CLICK_OBSERVER);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.dycreator.viewobserver.f f47996c = (com.mbridge.msdk.dycreator.viewobserver.f) com.mbridge.msdk.dycreator.subjectfactory.a.a().a(a.b.EFFECT_OBSERVER);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private h f47997d = (h) com.mbridge.msdk.dycreator.subjectfactory.a.a().a(a.b.REPORT_OBSERVER);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private BaseViewModel f47998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.shake.b f47999f;

    class a implements com.mbridge.msdk.dycreator.viewobserver.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f48000a;

        a(View view) {
            this.f48000a = view;
        }

        @Override // com.mbridge.msdk.dycreator.viewobserver.g
        public void a(Object obj) {
            try {
                KeyEvent.Callback callback = this.f48000a;
                if (callback instanceof InterBase) {
                    b.this.b((InterBase) callback, obj);
                }
            } catch (Exception e10) {
                q0.b("MBDataBinding", e10.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.binding.b$b, reason: collision with other inner class name */
    class C0504b implements com.mbridge.msdk.dycreator.viewobserver.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f48002a;

        C0504b(View view) {
            this.f48002a = view;
        }

        @Override // com.mbridge.msdk.dycreator.viewobserver.e
        public void a(Object obj) {
            try {
                KeyEvent.Callback callback = this.f48002a;
                if (callback instanceof InterBase) {
                    b.this.a((InterBase) callback, obj);
                }
            } catch (Exception e10) {
                q0.b("MBDataBinding", e10.getMessage());
            }
        }
    }

    class c implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f48004a;

        c(View view) {
            this.f48004a = view;
        }

        @Override // com.mbridge.msdk.dycreator.viewobserver.i
        public void a(Object obj) {
            try {
                KeyEvent.Callback callback = this.f48004a;
                if (callback instanceof InterBase) {
                    b.this.c((InterBase) callback, obj);
                }
            } catch (Exception e10) {
                q0.b("MBDataBinding", e10.getMessage());
            }
        }
    }

    class d implements com.mbridge.msdk.dycreator.viewobserver.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f48006a;

        d(View view) {
            this.f48006a = view;
        }

        @Override // com.mbridge.msdk.dycreator.viewobserver.b
        public void a(Object obj) {
            if (obj == null) {
                return;
            }
            try {
                if (com.mbridge.msdk.dycreator.utils.d.a(this.f48006a, (com.mbridge.msdk.dycreator.viewdata.base.a) obj)) {
                    b.this.a(this.f48006a, obj);
                }
            } catch (Exception e10) {
                q0.b("MBDataBinding", e10.getMessage());
            }
        }
    }

    class e implements DyCountDownListenerWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f48008a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f48009b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f48010c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f48011d;

        e(boolean z10, String str, String str2, View view) {
            this.f48008a = z10;
            this.f48009b = str;
            this.f48010c = str2;
            this.f48011d = view;
        }

        @Override // com.mbridge.msdk.dycreator.listener.DyCountDownListenerWrapper
        public void getCountDownValue(int i10) {
            if (i10 != 0) {
                ((TextView) this.f48011d).setText(com.mbridge.msdk.dycreator.utils.d.a(this.f48008a, i10, this.f48009b, this.f48010c));
            } else {
                SplashResData splashResData = new SplashResData();
                splashResData.seteAction(EAction.CLOSE);
                EventBus.getDefault().post(splashResData);
            }
        }
    }

    class f implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.dycreator.viewdata.base.a f48013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f48014b;

        f(com.mbridge.msdk.dycreator.viewdata.base.a aVar, View view) {
            this.f48013a = aVar;
            this.f48014b = view;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            View view = this.f48014b;
            if (view != null) {
                ((ImageView) view).setBackgroundColor(-7829368);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (bitmap != null) {
                try {
                    if (!bitmap.isRecycled()) {
                        boolean z10 = bitmap.getWidth() > bitmap.getHeight();
                        if ((this.f48013a.getEffectData().getOrientation() == 1 ? this.f48014b.getResources().getConfiguration().orientation : this.f48013a.getEffectData().getOrientation()) == 1) {
                            if (z10) {
                                View view = this.f48014b;
                                if (view instanceof MBSplashPortView) {
                                    if (view.getParent() != null) {
                                        ((ViewGroup) this.f48014b.getParent()).setVisibility(8);
                                        return;
                                    }
                                    return;
                                } else if (view instanceof MBSplashImageBgView) {
                                    view.setVisibility(0);
                                    Bitmap bitmapA = p0.a(bitmap);
                                    ((MBSplashImageBgView) this.f48014b).setScaleType(ImageView.ScaleType.CENTER_CROP);
                                    ((MBSplashImageBgView) this.f48014b).setImageBitmap(bitmapA);
                                    return;
                                }
                            } else {
                                View view2 = this.f48014b;
                                if (view2 instanceof MBSplashPortView) {
                                    view2.setVisibility(0);
                                    ((MBSplashPortView) this.f48014b).setScaleType(ImageView.ScaleType.FIT_CENTER);
                                    ((MBSplashPortView) this.f48014b).setImageBitmap(bitmap);
                                    return;
                                } else if (view2 instanceof MBSplashImageBgView) {
                                    view2.setVisibility(8);
                                    return;
                                } else if (view2 instanceof InterBase) {
                                    String effectDes = ((InterBase) view2).getEffectDes();
                                    ViewGroup viewGroup = (ViewGroup) this.f48014b.getParent();
                                    if (viewGroup != null) {
                                        com.mbridge.msdk.dycreator.utils.d.a(effectDes, viewGroup, true);
                                    }
                                }
                            }
                        } else if (z10) {
                            View view3 = this.f48014b;
                            if (view3 instanceof MBSplashPortView) {
                                view3.setVisibility(0);
                                ((MBSplashPortView) this.f48014b).setScaleType(ImageView.ScaleType.FIT_XY);
                                ((ImageView) this.f48014b).setImageBitmap(bitmap);
                                return;
                            } else if (view3 instanceof MBSplashImageBgView) {
                                view3.setVisibility(8);
                                ((MBSplashImageBgView) this.f48014b).setImageBitmap(p0.a(bitmap));
                                return;
                            } else if (view3 instanceof InterBase) {
                                String effectDes2 = ((InterBase) view3).getEffectDes();
                                ViewGroup viewGroup2 = (ViewGroup) this.f48014b.getParent();
                                if (viewGroup2 != null) {
                                    com.mbridge.msdk.dycreator.utils.d.a(effectDes2, viewGroup2, true);
                                }
                            }
                        } else {
                            View view4 = this.f48014b;
                            if (view4 instanceof MBSplashPortView) {
                                view4.setVisibility(0);
                                ((MBSplashPortView) this.f48014b).setImageBitmap(bitmap);
                                return;
                            } else {
                                if (view4 instanceof MBSplashImageBgView) {
                                    view4.setVisibility(0);
                                    Bitmap bitmapA2 = p0.a(bitmap);
                                    ((MBSplashImageBgView) this.f48014b).setScaleType(ImageView.ScaleType.CENTER_CROP);
                                    ((MBSplashImageBgView) this.f48014b).setImageBitmap(bitmapA2);
                                    return;
                                }
                                if (view4 instanceof InterBase) {
                                    String effectDes3 = ((InterBase) view4).getEffectDes();
                                    ViewGroup viewGroup3 = (ViewGroup) this.f48014b.getParent();
                                    if (viewGroup3 != null) {
                                        com.mbridge.msdk.dycreator.utils.d.a(effectDes3, viewGroup3, true);
                                    }
                                }
                            }
                        }
                        ((ImageView) this.f48014b).setImageBitmap(bitmap);
                        return;
                    }
                } catch (Exception e10) {
                    q0.b("MBDataBinding", e10.getMessage());
                    return;
                }
            }
            ((ImageView) this.f48014b).setBackgroundColor(-7829368);
        }
    }

    class g extends com.mbridge.msdk.shake.b {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ View f48016g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ MBSplashData f48017h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i10, int i11, View view, MBSplashData mBSplashData) {
            super(i10, i11);
            this.f48016g = view;
            this.f48017h = mBSplashData;
        }

        @Override // com.mbridge.msdk.shake.b
        public void a() {
            View view = this.f48016g;
            if (view != null) {
                try {
                    if (view.getGlobalVisibleRect(new Rect())) {
                        SplashResData splashResData = new SplashResData();
                        this.f48017h.setClickType(4);
                        splashResData.setBaseViewData(this.f48017h);
                        splashResData.seteAction(EAction.DOWNLOAD);
                        EventBus.getDefault().post(splashResData);
                        com.mbridge.msdk.shake.a.a().b(b.this.f47999f);
                    }
                } catch (Exception e10) {
                    q0.b("MBDataBinding", e10.getMessage());
                }
            }
        }
    }

    private b() {
    }

    public void d(View view) {
        a(new a(view), view.getId());
    }

    public void b(View view) {
        a(new c(view), view.getId());
    }

    public void c(View view) {
        a(new C0504b(view), view.getId());
    }

    public static b a() {
        if (f47993g == null) {
            synchronized (b.class) {
                try {
                    if (f47993g == null) {
                        f47993g = new b();
                    }
                } finally {
                }
            }
        }
        return f47993g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(InterBase interBase, Object obj) {
        if (interBase == null || obj == null) {
            return;
        }
        String reportDes = interBase.getReportDes();
        if (TextUtils.isEmpty(reportDes)) {
            return;
        }
        try {
            if (!(obj instanceof com.mbridge.msdk.dycreator.viewdata.base.a) || ((com.mbridge.msdk.dycreator.viewdata.base.a) obj).getBindData() == null) {
                return;
            }
            interBase.setDynamicReport(reportDes, ((com.mbridge.msdk.dycreator.viewdata.base.a) obj).getBindData());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void c(InterBase interBase, Object obj) {
        if (interBase == 0 || obj == null) {
            return;
        }
        String bindDataDes = interBase.getBindDataDes();
        if (TextUtils.isEmpty(bindDataDes)) {
            return;
        }
        try {
            Object objA = com.mbridge.msdk.dycreator.utils.d.a(obj, bindDataDes);
            if (objA == null) {
                return;
            }
            if (interBase instanceof ViewGroup) {
                b((ViewGroup) interBase, objA, (com.mbridge.msdk.dycreator.viewdata.base.a) obj);
            } else if (interBase instanceof View) {
                a((View) interBase, objA, (com.mbridge.msdk.dycreator.viewdata.base.a) obj);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void a(i iVar, int i10) {
        com.mbridge.msdk.dycreator.viewobserver.d dVar = this.f47994a;
        if (dVar != null) {
            dVar.a(iVar, i10);
        }
    }

    private void b(ViewGroup viewGroup, Object obj, com.mbridge.msdk.dycreator.viewdata.base.a aVar) {
        if (viewGroup != null) {
            if (viewGroup instanceof MBSplashClickView) {
                if (aVar == null || aVar.getEffectData() == null || !aVar.getEffectData().isClickButtonVisible() || aVar.getEffectData().isShakeVisible()) {
                    viewGroup.setVisibility(8);
                } else if (obj != null && !TextUtils.isEmpty(obj.toString())) {
                    viewGroup.setVisibility(0);
                    ((MBSplashClickView) viewGroup).initView(obj.toString());
                }
            }
            if (viewGroup instanceof MBSplashShakeView) {
                if (aVar != null && aVar.getEffectData() != null && aVar.getEffectData().isShakeVisible()) {
                    if (obj == null || TextUtils.isEmpty(obj.toString())) {
                        return;
                    }
                    viewGroup.setVisibility(0);
                    ((MBSplashShakeView) viewGroup).initView(obj.toString());
                    return;
                }
                viewGroup.setVisibility(8);
            }
        }
    }

    private void a(com.mbridge.msdk.dycreator.viewobserver.b bVar, int i10) {
        com.mbridge.msdk.dycreator.viewobserver.c cVar = this.f47995b;
        if (cVar != null) {
            cVar.a(bVar, i10);
        }
    }

    private void a(com.mbridge.msdk.dycreator.viewobserver.e eVar, int i10) {
        com.mbridge.msdk.dycreator.viewobserver.f fVar = this.f47996c;
        if (fVar != null) {
            fVar.a(eVar, i10);
        }
    }

    private void a(com.mbridge.msdk.dycreator.viewobserver.g gVar, int i10) {
        h hVar = this.f47997d;
        if (hVar != null) {
            hVar.a(gVar, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(View view) {
        if (view != 0) {
            try {
                if (view instanceof InterBase) {
                    String actionDes = ((InterBase) view).getActionDes();
                    if (TextUtils.isEmpty(actionDes)) {
                        return;
                    }
                    if (actionDes.startsWith("click")) {
                        a(new d(view), view.getId());
                        return;
                    }
                    if (!actionDes.equals("move") && !actionDes.equals("long_click")) {
                        actionDes.equals("wobble");
                    }
                }
            } catch (Exception e10) {
                q0.b("MBDataBinding", e10.getMessage());
            }
        }
    }

    public synchronized void b() {
        try {
            com.mbridge.msdk.dycreator.viewobserver.c cVar = this.f47995b;
            if (cVar != null) {
                cVar.a();
            }
            com.mbridge.msdk.dycreator.viewobserver.d dVar = this.f47994a;
            if (dVar != null) {
                dVar.a();
            }
            com.mbridge.msdk.dycreator.viewobserver.f fVar = this.f47996c;
            if (fVar != null) {
                fVar.a();
            }
            if (this.f47998e != null) {
                this.f47998e = null;
            }
            if (this.f47999f != null) {
                this.f47999f = null;
            }
            if (f47993g != null) {
                f47993g = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void a(InterBase interBase, Object obj) {
        if (interBase == 0 || obj == null) {
            return;
        }
        String effectDes = interBase.getEffectDes();
        if (TextUtils.isEmpty(effectDes)) {
            return;
        }
        try {
            if (interBase instanceof ViewGroup) {
                a((ViewGroup) interBase, (Object) effectDes, (com.mbridge.msdk.dycreator.viewdata.base.a) obj);
            } else if (interBase instanceof View) {
                a((View) interBase, effectDes, obj);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void a(ViewGroup viewGroup, Object obj, com.mbridge.msdk.dycreator.viewdata.base.a aVar) {
        if (obj == null || !(obj instanceof String)) {
            return;
        }
        if (obj.equals("wobble") && (viewGroup instanceof MBSplashShakeView)) {
            if (aVar.getEffectData().isShakeVisible()) {
                if (this.f47999f != null) {
                    com.mbridge.msdk.shake.a.a().b(this.f47999f);
                }
                com.mbridge.msdk.shake.a.a().a(a((View) viewGroup, (MBSplashData) aVar));
            } else if (this.f47999f != null) {
                com.mbridge.msdk.shake.a.a().b(this.f47999f);
            }
        }
        if (obj.equals("visible") && (viewGroup instanceof MBApkInfoView)) {
            if (aVar.getEffectData().isApkInfoVisible()) {
                if ((aVar instanceof MBSplashData) && !TextUtils.isEmpty(((MBSplashData) aVar).getAppInfo())) {
                    viewGroup.setVisibility(0);
                } else {
                    viewGroup.setVisibility(4);
                }
            } else {
                viewGroup.setVisibility(8);
            }
        }
        obj.equals("anim");
    }

    private void a(View view, Object obj, Object obj2) {
        View view2;
        int countDownTime;
        boolean z10;
        if (obj == null || !(obj instanceof String)) {
            return;
        }
        com.mbridge.msdk.dycreator.viewdata.base.a aVar = (com.mbridge.msdk.dycreator.viewdata.base.a) obj2;
        if (!obj.equals("countdown") || view == null || !(view instanceof TextView) || aVar == null) {
            view2 = view;
        } else {
            TextView textView = (TextView) view;
            String str = (String) textView.getText();
            String strP = m0.p(view.getContext());
            DyOption effectData = aVar.getEffectData();
            if (effectData != null) {
                boolean zIsCanSkip = effectData.isCanSkip();
                countDownTime = effectData.getCountDownTime();
                z10 = zIsCanSkip;
            } else {
                countDownTime = 5;
                z10 = false;
            }
            textView.setText(com.mbridge.msdk.dycreator.utils.d.a(z10, countDownTime, str, strP));
            view2 = view;
            aVar.getEffectData().setDyCountDownListenerWrapper(new e(z10, str, strP, view2));
        }
        obj.equals("anim");
        if (obj.equals("visible")) {
            if (view2 instanceof MBFeedBack) {
                if (com.mbridge.msdk.foundation.feedback.b.b().a()) {
                    view2.setVisibility(0);
                } else {
                    view2.setVisibility(8);
                }
            }
            if (!(view2 instanceof MBLogoTextView) || aVar == null || aVar.getEffectData() == null || aVar.getEffectData().isLogoVisible()) {
                return;
            }
            ((MBLogoTextView) view2).setCompoundDrawables(null, null, null, null);
        }
    }

    private void a(View view, Object obj, com.mbridge.msdk.dycreator.viewdata.base.a aVar) {
        if (view == null || obj == null) {
            return;
        }
        try {
            if (view instanceof TextView) {
                try {
                    ((TextView) view).setText(String.valueOf(obj).replace("\\n", IOUtils.LINE_SEPARATOR_UNIX));
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            }
            if (view instanceof ImageView) {
                if (obj instanceof Integer) {
                    ((ImageView) view).setImageResource(((Integer) obj).intValue());
                }
                if (obj instanceof String) {
                    com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(obj.toString(), new f(aVar, view));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, Object obj) {
        if (view == null || obj == null || !(obj instanceof com.mbridge.msdk.dycreator.viewdata.base.a)) {
            return;
        }
        view.setOnClickListener(new com.mbridge.msdk.dycreator.binding.a((com.mbridge.msdk.dycreator.viewdata.base.a) obj));
    }

    public void a(BaseViewModel baseViewModel) {
        this.f47998e = baseViewModel;
        if (baseViewModel != null) {
            baseViewModel.setClickSubject(this.f47995b);
            this.f47998e.setConcreteSubject(this.f47994a);
            this.f47998e.setEffectSubject(this.f47996c);
            this.f47998e.setReportSubject(this.f47997d);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.mbridge.msdk.shake.b a(android.view.View r9, com.mbridge.msdk.dycreator.bridge.MBSplashData r10) {
        /*
            r8 = this;
            if (r10 == 0) goto L2d
            com.mbridge.msdk.dycreator.wrapper.DyOption r0 = r10.getDyOption()     // Catch: java.lang.Exception -> L2a
            if (r0 == 0) goto L2d
            boolean r1 = r0.isShakeVisible()     // Catch: java.lang.Exception -> L2a
            if (r1 == 0) goto L2d
            com.mbridge.msdk.shake.b r1 = r8.f47999f     // Catch: java.lang.Exception -> L2a
            if (r1 != 0) goto L2d
            com.mbridge.msdk.dycreator.binding.b$g r2 = new com.mbridge.msdk.dycreator.binding.b$g     // Catch: java.lang.Exception -> L2a
            int r4 = r0.getShakeStrenght()     // Catch: java.lang.Exception -> L2a
            int r0 = r0.getShakeTime()     // Catch: java.lang.Exception -> L2a
            int r5 = r0 * 1000
            r3 = r8
            r6 = r9
            r7 = r10
            r2.<init>(r4, r5, r6, r7)     // Catch: java.lang.Exception -> L27
            r3.f47999f = r2     // Catch: java.lang.Exception -> L27
            goto L38
        L27:
            r0 = move-exception
        L28:
            r9 = r0
            goto L2f
        L2a:
            r0 = move-exception
            r3 = r8
            goto L28
        L2d:
            r3 = r8
            goto L38
        L2f:
            java.lang.String r9 = r9.getMessage()
            java.lang.String r10 = "MBDataBinding"
            com.mbridge.msdk.foundation.tools.q0.b(r10, r9)
        L38:
            com.mbridge.msdk.shake.b r9 = r3.f47999f
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.dycreator.binding.b.a(android.view.View, com.mbridge.msdk.dycreator.bridge.MBSplashData):com.mbridge.msdk.shake.b");
    }
}
