package com.yandex.div.core.view2.errors;

import com.my.target.common.menu.MenuActionType;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.yandex.div.R$drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0080\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\rJB\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/yandex/div/core/view2/errors/ErrorViewModel;", "", "", "showDetails", "", "errorCount", "warningCount", "", "errorDetails", "warningDetails", "<init>", "(ZIILjava/lang/String;Ljava/lang/String;)V", "getDetails", "()Ljava/lang/String;", "getCounterBackground", "()I", "getCounterText", MenuActionType.COPY, "(ZIILjava/lang/String;Ljava/lang/String;)Lcom/yandex/div/core/view2/errors/ErrorViewModel;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShowDetails", "()Z", "I", "Ljava/lang/String;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ErrorViewModel {
    private final int errorCount;

    @NotNull
    private final String errorDetails;
    private final boolean showDetails;
    private final int warningCount;

    @NotNull
    private final String warningDetails;

    public ErrorViewModel(boolean z10, int i10, int i11, @NotNull String str, @NotNull String str2) {
        this.showDetails = z10;
        this.errorCount = i10;
        this.warningCount = i11;
        this.errorDetails = str;
        this.warningDetails = str2;
    }

    public static /* synthetic */ ErrorViewModel copy$default(ErrorViewModel errorViewModel, boolean z10, int i10, int i11, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z10 = errorViewModel.showDetails;
        }
        if ((i12 & 2) != 0) {
            i10 = errorViewModel.errorCount;
        }
        if ((i12 & 4) != 0) {
            i11 = errorViewModel.warningCount;
        }
        if ((i12 & 8) != 0) {
            str = errorViewModel.errorDetails;
        }
        if ((i12 & 16) != 0) {
            str2 = errorViewModel.warningDetails;
        }
        String str3 = str2;
        int i13 = i11;
        return errorViewModel.copy(z10, i10, i13, str, str3);
    }

    @NotNull
    public final ErrorViewModel copy(boolean showDetails, int errorCount, int warningCount, @NotNull String errorDetails, @NotNull String warningDetails) {
        return new ErrorViewModel(showDetails, errorCount, warningCount, errorDetails, warningDetails);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorViewModel)) {
            return false;
        }
        ErrorViewModel errorViewModel = (ErrorViewModel) other;
        return this.showDetails == errorViewModel.showDetails && this.errorCount == errorViewModel.errorCount && this.warningCount == errorViewModel.warningCount && Intrinsics.areEqual(this.errorDetails, errorViewModel.errorDetails) && Intrinsics.areEqual(this.warningDetails, errorViewModel.warningDetails);
    }

    public final int getCounterBackground() {
        int i10 = this.warningCount;
        return (i10 <= 0 || this.errorCount <= 0) ? (i10 == 0 && this.errorCount == 0) ? R$drawable.neutral_counter_background : i10 > 0 ? R$drawable.warning_counter_background : R$drawable.error_counter_background : R$drawable.warning_error_counter_background;
    }

    @NotNull
    public final String getCounterText() {
        int i10 = this.errorCount;
        if (i10 <= 0 || this.warningCount <= 0) {
            int i11 = this.warningCount;
            return i11 > 0 ? String.valueOf(i11) : i10 > 0 ? String.valueOf(i10) : "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.errorCount);
        sb2.append(IOUtils.DIR_SEPARATOR_UNIX);
        sb2.append(this.warningCount);
        return sb2.toString();
    }

    @NotNull
    public final String getDetails() {
        if (this.errorCount <= 0 || this.warningCount <= 0) {
            return this.warningCount > 0 ? this.warningDetails : this.errorDetails;
        }
        return this.errorDetails + "\n\n" + this.warningDetails;
    }

    public final boolean getShowDetails() {
        return this.showDetails;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    public int hashCode() {
        boolean z10 = this.showDetails;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        return (((((((r02 * 31) + this.errorCount) * 31) + this.warningCount) * 31) + this.errorDetails.hashCode()) * 31) + this.warningDetails.hashCode();
    }

    @NotNull
    public String toString() {
        return "ErrorViewModel(showDetails=" + this.showDetails + ", errorCount=" + this.errorCount + ", warningCount=" + this.warningCount + ", errorDetails=" + this.errorDetails + ", warningDetails=" + this.warningDetails + ')';
    }

    public /* synthetic */ ErrorViewModel(boolean z10, int i10, int i11, String str, String str2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? false : z10, (i12 & 2) != 0 ? 0 : i10, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? "" : str, (i12 & 16) != 0 ? "" : str2);
    }
}
