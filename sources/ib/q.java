package ib;

import com.google.common.base.Splitter;
import db.c;
import java.util.ArrayList;
import java.util.List;
import oa.l0;
import q9.d0;

/* JADX INFO: loaded from: classes12.dex */
final class q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Splitter f74123d = Splitter.on(':');

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Splitter f74124e = Splitter.on('*');

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f74125a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f74126b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f74127c;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f74128a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f74129b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f74130c;

        public a(int i10, long j10, int i11) {
            this.f74128a = i10;
            this.f74129b = j10;
            this.f74130c = i11;
        }
    }

    private void a(oa.s sVar, l0 l0Var) {
        d0 d0Var = new d0(8);
        sVar.readFully(d0Var.e(), 0, 8);
        this.f74127c = d0Var.u() + 8;
        if (d0Var.q() != 1397048916) {
            l0Var.f96583a = 0L;
        } else {
            l0Var.f96583a = sVar.getPosition() - ((long) (this.f74127c - 12));
            this.f74126b = 2;
        }
    }

    private static int b(String str) throws n9.x {
        str.getClass();
        switch (str) {
            case "SlowMotion_Data":
                return 2192;
            case "Super_SlowMotion_Edit_Data":
                return 2819;
            case "Super_SlowMotion_Data":
                return 2816;
            case "Super_SlowMotion_Deflickering_On":
                return 2820;
            case "Super_SlowMotion_BGM":
                return 2817;
            default:
                throw n9.x.a("Invalid SEF name", null);
        }
    }

    private void d(oa.s sVar, l0 l0Var) {
        long length = sVar.getLength();
        int i10 = this.f74127c - 20;
        d0 d0Var = new d0(i10);
        sVar.readFully(d0Var.e(), 0, i10);
        for (int i11 = 0; i11 < i10 / 12; i11++) {
            d0Var.X(2);
            short sW = d0Var.w();
            if (sW == 2192 || sW == 2816 || sW == 2817 || sW == 2819 || sW == 2820) {
                this.f74125a.add(new a(sW, (length - ((long) this.f74127c)) - ((long) d0Var.u()), d0Var.u()));
            } else {
                d0Var.X(8);
            }
        }
        if (this.f74125a.isEmpty()) {
            l0Var.f96583a = 0L;
        } else {
            this.f74126b = 3;
            l0Var.f96583a = ((a) this.f74125a.get(0)).f74129b;
        }
    }

    private void e(oa.s sVar, List list) throws n9.x {
        long position = sVar.getPosition();
        int length = (int) ((sVar.getLength() - sVar.getPosition()) - ((long) this.f74127c));
        d0 d0Var = new d0(length);
        sVar.readFully(d0Var.e(), 0, length);
        for (int i10 = 0; i10 < this.f74125a.size(); i10++) {
            a aVar = (a) this.f74125a.get(i10);
            d0Var.W((int) (aVar.f74129b - position));
            d0Var.X(4);
            int iU = d0Var.u();
            int iB = b(d0Var.E(iU));
            int i11 = aVar.f74130c - (iU + 8);
            if (iB == 2192) {
                list.add(f(d0Var, i11));
            } else if (iB != 2816 && iB != 2817 && iB != 2819 && iB != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    private static db.c f(d0 d0Var, int i10) throws n9.x {
        ArrayList arrayList = new ArrayList();
        List<String> listSplitToList = f74124e.splitToList(d0Var.E(i10));
        for (int i11 = 0; i11 < listSplitToList.size(); i11++) {
            List<String> listSplitToList2 = f74123d.splitToList(listSplitToList.get(i11));
            if (listSplitToList2.size() != 3) {
                throw n9.x.a(null, null);
            }
            try {
                arrayList.add(new c.a(Long.parseLong(listSplitToList2.get(0)), Long.parseLong(listSplitToList2.get(1)), 1 << (Integer.parseInt(listSplitToList2.get(2)) - 1)));
            } catch (NumberFormatException e10) {
                throw n9.x.a(null, e10);
            }
        }
        return new db.c(arrayList);
    }

    public int c(oa.s sVar, l0 l0Var, List list) throws n9.x {
        int i10 = this.f74126b;
        long j10 = 0;
        if (i10 == 0) {
            long length = sVar.getLength();
            if (length != -1 && length >= 8) {
                j10 = length - 8;
            }
            l0Var.f96583a = j10;
            this.f74126b = 1;
        } else if (i10 == 1) {
            a(sVar, l0Var);
        } else if (i10 == 2) {
            d(sVar, l0Var);
        } else {
            if (i10 != 3) {
                throw new IllegalStateException();
            }
            e(sVar, list);
            l0Var.f96583a = 0L;
        }
        return 1;
    }

    public void g() {
        this.f74125a.clear();
        this.f74126b = 0;
    }
}
