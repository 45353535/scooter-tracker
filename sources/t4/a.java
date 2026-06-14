package t4;

import a5.a0;
import a5.z;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.ktwapps.speedometer.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import x4.k;
import x4.l;
import x4.x;

/* JADX INFO: loaded from: classes10.dex */
public class a extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Context f104935i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private b f104936j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f104937k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List f104938l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List f104939m = new ArrayList();

    /* JADX INFO: renamed from: t4.a$a, reason: collision with other inner class name */
    private class C1305a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        a0 f104940m;

        C1305a(a0 a0Var) {
            super(a0Var.getRoot());
            this.f104940m = a0Var;
        }

        public void a(String str) {
            this.f104940m.f3803b.setText(str);
        }
    }

    public interface b {
        void b(View view, int i10);

        void c(int i10);

        void n(int i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    class c extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        z f104942m;

        c(final z zVar) {
            super(zVar.getRoot());
            this.f104942m = zVar;
            zVar.getRoot().setOnClickListener(new View.OnClickListener() { // from class: t4.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f104944b.c(zVar, view);
                }
            });
            zVar.f4132p.setOnClickListener(this);
            zVar.f4122f.setOnClickListener(this);
            zVar.getRoot().setOnLongClickListener(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(z zVar, View view) {
            if (a.this.f104937k != 1) {
                a.this.f104936j.n(getLayoutPosition());
                return;
            }
            zVar.f4122f.toggle();
            if (a.this.f104936j != null) {
                a.this.f104936j.n(getLayoutPosition());
            }
        }

        public void b(v4.b bVar) {
            String strK = bVar.k();
            String str = a.this.f104935i.getString(R.string.duration) + ": " + l.j(bVar.c());
            String str2 = a.this.f104935i.getString(R.string.distance) + ": " + l.i(a.this.f104935i, bVar.b());
            String strQ = l.q(a.this.f104935i, bVar.j());
            String strQ2 = l.q(a.this.f104935i, bVar.e());
            String strI = bVar.i();
            String strD = bVar.d();
            if (strI == null || strI.isEmpty()) {
                strI = a.this.f104935i.getResources().getString(R.string.address_not_found);
            }
            if (strD == null || strD.isEmpty()) {
                strD = a.this.f104935i.getResources().getString(R.string.address_not_found);
            }
            Integer numValueOf = Integer.valueOf(bVar.f());
            this.f104942m.f4133q.setText(strK);
            this.f104942m.f4131o.setText(str);
            this.f104942m.f4128l.setText(str2);
            this.f104942m.f4125i.setText(strQ);
            this.f104942m.f4120d.setText(strQ2);
            this.f104942m.f4123g.setText(strI);
            this.f104942m.f4118b.setText(strD);
            this.f104942m.f4132p.setVisibility(a.this.f104937k == 0 ? 0 : 8);
            this.f104942m.f4122f.setVisibility(a.this.f104937k != 0 ? 0 : 8);
            this.f104942m.f4122f.setChecked(a.this.f104939m.contains(numValueOf));
            this.f104942m.f4122f.setButtonTintList(new ColorStateList(new int[][]{new int[]{android.R.attr.state_checked}, new int[]{-16842912}}, new int[]{((Integer) k.b(a.this.f104935i).get(x.d(a.this.f104935i))).intValue(), ContextCompat.getColor(a.this.f104935i, R.color.colorSecondaryText)}));
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a.this.f104936j != null) {
                if (view.getId() == R.id.moreImageView) {
                    a.this.f104936j.b(view, getLayoutPosition());
                } else {
                    a.this.f104936j.n(getLayoutPosition());
                }
            }
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (a.this.f104936j == null) {
                return true;
            }
            a.this.f104936j.c(getLayoutPosition());
            return true;
        }
    }

    public a(Context context) {
        this.f104935i = context;
    }

    public List e() {
        return this.f104938l;
    }

    public List f() {
        return this.f104939m;
    }

    public void g() {
        this.f104939m.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f104938l.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        return this.f104938l.get(i10) instanceof String ? 0 : 1;
    }

    public void h() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f104938l) {
            if (obj instanceof v4.b) {
                arrayList.add(Integer.valueOf(((v4.b) obj).f()));
            }
        }
        if (this.f104939m.size() == arrayList.size()) {
            g();
        } else {
            this.f104939m.clear();
            this.f104939m.addAll(arrayList);
        }
    }

    public void i(Integer num) {
        if (this.f104939m.contains(num)) {
            this.f104939m.remove(num);
        } else {
            this.f104939m.add(num);
        }
    }

    public void j(List list) {
        this.f104938l.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            v4.b bVar = (v4.b) it.next();
            String strH = l.h(bVar.e());
            if (!this.f104938l.contains(strH)) {
                this.f104938l.add(strH);
            }
            this.f104938l.add(bVar);
        }
    }

    public void k(b bVar) {
        this.f104936j = bVar;
    }

    public void l(int i10) {
        this.f104937k = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        if (getItemViewType(i10) == 0) {
            ((C1305a) viewHolder).a((String) this.f104938l.get(i10));
        } else {
            ((c) viewHolder).b((v4.b) this.f104938l.get(i10));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return i10 == 1 ? new c(z.c(LayoutInflater.from(this.f104935i), viewGroup, false)) : new C1305a(a0.c(LayoutInflater.from(this.f104935i), viewGroup, false));
    }
}
