package yads;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.R$layout;

/* JADX INFO: loaded from: classes4.dex */
public final class j40 extends ListAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ci3 f112231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oi3 f112232b;

    public /* synthetic */ j40(ma1 ma1Var, m70 m70Var) {
        this(new ci3(ma1Var, m70Var), new oi3());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i10) {
        o90 o90Var = (o90) getItem(i10);
        this.f112232b.getClass();
        if (o90Var instanceof h90) {
            return R$layout.debug_panel_item_action_button;
        }
        if (o90Var instanceof n90) {
            return R$layout.debug_panel_item_switch;
        }
        if (o90Var instanceof i90) {
            return R$layout.debug_panel_item_divider;
        }
        if (o90Var instanceof j90) {
            return R$layout.deubg_panel_item_header;
        }
        if (o90Var instanceof k90) {
            return R$layout.deubg_panel_item_key_value;
        }
        if (o90Var instanceof l90) {
            return R$layout.debug_panel_item_mediation_adapter;
        }
        if (o90Var instanceof f90) {
            return R$layout.debug_panel_item_ad_units;
        }
        if (o90Var instanceof e90) {
            return R$layout.debug_panel_item_ad_unit;
        }
        throw new lf.m();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        ((r90) viewHolder).a((o90) getItem(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(i10, viewGroup, false);
        ci3 ci3Var = this.f112231a;
        ci3Var.getClass();
        return i10 == R$layout.debug_panel_item_action_button ? new n0(vh3.f117012b, viewInflate) : i10 == R$layout.debug_panel_item_switch ? new o23(viewInflate, new xh3(ci3Var)) : i10 == R$layout.deubg_panel_item_header ? new fz0(viewInflate) : i10 == R$layout.deubg_panel_item_key_value ? new uc1(viewInflate) : i10 == R$layout.debug_panel_item_mediation_adapter ? new yp1(viewInflate, ci3Var.f109419b, new yh3(ci3Var), new zh3(ci3Var)) : i10 == R$layout.debug_panel_item_ad_units ? new pb(viewInflate, new ai3(ci3Var)) : i10 == R$layout.debug_panel_item_ad_unit ? new nb(new bi3(ci3Var), viewInflate) : new fi0(viewInflate);
    }

    public j40(ci3 ci3Var, oi3 oi3Var) {
        super(new g70());
        this.f112231a = ci3Var;
        this.f112232b = oi3Var;
    }
}
