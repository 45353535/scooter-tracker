package com.yandex.div.core.view2.divs.pager;

import com.ironsource.C4240b4;
import k8.jk;
import kotlin.Metadata;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\t\b \u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/div/core/view2/divs/pager/DivPagerPageSizeProvider;", "", "", "parentSize", "Lcom/yandex/div/core/view2/divs/pager/DivPagerPaddingsHolder;", "paddings", "Lk8/jk$c;", "alignment", "<init>", "(ILcom/yandex/div/core/view2/divs/pager/DivPagerPaddingsHolder;Lk8/jk$c;)V", C4240b4.i.L, "", "getCenteredNeighbourSize", "(I)Ljava/lang/Float;", "getItemSize", "getPrevNeighbourSize", "getNextNeighbourSize", "I", "Lcom/yandex/div/core/view2/divs/pager/DivPagerPaddingsHolder;", "Lk8/jk$c;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class DivPagerPageSizeProvider {

    @NotNull
    private final jk.c alignment;

    @NotNull
    private final DivPagerPaddingsHolder paddings;
    private final int parentSize;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[jk.c.values().length];
            try {
                iArr[jk.c.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[jk.c.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[jk.c.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DivPagerPageSizeProvider(int i10, @NotNull DivPagerPaddingsHolder divPagerPaddingsHolder, @NotNull jk.c cVar) {
        this.parentSize = i10;
        this.paddings = divPagerPaddingsHolder;
        this.alignment = cVar;
    }

    private final Float getCenteredNeighbourSize(int position) {
        Float itemSize = getItemSize(position);
        if (itemSize == null) {
            return null;
        }
        return Float.valueOf((this.parentSize - itemSize.floatValue()) / 2.0f);
    }

    @Nullable
    public abstract Float getItemSize(int position);

    @Nullable
    public final Float getNextNeighbourSize(int position) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.alignment.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return getCenteredNeighbourSize(position);
            }
            if (i10 == 3) {
                return Float.valueOf(this.paddings.getEnd());
            }
            throw new m();
        }
        Float itemSize = getItemSize(position);
        if (itemSize == null) {
            return null;
        }
        return Float.valueOf((this.parentSize - this.paddings.getStart()) - itemSize.floatValue());
    }

    @Nullable
    public final Float getPrevNeighbourSize(int position) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.alignment.ordinal()];
        if (i10 == 1) {
            return Float.valueOf(this.paddings.getStart());
        }
        if (i10 == 2) {
            return getCenteredNeighbourSize(position);
        }
        if (i10 != 3) {
            throw new m();
        }
        Float itemSize = getItemSize(position);
        if (itemSize == null) {
            return null;
        }
        return Float.valueOf((this.parentSize - this.paddings.getEnd()) - itemSize.floatValue());
    }
}
