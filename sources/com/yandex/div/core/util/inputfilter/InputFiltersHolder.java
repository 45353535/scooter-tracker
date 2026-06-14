package com.yandex.div.core.util.inputfilter;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0006H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/yandex/div/core/util/inputfilter/InputFiltersHolder;", "Lcom/yandex/div/core/util/inputfilter/BaseInputFilter;", "filters", "", "(Ljava/util/List;)V", "currentValue", "", "getCurrentValue", "()Ljava/lang/String;", "setCurrentValue", "(Ljava/lang/String;)V", "cursorPosition", "", "getCursorPosition", "()I", "setCursorPosition", "(I)V", "checkValue", "", "value", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class InputFiltersHolder implements BaseInputFilter {

    @NotNull
    private String currentValue = "";
    private int cursorPosition;

    @NotNull
    private final List<BaseInputFilter> filters;

    /* JADX WARN: Multi-variable type inference failed */
    public InputFiltersHolder(@NotNull List<? extends BaseInputFilter> list) {
        this.filters = list;
    }

    @Override // com.yandex.div.core.util.inputfilter.BaseInputFilter
    public boolean checkValue(@NotNull String value) {
        List<BaseInputFilter> list = this.filters;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((BaseInputFilter) it.next()).checkValue(value)) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public final String getCurrentValue() {
        return this.currentValue;
    }

    public final int getCursorPosition() {
        return this.cursorPosition;
    }

    public final void setCurrentValue(@NotNull String str) {
        this.currentValue = str;
    }

    public final void setCursorPosition(int i10) {
        this.cursorPosition = i10;
    }
}
