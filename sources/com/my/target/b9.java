package com.my.target;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.my.target.a9;
import com.my.target.m6;
import com.my.target.z0;

/* JADX INFO: loaded from: classes11.dex */
public class b9 extends FrameLayout implements a9, z0.a, m6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m6 f59291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayoutManager f59292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j2 f59293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a9.a f59294d;

    public b9(Context context) {
        super(context);
        m6 m6Var = new m6(context);
        this.f59291a = m6Var;
        z0 z0Var = new z0(context);
        z0Var.a(this);
        m6Var.setLayoutManager(z0Var);
        this.f59292b = z0Var;
        j2 j2Var = new j2(17);
        this.f59293c = j2Var;
        j2Var.attachToRecyclerView(m6Var);
        m6Var.setHasFixedSize(true);
        m6Var.setMoveStopListener(this);
        addView(m6Var, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.my.target.a9
    public boolean a(int i10) {
        return i10 >= this.f59292b.findFirstCompletelyVisibleItemPosition() && i10 <= this.f59292b.findLastCompletelyVisibleItemPosition();
    }

    @Override // com.my.target.a9
    public void b(int i10) {
        this.f59293c.b(i10);
    }

    public final void c() {
        int[] iArr;
        if (this.f59294d != null) {
            int iFindFirstVisibleItemPosition = this.f59292b.findFirstVisibleItemPosition();
            int iFindLastVisibleItemPosition = this.f59292b.findLastVisibleItemPosition();
            if (iFindFirstVisibleItemPosition < 0 || iFindLastVisibleItemPosition < 0) {
                return;
            }
            if (a(this.f59292b.findViewByPosition(iFindFirstVisibleItemPosition))) {
                iFindFirstVisibleItemPosition++;
            }
            if (a(this.f59292b.findViewByPosition(iFindLastVisibleItemPosition))) {
                iFindLastVisibleItemPosition--;
            }
            if (iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
                return;
            }
            if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                iArr = new int[]{iFindFirstVisibleItemPosition};
            } else {
                int i10 = (iFindLastVisibleItemPosition - iFindFirstVisibleItemPosition) + 1;
                int[] iArr2 = new int[i10];
                for (int i11 = 0; i11 < i10; i11++) {
                    iArr2[i11] = iFindFirstVisibleItemPosition;
                    iFindFirstVisibleItemPosition++;
                }
                iArr = iArr2;
            }
            this.f59294d.a(iArr);
        }
    }

    public void setAdapter(@NonNull t0 t0Var) {
        this.f59291a.setAdapter(t0Var);
    }

    @Override // com.my.target.a9
    public void setListener(@NonNull a9.a aVar) {
        this.f59294d = aVar;
    }

    @Override // com.my.target.m6.a
    public void b() {
        c();
    }

    @Override // com.my.target.z0.a
    public void a() {
        int iFindFirstCompletelyVisibleItemPosition = this.f59292b.findFirstCompletelyVisibleItemPosition();
        View viewFindViewByPosition = iFindFirstCompletelyVisibleItemPosition >= 0 ? this.f59292b.findViewByPosition(iFindFirstCompletelyVisibleItemPosition) : null;
        if (this.f59291a.getChildCount() != 0 && viewFindViewByPosition != null && getWidth() <= ((double) viewFindViewByPosition.getWidth()) * 1.7d) {
            this.f59293c.a(17);
        } else {
            this.f59293c.a(GravityCompat.START);
        }
        c();
    }

    public final boolean a(View view) {
        return bc.a(view) < 50.0f;
    }
}
