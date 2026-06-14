package yads;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class sm0 implements lg3, vk, l33, jr1, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, pk, jk, m13, mm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vm0 f115875a;

    public sm0(vm0 vm0Var) {
        this.f115875a = vm0Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f115875a.a(surfaceTexture);
        this.f115875a.a(i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f115875a.a((Surface) null);
        this.f115875a.a(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f115875a.a(i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        this.f115875a.a(i11, i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        vm0 vm0Var = this.f115875a;
        if (vm0Var.M) {
            vm0Var.a(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        vm0 vm0Var = this.f115875a;
        if (vm0Var.M) {
            vm0Var.a((Surface) null);
        }
        this.f115875a.a(0, 0);
    }

    public final /* synthetic */ void a(oc2 oc2Var) {
        oc2Var.a(this.f115875a.G);
    }

    public final void a(final List list) {
        ae1 ae1Var = this.f115875a.f117103j;
        ae1Var.a(27, new xd1() { // from class: yads.lq0
            @Override // yads.xd1
            public final void invoke(Object obj) {
                ((oc2) obj).onCues(list);
            }
        });
        ae1Var.a();
    }

    public final void a(final c20 c20Var) {
        this.f115875a.getClass();
        ae1 ae1Var = this.f115875a.f117103j;
        ae1Var.a(27, new xd1() { // from class: yads.gq0
            @Override // yads.xd1
            public final void invoke(Object obj) {
                ((oc2) obj).a(c20Var);
            }
        });
        ae1Var.a();
    }

    public final void a(final fr1 fr1Var) {
        vm0 vm0Var = this.f115875a;
        vk1 vk1Var = vm0Var.Y;
        vk1Var.getClass();
        uk1 uk1Var = new uk1(vk1Var);
        int i10 = 0;
        while (true) {
            er1[] er1VarArr = fr1Var.f110835b;
            if (i10 >= er1VarArr.length) {
                break;
            }
            er1VarArr[i10].a(uk1Var);
            i10++;
        }
        vm0Var.Y = new vk1(uk1Var);
        vk1 vk1VarC = this.f115875a.c();
        if (!vk1VarC.equals(this.f115875a.G)) {
            vm0 vm0Var2 = this.f115875a;
            vm0Var2.G = vk1VarC;
            vm0Var2.f117103j.a(14, new xd1() { // from class: yads.jq0
                @Override // yads.xd1
                public final void invoke(Object obj) {
                    this.f112431a.a((oc2) obj);
                }
            });
        }
        this.f115875a.f117103j.a(28, new xd1() { // from class: yads.kq0
            @Override // yads.xd1
            public final void invoke(Object obj) {
                ((oc2) obj).a(fr1Var);
            }
        });
        this.f115875a.f117103j.a();
    }

    public final void a(Object obj, long j10) {
        ((xa0) this.f115875a.f117108o).a(obj, j10);
        vm0 vm0Var = this.f115875a;
        if (vm0Var.I == obj) {
            ae1 ae1Var = vm0Var.f117103j;
            ae1Var.a(26, new xd1() { // from class: yads.mq0
                @Override // yads.xd1
                public final void invoke(Object obj2) {
                    ((oc2) obj2).onRenderedFirstFrame();
                }
            });
            ae1Var.a();
        }
    }

    public final void a(final boolean z10) {
        vm0 vm0Var = this.f115875a;
        if (vm0Var.U == z10) {
            return;
        }
        vm0Var.U = z10;
        ae1 ae1Var = vm0Var.f117103j;
        ae1Var.a(23, new xd1() { // from class: yads.oq0
            @Override // yads.xd1
            public final void invoke(Object obj) {
                ((oc2) obj).onSkipSilenceEnabledChanged(z10);
            }
        });
        ae1Var.a();
    }

    public final void a() {
        final qf0 qf0VarA = vm0.a(this.f115875a.f117116w);
        if (qf0VarA.equals(this.f115875a.X)) {
            return;
        }
        vm0 vm0Var = this.f115875a;
        vm0Var.X = qf0VarA;
        ae1 ae1Var = vm0Var.f117103j;
        ae1Var.a(29, new xd1() { // from class: yads.hq0
            @Override // yads.xd1
            public final void invoke(Object obj) {
                ((oc2) obj).a(qf0VarA);
            }
        });
        ae1Var.a();
    }

    public final void a(final boolean z10, final int i10) {
        ae1 ae1Var = this.f115875a.f117103j;
        ae1Var.a(30, new xd1() { // from class: yads.iq0
            @Override // yads.xd1
            public final void invoke(Object obj) {
                oc2 oc2Var = (oc2) obj;
                oc2Var.a(z10, i10);
            }
        });
        ae1Var.a();
    }

    public final void a(final tg3 tg3Var) {
        this.f115875a.getClass();
        ae1 ae1Var = this.f115875a.f117103j;
        ae1Var.a(25, new xd1() { // from class: yads.nq0
            @Override // yads.xd1
            public final void invoke(Object obj) {
                ((oc2) obj).a(tg3Var);
            }
        });
        ae1Var.a();
    }
}
