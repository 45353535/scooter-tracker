package com.my.target;

import com.ironsource.C4424m2;
import com.my.target.o8;
import com.my.target.w8;
import com.my.target.za;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class za {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f61186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f61187b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f61188c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f61189d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f61190e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f61191f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f61192g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Comparator f61193h = new Comparator() { // from class: k5.n4
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return com.my.target.e2.a(((o8) obj2).f(), ((o8) obj).f());
        }
    };

    public za(h0 h0Var) {
        this.f61186a = h0Var;
    }

    public static za a(h0 h0Var) {
        return new za(h0Var);
    }

    public ab b(int i10) {
        ArrayList arrayList = new ArrayList();
        for (o8 o8Var : this.f61191f) {
            if (o8Var.d() == i10) {
                arrayList.add(o8Var);
            }
        }
        return ab.a(arrayList, this.f61186a);
    }

    public ArrayList c(String str) {
        ArrayList arrayList = new ArrayList();
        for (ya yaVar : this.f61187b) {
            if (str.equals(yaVar.a())) {
                arrayList.add(yaVar);
            }
        }
        return arrayList;
    }

    public boolean d(String str) {
        Iterator it = this.f61187b.iterator();
        while (it.hasNext()) {
            if (str.equals(((ya) it.next()).a())) {
                return true;
            }
        }
        return false;
    }

    public h0 a() {
        return this.f61186a;
    }

    public void a(ya yaVar) {
        if (yaVar instanceof n8) {
            String strD = ((n8) yaVar).d();
            if ("landscape".equals(strD)) {
                this.f61190e.add(yaVar);
                return;
            } else {
                if ("portrait".equals(strD)) {
                    this.f61189d.add(yaVar);
                    return;
                }
                return;
            }
        }
        if (yaVar instanceof w8) {
            this.f61188c.add((w8) yaVar);
            return;
        }
        if (yaVar instanceof o8) {
            o8 o8Var = (o8) yaVar;
            int iBinarySearch = Collections.binarySearch(this.f61191f, o8Var, this.f61193h);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 1;
            }
            this.f61191f.add(iBinarySearch, o8Var);
            return;
        }
        if (yaVar instanceof t6) {
            this.f61192g.add((t6) yaVar);
        } else {
            this.f61187b.add(yaVar);
        }
    }

    public boolean c() {
        return (this.f61187b.isEmpty() && this.f61188c.isEmpty() && this.f61191f.isEmpty() && this.f61192g.isEmpty() && this.f61190e.isEmpty() && this.f61189d.isEmpty()) ? false : true;
    }

    public ab b() {
        return ab.a(new ArrayList(this.f61188c), this.f61186a);
    }

    public ab b(String str) {
        ArrayList arrayList = new ArrayList();
        for (ya yaVar : this.f61187b) {
            if (str.equals(yaVar.a())) {
                arrayList.add(yaVar);
            }
        }
        return ab.a(arrayList, this.f61186a);
    }

    public void b(List list) {
        list.addAll(this.f61188c);
        Collections.sort(list, new Comparator() { // from class: k5.p4
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return za.a((w8) obj, (w8) obj2);
            }
        });
    }

    public static /* synthetic */ int b(w8 w8Var, w8 w8Var2) {
        return (int) (w8Var2.e() - w8Var.e());
    }

    public void b(za zaVar, float f10) {
        this.f61187b.addAll(zaVar.c("playbackStarted"));
        this.f61187b.addAll(zaVar.c("playbackResumed"));
        this.f61187b.addAll(zaVar.c("playbackPaused"));
        this.f61187b.addAll(zaVar.c("playbackStopped"));
        this.f61187b.addAll(zaVar.c("playbackCompleted"));
        this.f61187b.addAll(zaVar.c("playbackError"));
        this.f61187b.addAll(zaVar.c("volumeOn"));
        this.f61187b.addAll(zaVar.c("volumeOff"));
        this.f61187b.addAll(zaVar.c("fullscreenOn"));
        this.f61187b.addAll(zaVar.c("fullscreenOff"));
        this.f61187b.addAll(zaVar.c("error"));
        this.f61187b.addAll(zaVar.c("playbackTimeout"));
        this.f61192g.addAll(zaVar.a(2).f59176a);
        if (f10 <= 0.0f) {
            this.f61188c.addAll(zaVar.f61188c);
            this.f61191f.addAll(zaVar.b(2).f59176a);
            return;
        }
        for (w8 w8Var : zaVar.f61188c) {
            float fD = w8Var.d();
            if (fD >= 0.0f) {
                w8Var.b((fD * f10) / 100.0f);
                w8Var.a(-1.0f);
            }
            a(w8Var);
        }
        for (o8 o8Var : zaVar.b(2).f59176a) {
            float fE = o8Var.e();
            if (fE >= 0.0f) {
                o8Var.b((fE * f10) / 100.0f);
                o8Var.a(-1.0f);
            }
            a(o8Var);
        }
    }

    public ab a(int i10) {
        ArrayList arrayList = new ArrayList();
        for (t6 t6Var : this.f61192g) {
            if (t6Var.d() == i10) {
                arrayList.add(t6Var);
            }
        }
        return ab.a(arrayList, this.f61186a);
    }

    public List a(String str) {
        return new ArrayList(str.equals("portrait") ? this.f61189d : this.f61190e);
    }

    public static /* synthetic */ int a(w8 w8Var, w8 w8Var2) {
        return (int) (w8Var2.e() - w8Var.e());
    }

    public void a(ab abVar) {
        abVar.f59176a.addAll(this.f61188c);
        Collections.sort(abVar.f59176a, new Comparator() { // from class: k5.o4
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return za.b((w8) obj, (w8) obj2);
            }
        });
    }

    public void a(za zaVar, float f10) {
        this.f61187b.addAll(zaVar.f61187b);
        this.f61192g.addAll(zaVar.f61192g);
        this.f61189d.addAll(zaVar.f61189d);
        this.f61190e.addAll(zaVar.f61190e);
        if (f10 <= 0.0f) {
            this.f61188c.addAll(zaVar.f61188c);
            this.f61191f.addAll(zaVar.f61191f);
            return;
        }
        for (w8 w8Var : zaVar.f61188c) {
            float fD = w8Var.d();
            if (fD >= 0.0f) {
                w8Var.b((fD * f10) / 100.0f);
                w8Var.a(-1.0f);
            }
            a(w8Var);
        }
        for (o8 o8Var : zaVar.f61191f) {
            float fE = o8Var.e();
            if (fE >= 0.0f) {
                o8Var.b((fE * f10) / 100.0f);
                o8Var.a(-1.0f);
            }
            a(o8Var);
        }
    }

    public void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a((ya) it.next());
        }
    }

    public void a(ArrayList arrayList) {
        this.f61188c.addAll(arrayList);
    }

    public boolean a(i0 i0Var) {
        Iterator it = this.f61187b.iterator();
        boolean z10 = false;
        boolean z11 = false;
        while (it.hasNext()) {
            String strA = ((ya) it.next()).a();
            if (C4424m2.f43623v.equals(strA) || "playbackStarted".equals(strA)) {
                z10 = true;
            }
            if ("click".equals(strA)) {
                z11 = true;
            }
        }
        if (!z10) {
            i0Var.b(3008, "show or playbackStarted stat is not found");
        }
        if (!z11) {
            i0Var.b(3008, "click stat is not found");
        }
        return z10 && z11;
    }
}
