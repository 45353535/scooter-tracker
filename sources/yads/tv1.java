package yads;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class tv1 extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f116396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qv1 f116397b;

    public tv1(hg2 hg2Var, List list, t9 t9Var) {
        this.f116396a = list;
        this.f116397b = new qv1(hg2Var, t9Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f116396a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        ((ov1) viewHolder).f114422a.b((d31) this.f116396a.get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        qv1 qv1Var = this.f116397b;
        qv1Var.getClass();
        ImageView imageView = new ImageView(viewGroup.getContext());
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setOnClickListener(new pv1());
        return new ov1(imageView, new l31(imageView, qv1Var.f115177a, qv1Var.f115178b));
    }
}
