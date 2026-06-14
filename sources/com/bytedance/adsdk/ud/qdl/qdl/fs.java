package com.bytedance.adsdk.ud.qdl.qdl;

import android.annotation.TargetApi;
import android.graphics.Path;
import com.bytedance.adsdk.ud.lnr.ud.tvp;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes6.dex */
@TargetApi(19)
public class fs implements exu, to {
    private final String mml;
    private final com.bytedance.adsdk.ud.lnr.ud.tvp mo;
    private final Path qdl = new Path();

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final Path f16081ud = new Path();
    private final Path lnr = new Path();
    private final List<exu> mzz = new ArrayList();

    /* JADX INFO: renamed from: com.bytedance.adsdk.ud.qdl.qdl.fs$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] qdl;

        static {
            int[] iArr = new int[tvp.qdl.values().length];
            qdl = iArr;
            try {
                iArr[tvp.qdl.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                qdl[tvp.qdl.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                qdl[tvp.qdl.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                qdl[tvp.qdl.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                qdl[tvp.qdl.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public fs(com.bytedance.adsdk.ud.lnr.ud.tvp tvpVar) {
        this.mml = tvpVar.qdl();
        this.mo = tvpVar;
    }

    @Override // com.bytedance.adsdk.ud.qdl.qdl.exu
    public Path mml() {
        this.lnr.reset();
        if (this.mo.lnr()) {
            return this.lnr;
        }
        int i10 = AnonymousClass1.qdl[this.mo.ud().ordinal()];
        if (i10 == 1) {
            qdl();
        } else if (i10 == 2) {
            qdl(Path.Op.UNION);
        } else if (i10 == 3) {
            qdl(Path.Op.REVERSE_DIFFERENCE);
        } else if (i10 == 4) {
            qdl(Path.Op.INTERSECT);
        } else if (i10 == 5) {
            qdl(Path.Op.XOR);
        }
        return this.lnr;
    }

    @Override // com.bytedance.adsdk.ud.qdl.qdl.to
    public void qdl(ListIterator<lnr> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            lnr lnrVarPrevious = listIterator.previous();
            if (lnrVarPrevious instanceof exu) {
                this.mzz.add((exu) lnrVarPrevious);
                listIterator.remove();
            }
        }
    }

    @Override // com.bytedance.adsdk.ud.qdl.qdl.lnr
    public void qdl(List<lnr> list, List<lnr> list2) {
        for (int i10 = 0; i10 < this.mzz.size(); i10++) {
            this.mzz.get(i10).qdl(list, list2);
        }
    }

    private void qdl() {
        for (int i10 = 0; i10 < this.mzz.size(); i10++) {
            this.lnr.addPath(this.mzz.get(i10).mml());
        }
    }

    @TargetApi(19)
    private void qdl(Path.Op op) {
        this.f16081ud.reset();
        this.qdl.reset();
        for (int size = this.mzz.size() - 1; size > 0; size--) {
            exu exuVar = this.mzz.get(size);
            if (exuVar instanceof mml) {
                mml mmlVar = (mml) exuVar;
                List<exu> listUd = mmlVar.ud();
                for (int size2 = listUd.size() - 1; size2 >= 0; size2--) {
                    Path pathMml = listUd.get(size2).mml();
                    pathMml.transform(mmlVar.lnr());
                    this.f16081ud.addPath(pathMml);
                }
            } else {
                this.f16081ud.addPath(exuVar.mml());
            }
        }
        exu exuVar2 = this.mzz.get(0);
        if (exuVar2 instanceof mml) {
            mml mmlVar2 = (mml) exuVar2;
            List<exu> listUd2 = mmlVar2.ud();
            for (int i10 = 0; i10 < listUd2.size(); i10++) {
                Path pathMml2 = listUd2.get(i10).mml();
                pathMml2.transform(mmlVar2.lnr());
                this.qdl.addPath(pathMml2);
            }
        } else {
            this.qdl.set(exuVar2.mml());
        }
        this.lnr.op(this.qdl, this.f16081ud, op);
    }
}
