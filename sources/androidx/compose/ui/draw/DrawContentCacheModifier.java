package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000b*\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u001c\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ0\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u001aR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\u001c¨\u0006&"}, d2 = {"Landroidx/compose/ui/draw/DrawContentCacheModifier;", "Landroidx/compose/ui/draw/DrawCacheModifier;", "Landroidx/compose/ui/draw/CacheDrawScope;", "cacheDrawScope", "Lkotlin/Function1;", "Landroidx/compose/ui/draw/DrawResult;", "onBuildDrawCache", "<init>", "(Landroidx/compose/ui/draw/CacheDrawScope;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/draw/BuildDrawCacheParams;", "params", "", "onBuildCache", "(Landroidx/compose/ui/draw/BuildDrawCacheParams;)V", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "component1", "()Landroidx/compose/ui/draw/CacheDrawScope;", "component2", "()Lkotlin/jvm/functions/Function1;", MenuActionType.COPY, "(Landroidx/compose/ui/draw/CacheDrawScope;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/draw/DrawContentCacheModifier;", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/draw/CacheDrawScope;", "getCacheDrawScope", "Lkotlin/jvm/functions/Function1;", "getOnBuildDrawCache", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final /* data */ class DrawContentCacheModifier implements DrawCacheModifier {

    @NotNull
    private final CacheDrawScope cacheDrawScope;

    @NotNull
    private final Function1<CacheDrawScope, DrawResult> onBuildDrawCache;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawContentCacheModifier(@NotNull CacheDrawScope cacheDrawScope, @NotNull Function1<? super CacheDrawScope, DrawResult> onBuildDrawCache) {
        Intrinsics.checkNotNullParameter(cacheDrawScope, "cacheDrawScope");
        Intrinsics.checkNotNullParameter(onBuildDrawCache, "onBuildDrawCache");
        this.cacheDrawScope = cacheDrawScope;
        this.onBuildDrawCache = onBuildDrawCache;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DrawContentCacheModifier copy$default(DrawContentCacheModifier drawContentCacheModifier, CacheDrawScope cacheDrawScope, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cacheDrawScope = drawContentCacheModifier.cacheDrawScope;
        }
        if ((i10 & 2) != 0) {
            function1 = drawContentCacheModifier.onBuildDrawCache;
        }
        return drawContentCacheModifier.copy(cacheDrawScope, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return androidx.compose.ui.b.a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return androidx.compose.ui.b.b(this, function1);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CacheDrawScope getCacheDrawScope() {
        return this.cacheDrawScope;
    }

    @NotNull
    public final Function1<CacheDrawScope, DrawResult> component2() {
        return this.onBuildDrawCache;
    }

    @NotNull
    public final DrawContentCacheModifier copy(@NotNull CacheDrawScope cacheDrawScope, @NotNull Function1<? super CacheDrawScope, DrawResult> onBuildDrawCache) {
        Intrinsics.checkNotNullParameter(cacheDrawScope, "cacheDrawScope");
        Intrinsics.checkNotNullParameter(onBuildDrawCache, "onBuildDrawCache");
        return new DrawContentCacheModifier(cacheDrawScope, onBuildDrawCache);
    }

    @Override // androidx.compose.ui.draw.DrawModifier
    public void draw(@NotNull ContentDrawScope contentDrawScope) {
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        DrawResult drawResult = this.cacheDrawScope.getDrawResult();
        Intrinsics.checkNotNull(drawResult);
        drawResult.getBlock$ui_release().invoke(contentDrawScope);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrawContentCacheModifier)) {
            return false;
        }
        DrawContentCacheModifier drawContentCacheModifier = (DrawContentCacheModifier) other;
        return Intrinsics.areEqual(this.cacheDrawScope, drawContentCacheModifier.cacheDrawScope) && Intrinsics.areEqual(this.onBuildDrawCache, drawContentCacheModifier.onBuildDrawCache);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return androidx.compose.ui.b.c(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return androidx.compose.ui.b.d(this, obj, function2);
    }

    @NotNull
    public final CacheDrawScope getCacheDrawScope() {
        return this.cacheDrawScope;
    }

    @NotNull
    public final Function1<CacheDrawScope, DrawResult> getOnBuildDrawCache() {
        return this.onBuildDrawCache;
    }

    public int hashCode() {
        return (this.cacheDrawScope.hashCode() * 31) + this.onBuildDrawCache.hashCode();
    }

    @Override // androidx.compose.ui.draw.DrawCacheModifier
    public void onBuildCache(@NotNull BuildDrawCacheParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        CacheDrawScope cacheDrawScope = this.cacheDrawScope;
        cacheDrawScope.setCacheParams$ui_release(params);
        cacheDrawScope.setDrawResult$ui_release(null);
        this.onBuildDrawCache.invoke(cacheDrawScope);
        if (cacheDrawScope.getDrawResult() == null) {
            throw new IllegalStateException("DrawResult not defined, did you forget to call onDraw?");
        }
    }

    @Override // androidx.compose.ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return androidx.compose.ui.a.a(this, modifier);
    }

    @NotNull
    public String toString() {
        return "DrawContentCacheModifier(cacheDrawScope=" + this.cacheDrawScope + ", onBuildDrawCache=" + this.onBuildDrawCache + ')';
    }
}
