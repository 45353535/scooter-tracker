package com.bytedance.sdk.openadsdk.core.mml;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.mml.mo;
import com.bytedance.sdk.openadsdk.core.model.oth;
import com.bytedance.sdk.openadsdk.utils.ax;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class mzz {
    private final mo.qdl jpc;
    private final mo.ud mo;
    private oth qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private mo f17306ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f17307wd;
    private List<qdl> lnr = new ArrayList();
    private final String mml = "BannerSwiperManager";
    private int mzz = -1;

    public mzz(oth othVar, Context context, int i10, int i11) {
        mo.ud udVar = new mo.ud() { // from class: com.bytedance.sdk.openadsdk.core.mml.mzz.1
            @Override // com.bytedance.sdk.openadsdk.core.mml.mo.ud
            public void qdl(boolean z10) {
                try {
                    if (z10) {
                        mzz.this.mml();
                    } else {
                        mzz.this.lnr();
                    }
                } catch (Throwable unused) {
                }
            }
        };
        this.mo = udVar;
        View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.mml.mzz.2
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                mzz.this.mzz();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                if (mzz.this.lnr != null && !mzz.this.lnr.isEmpty()) {
                    for (int i12 = 0; i12 < mzz.this.lnr.size(); i12++) {
                        ((qdl) mzz.this.lnr.get(i12)).mo();
                    }
                }
                mzz.this.mzz = -1;
                if (mzz.this.f17306ud != null) {
                    mzz.this.f17306ud.mml();
                }
            }
        };
        this.f17307wd = onAttachStateChangeListener;
        mo.qdl qdlVar = new mo.qdl() { // from class: com.bytedance.sdk.openadsdk.core.mml.mzz.3
            @Override // com.bytedance.sdk.openadsdk.core.mml.mo.qdl
            public void qdl(boolean z10) {
                if (z10) {
                    mzz.this.mml();
                } else {
                    mzz.this.lnr();
                }
            }
        };
        this.jpc = qdlVar;
        this.qdl = othVar;
        mo moVar = new mo(context);
        this.f17306ud = moVar;
        moVar.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f17306ud.setSwiperWindowFocusChangedListener(udVar);
        this.f17306ud.setSwiperVisibleChangeListener(qdlVar);
        qdl(context, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lnr() {
        mo moVar;
        oth othVar = this.qdl;
        if (othVar != null && othVar.ud() == 1 && (moVar = this.f17306ud) != null) {
            moVar.mo();
        }
        if (this.mzz >= 0) {
            ud(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mml() {
        mo moVar;
        oth othVar = this.qdl;
        if (othVar != null && othVar.ud() == 1 && (moVar = this.f17306ud) != null) {
            moVar.mzz();
        }
        int i10 = this.mzz;
        if (i10 >= 0) {
            qdl(i10);
            ud(this.mzz);
        }
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
    public void mzz() {
        if (this.qdl == null) {
            this.qdl = new oth();
        }
        this.f17306ud.qdl(TextUtils.equals(this.qdl.qdl(), "vertical") ? 1 : 0).qdl("dot").lnr(false).mml(this.qdl.mml() == 1).qdl(this.qdl.ud() == 1).lnr(this.qdl.tvp()).mzz(this.qdl.to() == 1).mml(this.qdl.jpc()).ud(this.qdl.lnr() == 1).jpc(this.qdl.mzz()).tvp(this.qdl.mo()).wd(this.qdl.wd());
        this.f17306ud.setOnPageChangeListener(new com.bytedance.adsdk.ugeno.mo.lnr() { // from class: com.bytedance.sdk.openadsdk.core.mml.mzz.4
            @Override // com.bytedance.adsdk.ugeno.mo.lnr
            public void qdl(boolean z10, int i10, float f10, int i11) {
            }

            @Override // com.bytedance.adsdk.ugeno.mo.lnr
            public void qdl(boolean z10, int i10, int i11, boolean z11, boolean z12) {
                mzz.this.lnr(i10);
                mzz.this.mzz = i10;
                mzz.this.qdl(i10);
                mzz.this.ud(i10);
            }

            @Override // com.bytedance.adsdk.ugeno.mo.lnr
            public void qdl(boolean z10, int i10) {
                if (i10 == 1 || i10 == 2) {
                    mzz.this.ud(-1);
                } else if (i10 == 0) {
                    mzz mzzVar = mzz.this;
                    mzzVar.qdl(mzzVar.mzz);
                }
            }
        });
        ud(this.lnr);
        this.f17306ud.lnr();
    }

    protected void qdl(Context context, float f10, float f11) {
        int iUd = ax.ud(context, f10);
        int iUd2 = ax.ud(context, f11);
        ViewGroup.LayoutParams layoutParams = this.f17306ud.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(iUd, iUd2);
        }
        layoutParams.width = iUd;
        layoutParams.height = iUd2;
        this.f17306ud.setLayoutParams(layoutParams);
    }

    public void ud(int i10) {
        qdl qdlVar;
        for (int i11 = 0; i11 < this.lnr.size(); i11++) {
            try {
                if (i11 != i10 && (qdlVar = this.lnr.get(i11)) != null) {
                    qdlVar.tvp();
                }
            } catch (Throwable th2) {
                th2.getMessage();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lnr(int i10) {
        qdl qdlVar;
        try {
            int i11 = this.mzz;
            if (i11 != -1 && i11 != i10 && (qdlVar = this.lnr.get(i11)) != null) {
                qdlVar.mml();
                qdlVar.jpc();
            }
            qdl qdlVar2 = this.lnr.get(i10);
            if (qdlVar2 != null) {
                qdlVar2.mzz();
            }
        } catch (Throwable unused) {
        }
    }

    private void ud(List<qdl> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f17306ud.qdl(list.get(i10).qdl());
        }
    }

    public void qdl(List<qdl> list) {
        this.lnr = list;
    }

    public View ud() {
        return this.f17306ud;
    }

    public void qdl(final int i10) {
        qdl qdlVar;
        try {
            final int size = this.lnr.size();
            if (i10 < size && (qdlVar = this.lnr.get(i10)) != null) {
                qdlVar.qdl(new com.bytedance.sdk.openadsdk.qdl.qdl.ud() { // from class: com.bytedance.sdk.openadsdk.core.mml.mzz.5
                    @Override // com.bytedance.sdk.openadsdk.qdl.qdl.ud
                    public void qdl() {
                        int i11 = i10 + 1;
                        if (i11 >= size) {
                            return;
                        }
                        mzz.this.qdl(i11);
                    }
                });
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    public void qdl() {
        if (this.f17306ud != null) {
            try {
                List<qdl> list = this.lnr;
                if (list != null && !list.isEmpty()) {
                    for (int i10 = 0; i10 < this.lnr.size(); i10++) {
                        this.lnr.get(i10).wd();
                    }
                }
                this.mzz = -1;
                this.f17306ud.mml();
                this.f17306ud.setSwiperWindowFocusChangedListener(null);
                this.f17306ud.setSwiperVisibleChangeListener(null);
                this.f17306ud.removeOnAttachStateChangeListener(this.f17307wd);
                this.f17306ud = null;
            } catch (Throwable unused) {
            }
        }
    }
}
