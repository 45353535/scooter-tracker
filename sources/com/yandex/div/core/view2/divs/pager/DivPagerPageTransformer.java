package com.yandex.div.core.view2.divs.pager;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.ironsource.C4240b4;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import k8.bk;
import k8.c6;
import k8.qj;
import k8.uj;
import kotlin.Metadata;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b!\b\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0018\u001a\u00020\u0017*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u0018\u001a\u00020\u0017*\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u001bJa\u0010$\u001a\u00020\u0017*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00072\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001c2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001c2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001c2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001cH\u0002¢\u0006\u0004\b$\u0010%J%\u0010'\u001a\u00020\u0017*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010&\u001a\u00020\u000fH\u0002¢\u0006\u0004\b'\u0010(J#\u0010+\u001a\u00020\u0017*\u00020\u00142\u0006\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u0007H\u0002¢\u0006\u0004\b+\u0010,J#\u0010/\u001a\u00020\u0017*\u00020\u00142\u0006\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u001fH\u0002¢\u0006\u0004\b/\u00100J#\u00102\u001a\u00020\u0017*\u00020\u00142\u0006\u0010-\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u001fH\u0002¢\u0006\u0004\b2\u00100J'\u00105\u001a\u00020\u001f2\u0006\u00103\u001a\u00020\u001f2\u0006\u00104\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020\u0007H\u0002¢\u0006\u0004\b5\u00106J\u001f\u00107\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b7\u00108R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010:R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010;R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010<R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010=R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010>R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010?¨\u0006@"}, d2 = {"Lcom/yandex/div/core/view2/divs/pager/DivPagerPageTransformer;", "Landroidx/viewpager2/widget/ViewPager2$PageTransformer;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "Landroid/util/SparseArray;", "", "pageTranslations", "", "parentSize", "Lk8/qj;", "pageTransformation", "Lcom/yandex/div/core/view2/divs/pager/DivPagerPageOffsetProvider;", "offsetProvider", "", "isHorizontal", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/yandex/div/json/expressions/ExpressionResolver;Landroid/util/SparseArray;ILk8/qj;Lcom/yandex/div/core/view2/divs/pager/DivPagerPageOffsetProvider;Z)V", "Lk8/bk;", "Landroid/view/View;", "page", C4240b4.i.L, "", "apply", "(Lk8/bk;Landroid/view/View;F)V", "Lk8/uj;", "(Lk8/uj;Landroid/view/View;F)V", "Lcom/yandex/div/json/expressions/Expression;", "Lk8/c6;", "interpolator", "", "nextPageAlpha", "nextPageScale", "previousPageAlpha", "previousPageScale", "applyAlphaAndScale", "(Landroid/view/View;FLcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;Lcom/yandex/div/json/expressions/Expression;)V", "overlap", "applyOffset", "(Landroid/view/View;FZ)V", "pagePosition", "offset", "applyEvaluatedOffset", "(Landroid/view/View;IF)V", "interpolatedValue", "cornerAlpha", "applyPageAlpha", "(Landroid/view/View;FD)V", "cornerScale", "applyPageScale", "value1", "value2", "getInterpolation", "(DDF)D", "transformPage", "(Landroid/view/View;F)V", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "Landroid/util/SparseArray;", "I", "Lk8/qj;", "Lcom/yandex/div/core/view2/divs/pager/DivPagerPageOffsetProvider;", "Z", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivPagerPageTransformer implements ViewPager2.PageTransformer {
    private final boolean isHorizontal;

    @NotNull
    private final DivPagerPageOffsetProvider offsetProvider;

    @Nullable
    private final qj pageTransformation;

    @NotNull
    private final SparseArray<Float> pageTranslations;
    private final int parentSize;

    @NotNull
    private final RecyclerView recyclerView;

    @NotNull
    private final ExpressionResolver resolver;

    public DivPagerPageTransformer(@NotNull RecyclerView recyclerView, @NotNull ExpressionResolver expressionResolver, @NotNull SparseArray<Float> sparseArray, int i10, @Nullable qj qjVar, @NotNull DivPagerPageOffsetProvider divPagerPageOffsetProvider, boolean z10) {
        this.recyclerView = recyclerView;
        this.resolver = expressionResolver;
        this.pageTranslations = sparseArray;
        this.parentSize = i10;
        this.pageTransformation = qjVar;
        this.offsetProvider = divPagerPageOffsetProvider;
        this.isHorizontal = z10;
    }

    private final void apply(bk bkVar, View view, float f10) {
        applyAlphaAndScale(view, f10, bkVar.f86550a, bkVar.f86551b, bkVar.f86552c, bkVar.f86553d, bkVar.f86554e);
        applyOffset$default(this, view, f10, false, 2, null);
    }

    private final void applyAlphaAndScale(View view, float f10, Expression<c6> expression, Expression<Double> expression2, Expression<Double> expression3, Expression<Double> expression4, Expression<Double> expression5) {
        float interpolation = 1 - DivUtilKt.getAndroidInterpolator(expression.evaluate(this.resolver)).getInterpolation(Math.abs(g.i(g.d(f10, -1.0f), 1.0f)));
        if (f10 > 0.0f) {
            applyPageAlpha(view, interpolation, expression2.evaluate(this.resolver).doubleValue());
            applyPageScale(view, interpolation, expression3.evaluate(this.resolver).doubleValue());
        } else {
            applyPageAlpha(view, interpolation, expression4.evaluate(this.resolver).doubleValue());
            applyPageScale(view, interpolation, expression5.evaluate(this.resolver).doubleValue());
        }
    }

    private final void applyEvaluatedOffset(View view, int i10, float f10) {
        this.pageTranslations.put(i10, Float.valueOf(f10));
        if (this.isHorizontal) {
            view.setTranslationX(f10);
        } else {
            view.setTranslationY(f10);
        }
    }

    private final void applyOffset(View view, float f10, boolean z10) {
        int childAdapterPosition = this.recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        float f11 = -(z10 ? this.parentSize * f10 : this.offsetProvider.getPageOffset(f10, childAdapterPosition, this.pageTransformation instanceof qj.c));
        if (this.isHorizontal && ViewsKt.isLayoutRtl(this.recyclerView)) {
            f11 = -f11;
        }
        applyEvaluatedOffset(view, childAdapterPosition, f11);
    }

    static /* synthetic */ void applyOffset$default(DivPagerPageTransformer divPagerPageTransformer, View view, float f10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        divPagerPageTransformer.applyOffset(view, f10, z10);
    }

    private final void applyPageAlpha(View view, float f10, double d10) {
        int childAdapterPosition = this.recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = this.recyclerView.getAdapter();
        DivPagerAdapter divPagerAdapter = adapter instanceof DivPagerAdapter ? (DivPagerAdapter) adapter : null;
        if (divPagerAdapter == null) {
            return;
        }
        view.setAlpha((float) getInterpolation(((Number) divPagerAdapter.getItemsToShow().get(childAdapterPosition).getDiv().c().getAlpha().evaluate(this.resolver)).doubleValue(), d10, f10));
    }

    private final void applyPageScale(View view, float f10, double d10) {
        if (d10 == 1.0d) {
            return;
        }
        float interpolation = (float) getInterpolation(1.0d, d10, f10);
        view.setScaleX(interpolation);
        view.setScaleY(interpolation);
    }

    private final double getInterpolation(double value1, double value2, float interpolatedValue) {
        return Math.min(value1, value2) + (Math.abs(value2 - value1) * ((double) interpolatedValue));
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(@NotNull View page, float position) {
        qj qjVar = this.pageTransformation;
        Object objB = qjVar != null ? qjVar.b() : null;
        if (objB instanceof bk) {
            apply((bk) objB, page, position);
        } else if (objB instanceof uj) {
            apply((uj) objB, page, position);
        } else {
            applyOffset$default(this, page, position, false, 2, null);
        }
    }

    private final void apply(uj ujVar, View view, float f10) {
        applyAlphaAndScale(view, f10, ujVar.f91685a, ujVar.f91686b, ujVar.f91687c, ujVar.f91688d, ujVar.f91689e);
        if (f10 <= 0.0f && (f10 >= 0.0f || !((Boolean) ujVar.f91690f.evaluate(this.resolver)).booleanValue())) {
            applyOffset(view, f10, true);
            view.setTranslationZ(-Math.abs(f10));
        } else {
            applyOffset$default(this, view, f10, false, 2, null);
            view.setTranslationZ(0.0f);
        }
    }
}
