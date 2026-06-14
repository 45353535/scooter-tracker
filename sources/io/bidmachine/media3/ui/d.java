package io.bidmachine.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import io.bidmachine.media3.ui.d;
import io.bidmachine.media3.ui.h0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import n9.a0;
import n9.e0;
import n9.i0;
import n9.n0;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public class d extends FrameLayout {
    private static final float[] B0;
    private final View A;
    private boolean A0;
    private final View B;
    private final View C;
    private final TextView D;
    private final TextView E;
    private final h0 F;
    private final StringBuilder G;
    private final Formatter H;
    private final e0.b I;
    private final e0.c J;
    private final Runnable K;
    private final Drawable L;
    private final Drawable M;
    private final Drawable N;
    private final Drawable O;
    private final Drawable P;
    private final String Q;
    private final String R;
    private final String S;
    private final Drawable T;
    private final Drawable U;
    private final float V;
    private final float W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final String f81633a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w f81634b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final String f81635b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Resources f81636c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final Drawable f81637c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f81638d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final Drawable f81639d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CopyOnWriteArrayList f81640e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final String f81641e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final RecyclerView f81642f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final String f81643f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final h f81644g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private final Drawable f81645g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e f81646h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final Drawable f81647h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final j f81648i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private final String f81649i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final b f81650j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private final String f81651j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final yb.l f81652k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private n9.a0 f81653k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final PopupWindow f81654l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private InterfaceC0984d f81655l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f81656m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private boolean f81657m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ImageView f81658n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private boolean f81659n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ImageView f81660o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private boolean f81661o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ImageView f81662p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f81663p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final View f81664q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private boolean f81665q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final View f81666r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private boolean f81667r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final TextView f81668s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f81669s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final TextView f81670t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private int f81671t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final ImageView f81672u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private int f81673u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final ImageView f81674v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private long[] f81675v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final ImageView f81676w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private boolean[] f81677w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final ImageView f81678x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private long[] f81679x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final ImageView f81680y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private boolean[] f81681y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final ImageView f81682z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private long f81683z0;

    /* JADX INFO: Access modifiers changed from: private */
    final class b extends l {
        private b() {
            super();
        }

        public static /* synthetic */ void e(b bVar, View view) {
            if (d.this.f81653k0 == null || !d.this.f81653k0.isCommandAvailable(29)) {
                return;
            }
            ((n9.a0) o0.i(d.this.f81653k0)).e(d.this.f81653k0.getTrackSelectionParameters().a().G(1).P(1, false).F());
            d.this.f81644g.setSubTextAtPosition(1, d.this.getResources().getString(R$string.f81516w));
            d.this.f81654l.dismiss();
        }

        private boolean f(n9.h0 h0Var) {
            for (int i10 = 0; i10 < this.f81704i.size(); i10++) {
                if (h0Var.D.containsKey(((k) this.f81704i.get(i10)).f81701a.a())) {
                    return true;
                }
            }
            return false;
        }

        @Override // io.bidmachine.media3.ui.d.l
        public void c(i iVar) {
            iVar.f81698m.setText(R$string.f81516w);
            iVar.f81699n.setVisibility(f(((n9.a0) q9.a.e(d.this.f81653k0)).getTrackSelectionParameters()) ? 4 : 0);
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: io.bidmachine.media3.ui.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.b.e(this.f81732b, view);
                }
            });
        }

        public void init(List list) {
            this.f81704i = list;
            n9.h0 trackSelectionParameters = ((n9.a0) q9.a.e(d.this.f81653k0)).getTrackSelectionParameters();
            if (list.isEmpty()) {
                d.this.f81644g.setSubTextAtPosition(1, d.this.getResources().getString(R$string.f81517x));
                return;
            }
            if (!f(trackSelectionParameters)) {
                d.this.f81644g.setSubTextAtPosition(1, d.this.getResources().getString(R$string.f81516w));
                return;
            }
            for (int i10 = 0; i10 < list.size(); i10++) {
                k kVar = (k) list.get(i10);
                if (kVar.a()) {
                    d.this.f81644g.setSubTextAtPosition(1, kVar.f81703c);
                    return;
                }
            }
        }

        @Override // io.bidmachine.media3.ui.d.l
        public void onTrackSelection(String str) {
            d.this.f81644g.setSubTextAtPosition(1, str);
        }
    }

    private final class c implements a0.d, h0.a, View.OnClickListener, PopupWindow.OnDismissListener {
        private c() {
        }

        @Override // n9.a0.d
        public /* synthetic */ void A(n9.k kVar) {
            n9.b0.e(this, kVar);
        }

        @Override // n9.a0.d
        public void D(n9.a0 a0Var, a0.c cVar) {
            if (cVar.a(4, 5, 13)) {
                d.this.u0();
            }
            if (cVar.a(4, 5, 7, 13)) {
                d.this.w0();
            }
            if (cVar.a(8, 13)) {
                d.this.x0();
            }
            if (cVar.a(9, 13)) {
                d.this.B0();
            }
            if (cVar.a(8, 9, 11, 0, 16, 17, 13)) {
                d.this.t0();
            }
            if (cVar.a(11, 0, 13)) {
                d.this.C0();
            }
            if (cVar.a(12, 13)) {
                d.this.v0();
            }
            if (cVar.a(2, 13)) {
                d.this.D0();
            }
        }

        @Override // n9.a0.d
        public /* synthetic */ void F(n9.y yVar) {
            n9.b0.s(this, yVar);
        }

        @Override // n9.a0.d
        public /* synthetic */ void M(n9.h0 h0Var) {
            n9.b0.C(this, h0Var);
        }

        @Override // n9.a0.d
        public /* synthetic */ void a(n0 n0Var) {
            n9.b0.E(this, n0Var);
        }

        @Override // n9.a0.d
        public /* synthetic */ void f(n9.v vVar) {
            n9.b0.m(this, vVar);
        }

        @Override // n9.a0.d
        public /* synthetic */ void h(p9.b bVar) {
            n9.b0.d(this, bVar);
        }

        @Override // n9.a0.d
        public /* synthetic */ void j(n9.z zVar) {
            n9.b0.o(this, zVar);
        }

        @Override // n9.a0.d
        public /* synthetic */ void m(n9.t tVar) {
            n9.b0.l(this, tVar);
        }

        @Override // n9.a0.d
        public /* synthetic */ void n(a0.b bVar) {
            n9.b0.b(this, bVar);
        }

        @Override // n9.a0.d
        public /* synthetic */ void onAudioSessionIdChanged(int i10) {
            n9.b0.a(this, i10);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            n9.a0 a0Var = d.this.f81653k0;
            if (a0Var == null) {
                return;
            }
            d.this.f81634b.S();
            if (d.this.f81660o == view) {
                if (a0Var.isCommandAvailable(9)) {
                    a0Var.seekToNext();
                    return;
                }
                return;
            }
            if (d.this.f81658n == view) {
                if (a0Var.isCommandAvailable(7)) {
                    a0Var.seekToPrevious();
                    return;
                }
                return;
            }
            if (d.this.f81664q == view) {
                if (a0Var.getPlaybackState() == 4 || !a0Var.isCommandAvailable(12)) {
                    return;
                }
                a0Var.seekForward();
                return;
            }
            if (d.this.f81666r == view) {
                if (a0Var.isCommandAvailable(11)) {
                    a0Var.seekBack();
                    return;
                }
                return;
            }
            if (d.this.f81662p == view) {
                o0.x0(a0Var, d.this.f81663p0);
                return;
            }
            if (d.this.f81672u == view) {
                if (a0Var.isCommandAvailable(15)) {
                    a0Var.setRepeatMode(q9.e0.a(a0Var.getRepeatMode(), d.this.f81673u0));
                    return;
                }
                return;
            }
            if (d.this.f81674v == view) {
                if (a0Var.isCommandAvailable(14)) {
                    a0Var.setShuffleModeEnabled(!a0Var.getShuffleModeEnabled());
                    return;
                }
                return;
            }
            if (d.this.A == view) {
                d.this.f81634b.R();
                d dVar = d.this;
                dVar.V(dVar.f81644g, d.this.A);
                return;
            }
            if (d.this.B == view) {
                d.this.f81634b.R();
                d dVar2 = d.this;
                dVar2.V(dVar2.f81646h, d.this.B);
            } else if (d.this.C == view) {
                d.this.f81634b.R();
                d dVar3 = d.this;
                dVar3.V(dVar3.f81650j, d.this.C);
            } else if (d.this.f81678x == view) {
                d.this.f81634b.R();
                d dVar4 = d.this;
                dVar4.V(dVar4.f81648i, d.this.f81678x);
            }
        }

        @Override // n9.a0.d
        public /* synthetic */ void onCues(List list) {
            n9.b0.c(this, list);
        }

        @Override // n9.a0.d
        public /* synthetic */ void onDeviceVolumeChanged(int i10, boolean z10) {
            n9.b0.f(this, i10, z10);
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (d.this.A0) {
                d.this.f81634b.S();
            }
        }

        @Override // n9.a0.d
        public /* synthetic */ void onIsLoadingChanged(boolean z10) {
            n9.b0.h(this, z10);
        }

        @Override // n9.a0.d
        public /* synthetic */ void onIsPlayingChanged(boolean z10) {
            n9.b0.i(this, z10);
        }

        @Override // n9.a0.d
        public /* synthetic */ void onLoadingChanged(boolean z10) {
            n9.b0.j(this, z10);
        }

        @Override // n9.a0.d
        public /* synthetic */ void onPlayWhenReadyChanged(boolean z10, int i10) {
            n9.b0.n(this, z10, i10);
        }

        @Override // n9.a0.d
        public /* synthetic */ void onPlaybackStateChanged(int i10) {
            n9.b0.p(this, i10);
        }

        @Override // n9.a0.d
        public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
            n9.b0.q(this, i10);
        }

        @Override // n9.a0.d
        public /* synthetic */ void onPlayerStateChanged(boolean z10, int i10) {
            n9.b0.t(this, z10, i10);
        }

        @Override // n9.a0.d
        public /* synthetic */ void onPositionDiscontinuity(int i10) {
            n9.b0.u(this, i10);
        }

        @Override // n9.a0.d
        public /* synthetic */ void onRenderedFirstFrame() {
            n9.b0.w(this);
        }

        @Override // n9.a0.d
        public /* synthetic */ void onRepeatModeChanged(int i10) {
            n9.b0.x(this, i10);
        }

        @Override // n9.a0.d
        public /* synthetic */ void onShuffleModeEnabledChanged(boolean z10) {
            n9.b0.y(this, z10);
        }

        @Override // n9.a0.d
        public /* synthetic */ void onSkipSilenceEnabledChanged(boolean z10) {
            n9.b0.z(this, z10);
        }

        @Override // n9.a0.d
        public /* synthetic */ void onSurfaceSizeChanged(int i10, int i11) {
            n9.b0.A(this, i10, i11);
        }

        @Override // n9.a0.d
        public /* synthetic */ void onVolumeChanged(float f10) {
            n9.b0.F(this, f10);
        }

        @Override // io.bidmachine.media3.ui.h0.a
        public void p(h0 h0Var, long j10) {
            if (d.this.E != null) {
                d.this.E.setText(o0.o0(d.this.G, d.this.H, j10));
            }
        }

        @Override // n9.a0.d
        public /* synthetic */ void r(n9.i0 i0Var) {
            n9.b0.D(this, i0Var);
        }

        @Override // io.bidmachine.media3.ui.h0.a
        public void s(h0 h0Var, long j10) {
            d.this.f81667r0 = true;
            if (d.this.E != null) {
                d.this.E.setText(o0.o0(d.this.G, d.this.H, j10));
            }
            d.this.f81634b.R();
        }

        @Override // n9.a0.d
        public /* synthetic */ void t(n9.r rVar, int i10) {
            n9.b0.k(this, rVar, i10);
        }

        @Override // n9.a0.d
        public /* synthetic */ void u(a0.e eVar, a0.e eVar2, int i10) {
            n9.b0.v(this, eVar, eVar2, i10);
        }

        @Override // io.bidmachine.media3.ui.h0.a
        public void v(h0 h0Var, long j10, boolean z10) {
            d.this.f81667r0 = false;
            if (!z10 && d.this.f81653k0 != null) {
                d dVar = d.this;
                dVar.l0(dVar.f81653k0, j10);
            }
            d.this.f81634b.S();
        }

        @Override // n9.a0.d
        public /* synthetic */ void x(n9.e0 e0Var, int i10) {
            n9.b0.B(this, e0Var, i10);
        }

        @Override // n9.a0.d
        public /* synthetic */ void y(n9.y yVar) {
            n9.b0.r(this, yVar);
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.media3.ui.d$d, reason: collision with other inner class name */
    public interface InterfaceC0984d {
        void onFullScreenModeChanged(boolean z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class e extends RecyclerView.Adapter {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final String[] f81686i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final float[] f81687j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f81688k;

        public e(String[] strArr, float[] fArr) {
            this.f81686i = strArr;
            this.f81687j = fArr;
        }

        public static /* synthetic */ void a(e eVar, int i10, View view) {
            if (i10 != eVar.f81688k) {
                d.this.setPlaybackSpeed(eVar.f81687j[i10]);
            }
            d.this.f81654l.dismiss();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(i iVar, final int i10) {
            String[] strArr = this.f81686i;
            if (i10 < strArr.length) {
                iVar.f81698m.setText(strArr[i10]);
            }
            if (i10 == this.f81688k) {
                iVar.itemView.setSelected(true);
                iVar.f81699n.setVisibility(0);
            } else {
                iVar.itemView.setSelected(false);
                iVar.f81699n.setVisibility(4);
            }
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: io.bidmachine.media3.ui.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.e.a(this.f81733b, i10, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public i onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return new i(LayoutInflater.from(d.this.getContext()).inflate(R$layout.f81491f, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f81686i.length;
        }

        public String getSelectedText() {
            return this.f81686i[this.f81688k];
        }

        public void updateSelectedIndex(float f10) {
            int i10 = 0;
            float f11 = Float.MAX_VALUE;
            int i11 = 0;
            while (true) {
                float[] fArr = this.f81687j;
                if (i10 >= fArr.length) {
                    this.f81688k = i11;
                    return;
                }
                float fAbs = Math.abs(f10 - fArr[i10]);
                if (fAbs < f11) {
                    i11 = i10;
                    f11 = fAbs;
                }
                i10++;
            }
        }
    }

    public interface f {
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class g extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final TextView f81690m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final TextView f81691n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final ImageView f81692o;

        public g(View view) {
            super(view);
            if (o0.f98837a < 26) {
                view.setFocusable(true);
            }
            this.f81690m = (TextView) view.findViewById(R$id.f81479v);
            this.f81691n = (TextView) view.findViewById(R$id.O);
            this.f81692o = (ImageView) view.findViewById(R$id.f81477t);
            view.setOnClickListener(new View.OnClickListener() { // from class: io.bidmachine.media3.ui.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    d.g gVar = this.f81735b;
                    d.this.i0(gVar.getBindingAdapterPosition());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class h extends RecyclerView.Adapter {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final String[] f81694i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final String[] f81695j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final Drawable[] f81696k;

        public h(String[] strArr, Drawable[] drawableArr) {
            this.f81694i = strArr;
            this.f81695j = new String[strArr.length];
            this.f81696k = drawableArr;
        }

        private boolean shouldShowSetting(int i10) {
            if (d.this.f81653k0 == null) {
                return false;
            }
            if (i10 == 0) {
                return d.this.f81653k0.isCommandAvailable(13);
            }
            if (i10 != 1) {
                return true;
            }
            return d.this.f81653k0.isCommandAvailable(30) && d.this.f81653k0.isCommandAvailable(29);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(g gVar, int i10) {
            if (shouldShowSetting(i10)) {
                gVar.itemView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            } else {
                gVar.itemView.setLayoutParams(new RecyclerView.LayoutParams(0, 0));
            }
            gVar.f81690m.setText(this.f81694i[i10]);
            if (this.f81695j[i10] == null) {
                gVar.f81691n.setVisibility(8);
            } else {
                gVar.f81691n.setText(this.f81695j[i10]);
            }
            if (this.f81696k[i10] == null) {
                gVar.f81692o.setVisibility(8);
            } else {
                gVar.f81692o.setImageDrawable(this.f81696k[i10]);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return d.this.new g(LayoutInflater.from(d.this.getContext()).inflate(R$layout.f81490e, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f81694i.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        public boolean hasSettingsToShow() {
            return shouldShowSetting(1) || shouldShowSetting(0);
        }

        public void setSubTextAtPosition(int i10, String str) {
            this.f81695j[i10] = str;
        }
    }

    private static class i extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final TextView f81698m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final View f81699n;

        public i(View view) {
            super(view);
            if (o0.f98837a < 26) {
                view.setFocusable(true);
            }
            this.f81698m = (TextView) view.findViewById(R$id.R);
            this.f81699n = view.findViewById(R$id.f81465h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class j extends l {
        private j() {
            super();
        }

        public static /* synthetic */ void e(j jVar, View view) {
            if (d.this.f81653k0 == null || !d.this.f81653k0.isCommandAvailable(29)) {
                return;
            }
            d.this.f81653k0.e(d.this.f81653k0.getTrackSelectionParameters().a().G(3).K(-3).M(null).O(0).F());
            d.this.f81654l.dismiss();
        }

        @Override // io.bidmachine.media3.ui.d.l, androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(i iVar, int i10) {
            super.onBindViewHolder(iVar, i10);
            if (i10 > 0) {
                iVar.f81699n.setVisibility(((k) this.f81704i.get(i10 + (-1))).a() ? 0 : 4);
            }
        }

        @Override // io.bidmachine.media3.ui.d.l
        public void c(i iVar) {
            boolean z10;
            iVar.f81698m.setText(R$string.f81517x);
            int i10 = 0;
            while (true) {
                if (i10 >= this.f81704i.size()) {
                    z10 = true;
                    break;
                } else {
                    if (((k) this.f81704i.get(i10)).a()) {
                        z10 = false;
                        break;
                    }
                    i10++;
                }
            }
            iVar.f81699n.setVisibility(z10 ? 0 : 4);
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: io.bidmachine.media3.ui.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.j.e(this.f81736b, view);
                }
            });
        }

        public void init(List list) {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= list.size()) {
                    break;
                }
                if (((k) list.get(i10)).a()) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            if (d.this.f81678x != null) {
                ImageView imageView = d.this.f81678x;
                d dVar = d.this;
                imageView.setImageDrawable(z10 ? dVar.f81637c0 : dVar.f81639d0);
                d.this.f81678x.setContentDescription(z10 ? d.this.f81641e0 : d.this.f81643f0);
            }
            this.f81704i = list;
        }

        @Override // io.bidmachine.media3.ui.d.l
        public void onTrackSelection(String str) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i0.a f81701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f81702b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f81703c;

        /* JADX WARN: Multi-variable type inference failed */
        public k(n9.i0 i0Var, int i10, int i11, String str) {
            this.f81701a = (i0.a) i0Var.a().get(i10);
            this.f81702b = i11;
            this.f81703c = str;
        }

        public boolean a() {
            return this.f81701a.g(this.f81702b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    abstract class l extends RecyclerView.Adapter {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        protected List f81704i = new ArrayList();

        protected l() {
        }

        public static /* synthetic */ void a(l lVar, n9.a0 a0Var, n9.f0 f0Var, k kVar, View view) {
            lVar.getClass();
            if (a0Var.isCommandAvailable(29)) {
                a0Var.e(a0Var.getTrackSelectionParameters().a().L(new n9.g0(f0Var, ImmutableList.of(Integer.valueOf(kVar.f81702b)))).P(kVar.f81701a.c(), false).F());
                lVar.onTrackSelection(kVar.f81703c);
                d.this.f81654l.dismiss();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: b */
        public void onBindViewHolder(i iVar, int i10) {
            final n9.a0 a0Var = d.this.f81653k0;
            if (a0Var == null) {
                return;
            }
            if (i10 == 0) {
                c(iVar);
                return;
            }
            final k kVar = (k) this.f81704i.get(i10 - 1);
            final n9.f0 f0VarA = kVar.f81701a.a();
            boolean z10 = a0Var.getTrackSelectionParameters().D.get(f0VarA) != null && kVar.a();
            iVar.f81698m.setText(kVar.f81703c);
            iVar.f81699n.setVisibility(z10 ? 0 : 4);
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: io.bidmachine.media3.ui.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.l.a(this.f81737b, a0Var, f0VarA, kVar, view);
                }
            });
        }

        protected abstract void c(i iVar);

        protected void clear() {
            this.f81704i = Collections.EMPTY_LIST;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public i onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return new i(LayoutInflater.from(d.this.getContext()).inflate(R$layout.f81491f, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            if (this.f81704i.isEmpty()) {
                return 0;
            }
            return this.f81704i.size() + 1;
        }

        protected abstract void onTrackSelection(String str);
    }

    public interface m {
        void onVisibilityChange(int i10);
    }

    static {
        n9.s.a("media3.ui");
        B0 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public d(Context context, AttributeSet attributeSet, int i10, AttributeSet attributeSet2) throws Throwable {
        int i11;
        final d dVar;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i22;
        int i23;
        int i24;
        int i25;
        boolean z16;
        int i26;
        int i27;
        boolean z17;
        Context context2;
        int i28;
        boolean z18;
        boolean z19;
        int i29;
        boolean z20;
        final d dVar2;
        int i30;
        boolean z21;
        int i31;
        boolean z22;
        int resourceId;
        int resourceId2;
        int resourceId3;
        int resourceId4;
        int resourceId5;
        int resourceId6;
        int resourceId7;
        int resourceId8;
        int resourceId9;
        int resourceId10;
        int resourceId11;
        int resourceId12;
        int resourceId13;
        int resourceId14;
        int resourceId15;
        int resourceId16;
        int resourceId17;
        super(context, attributeSet, i10);
        int i32 = R$layout.f81487b;
        int i33 = R$drawable.f81444g;
        int i34 = R$drawable.f81443f;
        int i35 = R$drawable.f81442e;
        int i36 = R$drawable.f81451n;
        int i37 = R$drawable.f81445h;
        int i38 = R$drawable.f81452o;
        int i39 = R$drawable.f81441d;
        int i40 = R$drawable.f81440c;
        int i41 = R$drawable.f81447j;
        int i42 = R$drawable.f81448k;
        int i43 = R$drawable.f81446i;
        int i44 = R$drawable.f81450m;
        int i45 = R$drawable.f81449l;
        int i46 = R$drawable.f81455r;
        int i47 = R$drawable.f81454q;
        int i48 = R$drawable.f81456s;
        this.f81663p0 = true;
        this.f81669s0 = 5000;
        this.f81673u0 = 0;
        this.f81671t0 = 200;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, R$styleable.f81563y, i10, 0);
            try {
                resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.A, i32);
                resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.G, i33);
                resourceId3 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.F, i34);
                resourceId4 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.E, i35);
                resourceId5 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.B, i36);
                resourceId6 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.H, i37);
                resourceId7 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.M, i38);
                resourceId8 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.D, i39);
                resourceId9 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.C, i40);
                resourceId10 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.J, i41);
                resourceId11 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.K, i42);
                resourceId12 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.I, i43);
                resourceId13 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.W, i44);
                resourceId14 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.V, i45);
                resourceId15 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.Y, i46);
                resourceId16 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.X, i47);
                resourceId17 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.f81522a0, i48);
                dVar = this;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                dVar.f81669s0 = typedArrayObtainStyledAttributes.getInt(R$styleable.T, dVar.f81669s0);
                dVar.f81673u0 = X(typedArrayObtainStyledAttributes, dVar.f81673u0);
                boolean z23 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.Q, true);
                boolean z24 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.N, true);
                boolean z25 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.P, true);
                boolean z26 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.O, true);
                boolean z27 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.R, false);
                boolean z28 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.S, false);
                boolean z29 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.U, false);
                dVar.setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(R$styleable.Z, dVar.f81671t0));
                boolean z30 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.f81564z, true);
                typedArrayObtainStyledAttributes.recycle();
                z15 = z30;
                i16 = resourceId11;
                i17 = resourceId12;
                i18 = resourceId13;
                i20 = resourceId14;
                i14 = resourceId15;
                i21 = resourceId16;
                i19 = resourceId4;
                i12 = resourceId17;
                z10 = z23;
                z12 = z27;
                z13 = z28;
                z14 = z29;
                i11 = resourceId2;
                i13 = resourceId;
                i22 = resourceId5;
                i23 = resourceId6;
                i15 = resourceId7;
                i24 = resourceId9;
                i25 = resourceId10;
                z11 = z24;
                z16 = z26;
                i26 = resourceId3;
                i27 = resourceId8;
                z17 = z25;
            } catch (Throwable th3) {
                th = th3;
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i11 = i33;
            dVar = this;
            i12 = i48;
            i13 = i32;
            i14 = i46;
            i15 = i38;
            i16 = i42;
            i17 = i43;
            i18 = i44;
            i19 = i35;
            i20 = i45;
            i21 = i47;
            z10 = true;
            z11 = true;
            z12 = false;
            z13 = false;
            z14 = false;
            z15 = true;
            i22 = i36;
            i23 = i37;
            i24 = i40;
            i25 = i41;
            z16 = true;
            i26 = i34;
            i27 = i39;
            z17 = true;
        }
        LayoutInflater.from(context).inflate(i13, dVar);
        dVar.setDescendantFocusability(262144);
        c cVar = new c();
        dVar.f81638d = cVar;
        dVar.f81640e = new CopyOnWriteArrayList();
        dVar.I = new e0.b();
        dVar.J = new e0.c();
        StringBuilder sb2 = new StringBuilder();
        dVar.G = sb2;
        int i49 = i27;
        int i50 = i24;
        dVar.H = new Formatter(sb2, Locale.getDefault());
        dVar.f81675v0 = new long[0];
        dVar.f81677w0 = new boolean[0];
        dVar.f81679x0 = new long[0];
        dVar.f81681y0 = new boolean[0];
        dVar.K = new Runnable() { // from class: yb.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f118902b.w0();
            }
        };
        dVar.D = (TextView) dVar.findViewById(R$id.f81470m);
        dVar.E = (TextView) dVar.findViewById(R$id.E);
        ImageView imageView = (ImageView) dVar.findViewById(R$id.P);
        dVar.f81678x = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(cVar);
        }
        ImageView imageView2 = (ImageView) dVar.findViewById(R$id.f81476s);
        dVar.f81680y = imageView2;
        b0(imageView2, new View.OnClickListener() { // from class: yb.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f118903b.g0(view);
            }
        });
        ImageView imageView3 = (ImageView) dVar.findViewById(R$id.f81481x);
        dVar.f81682z = imageView3;
        b0(imageView3, new View.OnClickListener() { // from class: yb.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f118903b.g0(view);
            }
        });
        View viewFindViewById = dVar.findViewById(R$id.L);
        dVar.A = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(cVar);
        }
        View viewFindViewById2 = dVar.findViewById(R$id.D);
        dVar.B = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(cVar);
        }
        View viewFindViewById3 = dVar.findViewById(R$id.f81460c);
        dVar.C = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(cVar);
        }
        int i51 = R$id.G;
        h0 h0Var = (h0) dVar.findViewById(i51);
        View viewFindViewById4 = dVar.findViewById(R$id.H);
        if (h0Var != null) {
            dVar.F = h0Var;
            context2 = context;
            i28 = i25;
            z18 = z11;
            z19 = z16;
            i29 = i50;
            z20 = z10;
            dVar2 = dVar;
            i30 = i49;
            z21 = z17;
            i31 = i15;
        } else if (viewFindViewById4 != null) {
            z19 = z16;
            i28 = i25;
            dVar2 = this;
            i29 = i50;
            z20 = z10;
            i30 = i49;
            z21 = z17;
            i31 = i15;
            z18 = z11;
            context2 = context;
            io.bidmachine.media3.ui.b bVar = new io.bidmachine.media3.ui.b(context2, null, 0, attributeSet2, R$style.f81520a);
            bVar.setId(i51);
            bVar.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(bVar, iIndexOfChild);
            dVar2.F = bVar;
        } else {
            context2 = context;
            i28 = i25;
            z18 = z11;
            z19 = z16;
            i29 = i50;
            z20 = z10;
            dVar2 = dVar;
            i30 = i49;
            z21 = z17;
            i31 = i15;
            dVar2.F = null;
        }
        h0 h0Var2 = dVar2.F;
        if (h0Var2 != null) {
            h0Var2.a(cVar);
        }
        Resources resources = context2.getResources();
        dVar2.f81636c = resources;
        ImageView imageView4 = (ImageView) dVar2.findViewById(R$id.C);
        dVar2.f81662p = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(cVar);
        }
        ImageView imageView5 = (ImageView) dVar2.findViewById(R$id.F);
        dVar2.f81658n = imageView5;
        if (imageView5 != null) {
            imageView5.setImageDrawable(o0.a0(context2, resources, i23));
            imageView5.setOnClickListener(cVar);
        }
        ImageView imageView6 = (ImageView) dVar2.findViewById(R$id.f81482y);
        dVar2.f81660o = imageView6;
        if (imageView6 != null) {
            imageView6.setImageDrawable(o0.a0(context2, resources, i19));
            imageView6.setOnClickListener(cVar);
        }
        Typeface font = ResourcesCompat.getFont(context2, R$font.f81457a);
        ImageView imageView7 = (ImageView) dVar2.findViewById(R$id.J);
        TextView textView = (TextView) dVar2.findViewById(R$id.K);
        if (imageView7 != null) {
            imageView7.setImageDrawable(o0.a0(context2, resources, i31));
            dVar2.f81666r = imageView7;
            dVar2.f81670t = null;
        } else if (textView != null) {
            textView.setTypeface(font);
            dVar2.f81670t = textView;
            dVar2.f81666r = textView;
        } else {
            dVar2.f81670t = null;
            dVar2.f81666r = null;
        }
        View view = dVar2.f81666r;
        if (view != null) {
            view.setOnClickListener(dVar2.f81638d);
        }
        ImageView imageView8 = (ImageView) dVar2.findViewById(R$id.f81474q);
        TextView textView2 = (TextView) dVar2.findViewById(R$id.f81475r);
        if (imageView8 != null) {
            imageView8.setImageDrawable(o0.a0(context2, resources, i22));
            dVar2.f81664q = imageView8;
            dVar2.f81668s = null;
        } else if (textView2 != null) {
            textView2.setTypeface(font);
            dVar2.f81668s = textView2;
            dVar2.f81664q = textView2;
        } else {
            dVar2.f81668s = null;
            dVar2.f81664q = null;
        }
        View view2 = dVar2.f81664q;
        if (view2 != null) {
            view2.setOnClickListener(dVar2.f81638d);
        }
        ImageView imageView9 = (ImageView) dVar2.findViewById(R$id.I);
        dVar2.f81672u = imageView9;
        if (imageView9 != null) {
            imageView9.setOnClickListener(dVar2.f81638d);
        }
        ImageView imageView10 = (ImageView) dVar2.findViewById(R$id.M);
        dVar2.f81674v = imageView10;
        if (imageView10 != null) {
            imageView10.setOnClickListener(dVar2.f81638d);
        }
        dVar2.V = resources.getInteger(R$integer.f81485b) / 100.0f;
        dVar2.W = resources.getInteger(R$integer.f81484a) / 100.0f;
        ImageView imageView11 = (ImageView) dVar2.findViewById(R$id.T);
        dVar2.f81676w = imageView11;
        if (imageView11 != null) {
            imageView11.setImageDrawable(o0.a0(context2, resources, i12));
            dVar2.o0(false, imageView11);
        }
        w wVar = new w(dVar2);
        dVar2.f81634b = wVar;
        wVar.T(z15);
        h hVar = dVar2.new h(new String[]{resources.getString(R$string.f81501h), dVar2.f81636c.getString(R$string.f81518y)}, new Drawable[]{o0.a0(context2, resources, R$drawable.f81453p), o0.a0(context2, dVar2.f81636c, R$drawable.f81439b)});
        dVar2.f81644g = hVar;
        dVar2.f81656m = dVar2.f81636c.getDimensionPixelSize(R$dimen.f81434a);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context2).inflate(R$layout.f81489d, (ViewGroup) null);
        dVar2.f81642f = recyclerView;
        recyclerView.setAdapter(hVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(dVar2.getContext()));
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        dVar2.f81654l = popupWindow;
        if (o0.f98837a < 23) {
            z22 = false;
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        } else {
            z22 = false;
        }
        popupWindow.setOnDismissListener(dVar2.f81638d);
        dVar2.A0 = true;
        dVar2.f81652k = new yb.e(dVar2.getResources());
        dVar2.f81637c0 = o0.a0(context2, dVar2.f81636c, i14);
        dVar2.f81639d0 = o0.a0(context2, dVar2.f81636c, i21);
        dVar2.f81641e0 = dVar2.f81636c.getString(R$string.f81495b);
        dVar2.f81643f0 = dVar2.f81636c.getString(R$string.f81494a);
        dVar2.f81648i = new j();
        dVar2.f81650j = new b();
        dVar2.f81646h = dVar2.new e(dVar2.f81636c.getStringArray(R$array.f81432a), B0);
        dVar2.L = o0.a0(context2, dVar2.f81636c, i11);
        dVar2.M = o0.a0(context2, dVar2.f81636c, i26);
        dVar2.f81645g0 = o0.a0(context2, dVar2.f81636c, i30);
        dVar2.f81647h0 = o0.a0(context2, dVar2.f81636c, i29);
        dVar2.N = o0.a0(context2, dVar2.f81636c, i28);
        dVar2.O = o0.a0(context2, dVar2.f81636c, i16);
        dVar2.P = o0.a0(context2, dVar2.f81636c, i17);
        dVar2.T = o0.a0(context2, dVar2.f81636c, i18);
        dVar2.U = o0.a0(context2, dVar2.f81636c, i20);
        dVar2.f81649i0 = dVar2.f81636c.getString(R$string.f81497d);
        dVar2.f81651j0 = dVar2.f81636c.getString(R$string.f81496c);
        dVar2.Q = dVar2.f81636c.getString(R$string.f81503j);
        dVar2.R = dVar2.f81636c.getString(R$string.f81504k);
        dVar2.S = dVar2.f81636c.getString(R$string.f81502i);
        dVar2.f81633a0 = dVar2.f81636c.getString(R$string.f81507n);
        dVar2.f81635b0 = dVar2.f81636c.getString(R$string.f81506m);
        dVar2.f81634b.U((ViewGroup) dVar2.findViewById(R$id.f81462e), true);
        dVar2.f81634b.U(dVar2.f81664q, z18);
        dVar2.f81634b.U(dVar2.f81666r, z20);
        dVar2.f81634b.U(dVar2.f81658n, z21);
        dVar2.f81634b.U(dVar2.f81660o, z19);
        dVar2.f81634b.U(dVar2.f81674v, z12);
        dVar2.f81634b.U(dVar2.f81678x, z13);
        dVar2.f81634b.U(dVar2.f81676w, z14);
        dVar2.f81634b.U(dVar2.f81672u, dVar2.f81673u0 != 0 ? true : z22);
        dVar2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: yb.h
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view3, int i52, int i53, int i54, int i55, int i56, int i57, int i58, int i59) {
                this.f118904b.h0(view3, i52, i53, i54, i55, i56, i57, i58, i59);
            }
        });
    }

    private void A0() {
        this.f81642f.measure(0, 0);
        this.f81654l.setWidth(Math.min(this.f81642f.getMeasuredWidth(), getWidth() - (this.f81656m * 2)));
        this.f81654l.setHeight(Math.min(getHeight() - (this.f81656m * 2), this.f81642f.getMeasuredHeight()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B0() {
        ImageView imageView;
        if (e0() && this.f81659n0 && (imageView = this.f81674v) != null) {
            n9.a0 a0Var = this.f81653k0;
            if (!this.f81634b.A(imageView)) {
                o0(false, this.f81674v);
                return;
            }
            if (a0Var == null || !a0Var.isCommandAvailable(14)) {
                o0(false, this.f81674v);
                this.f81674v.setImageDrawable(this.U);
                this.f81674v.setContentDescription(this.f81635b0);
            } else {
                o0(true, this.f81674v);
                this.f81674v.setImageDrawable(a0Var.getShuffleModeEnabled() ? this.T : this.U);
                this.f81674v.setContentDescription(a0Var.getShuffleModeEnabled() ? this.f81633a0 : this.f81635b0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0116  */
    /* JADX WARN: Type inference failed for: r9v6, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void C0() {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.ui.d.C0():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D0() {
        a0();
        o0(this.f81648i.getItemCount() > 0, this.f81678x);
        z0();
    }

    private static boolean T(n9.a0 a0Var, e0.c cVar) {
        n9.e0 currentTimeline;
        int iP;
        if (!a0Var.isCommandAvailable(17) || (iP = (currentTimeline = a0Var.getCurrentTimeline()).p()) <= 1 || iP > 100) {
            return false;
        }
        for (int i10 = 0; i10 < iP; i10++) {
            if (currentTimeline.n(i10, cVar).f95283m == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(RecyclerView.Adapter adapter, View view) {
        this.f81642f.setAdapter(adapter);
        A0();
        this.A0 = false;
        this.f81654l.dismiss();
        this.A0 = true;
        this.f81654l.showAsDropDown(view, (getWidth() - this.f81654l.getWidth()) - this.f81656m, (-this.f81654l.getHeight()) - this.f81656m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ImmutableList W(n9.i0 i0Var, int i10) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        ImmutableList immutableListA = i0Var.a();
        for (int i11 = 0; i11 < immutableListA.size(); i11++) {
            i0.a aVar = (i0.a) immutableListA.get(i11);
            if (aVar.c() == i10) {
                for (int i12 = 0; i12 < aVar.f95408a; i12++) {
                    if (aVar.h(i12)) {
                        io.bidmachine.media3.common.a aVarB = aVar.b(i12);
                        if ((aVarB.f80551e & 2) == 0) {
                            builder.add(new k(i0Var, i11, i12, this.f81652k.a(aVarB)));
                        }
                    }
                }
            }
        }
        return builder.build();
    }

    private static int X(TypedArray typedArray, int i10) {
        return typedArray.getInt(R$styleable.L, i10);
    }

    private void a0() {
        this.f81648i.clear();
        this.f81650j.clear();
        n9.a0 a0Var = this.f81653k0;
        if (a0Var != null && a0Var.isCommandAvailable(30) && this.f81653k0.isCommandAvailable(29)) {
            n9.i0 currentTracks = this.f81653k0.getCurrentTracks();
            this.f81650j.init(W(currentTracks, 1));
            if (this.f81634b.A(this.f81678x)) {
                this.f81648i.init(W(currentTracks, 3));
            } else {
                this.f81648i.init(ImmutableList.of());
            }
        }
    }

    private static void b0(View view, View.OnClickListener onClickListener) {
        if (view == null) {
            return;
        }
        view.setVisibility(8);
        view.setOnClickListener(onClickListener);
    }

    private static boolean d0(int i10) {
        return i10 == 90 || i10 == 89 || i10 == 85 || i10 == 79 || i10 == 126 || i10 == 127 || i10 == 87 || i10 == 88;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(View view) {
        s0(!this.f81657m0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18 = i13 - i11;
        int i19 = i17 - i15;
        if (!(i12 - i10 == i16 - i14 && i18 == i19) && this.f81654l.isShowing()) {
            A0();
            this.f81654l.update(view, (getWidth() - this.f81654l.getWidth()) - this.f81656m, (-this.f81654l.getHeight()) - this.f81656m, -1, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(int i10) {
        if (i10 == 0) {
            V(this.f81646h, (View) q9.a.e(this.A));
        } else if (i10 == 1) {
            V(this.f81650j, (View) q9.a.e(this.A));
        } else {
            this.f81654l.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0(n9.a0 a0Var, long j10) {
        if (this.f81665q0) {
            if (a0Var.isCommandAvailable(17) && a0Var.isCommandAvailable(10)) {
                n9.e0 currentTimeline = a0Var.getCurrentTimeline();
                int iP = currentTimeline.p();
                int i10 = 0;
                while (true) {
                    long jD = currentTimeline.n(i10, this.J).d();
                    if (j10 < jD) {
                        break;
                    }
                    if (i10 == iP - 1) {
                        j10 = jD;
                        break;
                    } else {
                        j10 -= jD;
                        i10++;
                    }
                }
                a0Var.seekTo(i10, j10);
            }
        } else if (a0Var.isCommandAvailable(5)) {
            a0Var.seekTo(j10);
        }
        w0();
    }

    private void o0(boolean z10, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z10);
        view.setAlpha(z10 ? this.V : this.W);
    }

    private void p0() {
        n9.a0 a0Var = this.f81653k0;
        int seekForwardIncrement = (int) ((a0Var != null ? a0Var.getSeekForwardIncrement() : 15000L) / 1000);
        TextView textView = this.f81668s;
        if (textView != null) {
            textView.setText(String.valueOf(seekForwardIncrement));
        }
        View view = this.f81664q;
        if (view != null) {
            view.setContentDescription(this.f81636c.getQuantityString(R$plurals.f81492a, seekForwardIncrement, Integer.valueOf(seekForwardIncrement)));
        }
    }

    private void q0(ImageView imageView, boolean z10) {
        if (imageView == null) {
            return;
        }
        if (z10) {
            imageView.setImageDrawable(this.f81645g0);
            imageView.setContentDescription(this.f81649i0);
        } else {
            imageView.setImageDrawable(this.f81647h0);
            imageView.setContentDescription(this.f81651j0);
        }
    }

    private static void r0(View view, boolean z10) {
        if (view == null) {
            return;
        }
        if (z10) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f10) {
        n9.a0 a0Var = this.f81653k0;
        if (a0Var == null || !a0Var.isCommandAvailable(13)) {
            return;
        }
        n9.a0 a0Var2 = this.f81653k0;
        a0Var2.b(a0Var2.getPlaybackParameters().b(f10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0() {
        boolean zIsCommandAvailable;
        boolean zIsCommandAvailable2;
        boolean zIsCommandAvailable3;
        boolean zIsCommandAvailable4;
        boolean zIsCommandAvailable5;
        if (e0() && this.f81659n0) {
            n9.a0 a0Var = this.f81653k0;
            if (a0Var != null) {
                zIsCommandAvailable = (this.f81661o0 && T(a0Var, this.J)) ? a0Var.isCommandAvailable(10) : a0Var.isCommandAvailable(5);
                zIsCommandAvailable3 = a0Var.isCommandAvailable(7);
                zIsCommandAvailable4 = a0Var.isCommandAvailable(11);
                zIsCommandAvailable5 = a0Var.isCommandAvailable(12);
                zIsCommandAvailable2 = a0Var.isCommandAvailable(9);
            } else {
                zIsCommandAvailable = false;
                zIsCommandAvailable2 = false;
                zIsCommandAvailable3 = false;
                zIsCommandAvailable4 = false;
                zIsCommandAvailable5 = false;
            }
            if (zIsCommandAvailable4) {
                y0();
            }
            if (zIsCommandAvailable5) {
                p0();
            }
            o0(zIsCommandAvailable3, this.f81658n);
            o0(zIsCommandAvailable4, this.f81666r);
            o0(zIsCommandAvailable5, this.f81664q);
            o0(zIsCommandAvailable2, this.f81660o);
            h0 h0Var = this.F;
            if (h0Var != null) {
                h0Var.setEnabled(zIsCommandAvailable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0() {
        if (e0() && this.f81659n0 && this.f81662p != null) {
            boolean zI1 = o0.i1(this.f81653k0, this.f81663p0);
            Drawable drawable = zI1 ? this.L : this.M;
            int i10 = zI1 ? R$string.f81500g : R$string.f81499f;
            this.f81662p.setImageDrawable(drawable);
            this.f81662p.setContentDescription(this.f81636c.getString(i10));
            o0(o0.h1(this.f81653k0), this.f81662p);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v0() {
        n9.a0 a0Var = this.f81653k0;
        if (a0Var == null) {
            return;
        }
        this.f81646h.updateSelectedIndex(a0Var.getPlaybackParameters().f95679a);
        this.f81644g.setSubTextAtPosition(0, this.f81646h.getSelectedText());
        z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w0() {
        long contentPosition;
        long contentBufferedPosition;
        if (e0() && this.f81659n0) {
            n9.a0 a0Var = this.f81653k0;
            if (a0Var == null || !a0Var.isCommandAvailable(16)) {
                contentPosition = 0;
                contentBufferedPosition = 0;
            } else {
                contentPosition = this.f81683z0 + a0Var.getContentPosition();
                contentBufferedPosition = this.f81683z0 + a0Var.getContentBufferedPosition();
            }
            TextView textView = this.E;
            if (textView != null && !this.f81667r0) {
                textView.setText(o0.o0(this.G, this.H, contentPosition));
            }
            h0 h0Var = this.F;
            if (h0Var != null) {
                h0Var.setPosition(contentPosition);
                this.F.setBufferedPosition(contentBufferedPosition);
            }
            removeCallbacks(this.K);
            int playbackState = a0Var == null ? 1 : a0Var.getPlaybackState();
            if (a0Var == null || !a0Var.isPlaying()) {
                if (playbackState == 4 || playbackState == 1) {
                    return;
                }
                postDelayed(this.K, 1000L);
                return;
            }
            h0 h0Var2 = this.F;
            long jMin = Math.min(h0Var2 != null ? h0Var2.getPreferredUpdateDelay() : 1000L, 1000 - (contentPosition % 1000));
            float f10 = a0Var.getPlaybackParameters().f95679a;
            postDelayed(this.K, o0.q(f10 > 0.0f ? (long) (jMin / f10) : 1000L, this.f81671t0, 1000L));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x0() {
        ImageView imageView;
        if (e0() && this.f81659n0 && (imageView = this.f81672u) != null) {
            if (this.f81673u0 == 0) {
                o0(false, imageView);
                return;
            }
            n9.a0 a0Var = this.f81653k0;
            if (a0Var == null || !a0Var.isCommandAvailable(15)) {
                o0(false, this.f81672u);
                this.f81672u.setImageDrawable(this.N);
                this.f81672u.setContentDescription(this.Q);
                return;
            }
            o0(true, this.f81672u);
            int repeatMode = a0Var.getRepeatMode();
            if (repeatMode == 0) {
                this.f81672u.setImageDrawable(this.N);
                this.f81672u.setContentDescription(this.Q);
            } else if (repeatMode == 1) {
                this.f81672u.setImageDrawable(this.O);
                this.f81672u.setContentDescription(this.R);
            } else {
                if (repeatMode != 2) {
                    return;
                }
                this.f81672u.setImageDrawable(this.P);
                this.f81672u.setContentDescription(this.S);
            }
        }
    }

    private void y0() {
        n9.a0 a0Var = this.f81653k0;
        int seekBackIncrement = (int) ((a0Var != null ? a0Var.getSeekBackIncrement() : 5000L) / 1000);
        TextView textView = this.f81670t;
        if (textView != null) {
            textView.setText(String.valueOf(seekBackIncrement));
        }
        View view = this.f81666r;
        if (view != null) {
            view.setContentDescription(this.f81636c.getQuantityString(R$plurals.f81493b, seekBackIncrement, Integer.valueOf(seekBackIncrement)));
        }
    }

    private void z0() {
        o0(this.f81644g.hasSettingsToShow(), this.A);
    }

    public void S(m mVar) {
        q9.a.e(mVar);
        this.f81640e.add(mVar);
    }

    public boolean U(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        n9.a0 a0Var = this.f81653k0;
        if (a0Var == null || !d0(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (a0Var.getPlaybackState() == 4 || !a0Var.isCommandAvailable(12)) {
                return true;
            }
            a0Var.seekForward();
            return true;
        }
        if (keyCode == 89 && a0Var.isCommandAvailable(11)) {
            a0Var.seekBack();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            o0.x0(a0Var, this.f81663p0);
            return true;
        }
        if (keyCode == 87) {
            if (!a0Var.isCommandAvailable(9)) {
                return true;
            }
            a0Var.seekToNext();
            return true;
        }
        if (keyCode == 88) {
            if (!a0Var.isCommandAvailable(7)) {
                return true;
            }
            a0Var.seekToPrevious();
            return true;
        }
        if (keyCode == 126) {
            o0.w0(a0Var);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        o0.v0(a0Var);
        return true;
    }

    public void Y() {
        this.f81634b.C();
    }

    public void Z() {
        this.f81634b.F();
    }

    public boolean c0() {
        return this.f81634b.I();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return U(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public boolean e0() {
        return getVisibility() == 0;
    }

    void f0() {
        Iterator it = this.f81640e.iterator();
        while (it.hasNext()) {
            ((m) it.next()).onVisibilityChange(getVisibility());
        }
    }

    @Nullable
    public n9.a0 getPlayer() {
        return this.f81653k0;
    }

    public int getRepeatToggleModes() {
        return this.f81673u0;
    }

    public boolean getShowShuffleButton() {
        return this.f81634b.A(this.f81674v);
    }

    public boolean getShowSubtitleButton() {
        return this.f81634b.A(this.f81678x);
    }

    public int getShowTimeoutMs() {
        return this.f81669s0;
    }

    public boolean getShowVrButton() {
        return this.f81634b.A(this.f81676w);
    }

    public void j0(m mVar) {
        this.f81640e.remove(mVar);
    }

    void k0() {
        ImageView imageView = this.f81662p;
        if (imageView != null) {
            imageView.requestFocus();
        }
    }

    public void m0() {
        this.f81634b.X();
    }

    void n0() {
        u0();
        t0();
        x0();
        B0();
        D0();
        v0();
        C0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f81634b.K();
        this.f81659n0 = true;
        if (c0()) {
            this.f81634b.S();
        }
        n0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f81634b.L();
        this.f81659n0 = false;
        removeCallbacks(this.K);
        this.f81634b.R();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f81634b.M(z10, i10, i11, i12, i13);
    }

    public void s0(boolean z10) {
        if (this.f81657m0 == z10) {
            return;
        }
        this.f81657m0 = z10;
        q0(this.f81680y, z10);
        q0(this.f81682z, z10);
        InterfaceC0984d interfaceC0984d = this.f81655l0;
        if (interfaceC0984d != null) {
            interfaceC0984d.onFullScreenModeChanged(z10);
        }
    }

    public void setAnimationEnabled(boolean z10) {
        this.f81634b.T(z10);
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(@Nullable InterfaceC0984d interfaceC0984d) {
        this.f81655l0 = interfaceC0984d;
        r0(this.f81680y, interfaceC0984d != null);
        r0(this.f81682z, interfaceC0984d != null);
    }

    public void setPlayer(@Nullable n9.a0 a0Var) {
        q9.a.g(Looper.myLooper() == Looper.getMainLooper());
        q9.a.a(a0Var == null || a0Var.getApplicationLooper() == Looper.getMainLooper());
        n9.a0 a0Var2 = this.f81653k0;
        if (a0Var2 == a0Var) {
            return;
        }
        if (a0Var2 != null) {
            a0Var2.d(this.f81638d);
        }
        this.f81653k0 = a0Var;
        if (a0Var != null) {
            a0Var.c(this.f81638d);
        }
        n0();
    }

    public void setProgressUpdateListener(@Nullable f fVar) {
    }

    public void setRepeatToggleModes(int i10) {
        this.f81673u0 = i10;
        n9.a0 a0Var = this.f81653k0;
        if (a0Var != null && a0Var.isCommandAvailable(15)) {
            int repeatMode = this.f81653k0.getRepeatMode();
            if (i10 == 0 && repeatMode != 0) {
                this.f81653k0.setRepeatMode(0);
            } else if (i10 == 1 && repeatMode == 2) {
                this.f81653k0.setRepeatMode(1);
            } else if (i10 == 2 && repeatMode == 1) {
                this.f81653k0.setRepeatMode(2);
            }
        }
        this.f81634b.U(this.f81672u, i10 != 0);
        x0();
    }

    public void setShowFastForwardButton(boolean z10) {
        this.f81634b.U(this.f81664q, z10);
        t0();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z10) {
        this.f81661o0 = z10;
        C0();
    }

    public void setShowNextButton(boolean z10) {
        this.f81634b.U(this.f81660o, z10);
        t0();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z10) {
        this.f81663p0 = z10;
        u0();
    }

    public void setShowPreviousButton(boolean z10) {
        this.f81634b.U(this.f81658n, z10);
        t0();
    }

    public void setShowRewindButton(boolean z10) {
        this.f81634b.U(this.f81666r, z10);
        t0();
    }

    public void setShowShuffleButton(boolean z10) {
        this.f81634b.U(this.f81674v, z10);
        B0();
    }

    public void setShowSubtitleButton(boolean z10) {
        this.f81634b.U(this.f81678x, z10);
    }

    public void setShowTimeoutMs(int i10) {
        this.f81669s0 = i10;
        if (c0()) {
            this.f81634b.S();
        }
    }

    public void setShowVrButton(boolean z10) {
        this.f81634b.U(this.f81676w, z10);
    }

    public void setTimeBarMinUpdateInterval(int i10) {
        this.f81671t0 = o0.p(i10, 16, 1000);
    }

    public void setVrButtonListener(@Nullable View.OnClickListener onClickListener) {
        ImageView imageView = this.f81676w;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            o0(onClickListener != null, this.f81676w);
        }
    }
}
