package com.my.target;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.my.target.a3;
import com.my.target.common.menu.MenuFactory;
import com.my.target.d;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes11.dex */
public final class e7 extends d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f59591g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f59592h;

    public class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            int paddingLeft;
            int paddingTop;
            int paddingTop2;
            int paddingRight;
            int paddingBottom;
            int paddingBottom2;
            WeakReference weakReference = e7.this.f59448f;
            i iVar = weakReference != null ? (i) weakReference.get() : null;
            if (iVar == null) {
                return;
            }
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int measuredWidth2 = iVar.getMeasuredWidth();
            int measuredHeight2 = iVar.getMeasuredHeight();
            int i18 = e7.this.f59591g;
            if (i18 != 1) {
                if (i18 == 2) {
                    int paddingLeft2 = (measuredWidth - measuredWidth2) - view.getPaddingLeft();
                    paddingBottom = (measuredHeight - view.getPaddingBottom()) - measuredHeight2;
                    paddingRight = measuredWidth - view.getPaddingRight();
                    paddingBottom2 = measuredHeight - view.getPaddingBottom();
                    paddingLeft = paddingLeft2;
                } else if (i18 == 3) {
                    int paddingLeft3 = view.getPaddingLeft();
                    paddingBottom = (measuredHeight - view.getPaddingBottom()) - measuredHeight2;
                    int paddingLeft4 = measuredWidth2 + view.getPaddingLeft();
                    paddingBottom2 = measuredHeight - view.getPaddingBottom();
                    paddingLeft = paddingLeft3;
                    paddingRight = paddingLeft4;
                } else {
                    if (i18 == 4 || i18 == 5) {
                        return;
                    }
                    paddingLeft = (measuredWidth - measuredWidth2) - view.getPaddingLeft();
                    paddingTop2 = view.getPaddingTop();
                    paddingRight = measuredWidth - view.getPaddingRight();
                    paddingTop = measuredHeight2 + view.getPaddingTop();
                }
                paddingTop2 = paddingBottom;
                paddingTop = paddingBottom2;
            } else {
                paddingLeft = view.getPaddingLeft();
                int paddingTop3 = view.getPaddingTop();
                int paddingLeft5 = measuredWidth2 + view.getPaddingLeft();
                paddingTop = measuredHeight2 + view.getPaddingTop();
                paddingTop2 = paddingTop3;
                paddingRight = paddingLeft5;
            }
            iVar.layout(paddingLeft, paddingTop2, paddingRight, paddingTop);
        }
    }

    public e7(c cVar, MenuFactory menuFactory, a3.b bVar) {
        super(cVar, menuFactory, bVar);
        if (cVar == null) {
            return;
        }
        this.f59592h = new a();
    }

    public static e7 b(c cVar, MenuFactory menuFactory, a3.b bVar) {
        return new e7(cVar, menuFactory, bVar);
    }

    public void a(ViewGroup viewGroup, g8 g8Var, d.a aVar, int i10) {
        View viewB = g8Var.b();
        this.f59591g = i10;
        if (i10 == 5) {
            f fVar = this.f59444b;
            if (fVar != null) {
                fVar.a(aVar);
            }
            gb.a("NativeAdChoicesController: No need to add AdChoicesView, adChoicesPlacement is DRAWING_MANUAL");
            return;
        }
        if (viewB != null && !(viewB instanceof i)) {
            gb.a("NativeAdChoicesController: Warning! You must use AdChoicesView class for placement " + i10);
            return;
        }
        i iVar = (i) viewB;
        if (this.f59443a == null) {
            if (iVar != null) {
                a(iVar);
                return;
            }
            return;
        }
        if (iVar == null) {
            Context context = viewGroup.getContext();
            i iVar2 = new i(context);
            kb.b(iVar2, "ad_choices");
            int iA = kb.a(2, context);
            iVar2.setPadding(iA, iA, iA, iA);
            g8Var.a(iVar2);
            iVar = iVar2;
        }
        if (iVar.getParent() == null) {
            try {
                viewGroup.addView(iVar);
            } catch (Throwable th2) {
                gb.a("NativeAdChoicesController: Unable to add AdChoices View - " + th2.getMessage());
            }
        }
        if (i10 != 4) {
            viewGroup.addOnLayoutChangeListener(this.f59592h);
        }
        super.a(iVar, aVar);
    }

    public void b(View view) {
        super.a();
        a aVar = this.f59592h;
        if (aVar == null) {
            return;
        }
        view.removeOnLayoutChangeListener(aVar);
    }
}
