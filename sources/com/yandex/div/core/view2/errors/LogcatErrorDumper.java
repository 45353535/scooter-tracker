package com.yandex.div.core.view2.errors;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.yandex.div.DivDataTag;
import com.yandex.div.internal.KLog;
import com.yandex.div.json.ParsingException;
import com.yandex.div.logging.Severity;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0002J,\u0010\u000b\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/yandex/div/core/view2/errors/LogcatErrorDumper;", "", "()V", "loggedErrors", "", "", "loggedWarnings", "errorsToDetails", "", "errors", "", "logErrors", "", "warnings", "dataTag", "Lcom/yandex/div/DivDataTag;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LogcatErrorDumper {

    @NotNull
    private final Set<Throwable> loggedErrors = new LinkedHashSet();

    @NotNull
    private final Set<Throwable> loggedWarnings = new LinkedHashSet();

    private final String errorsToDetails(List<? extends Throwable> errors) {
        return CollectionsKt.joinToString$default(errors, IOUtils.LINE_SEPARATOR_UNIX, null, null, 0, null, new Function1<Throwable, CharSequence>() { // from class: com.yandex.div.core.view2.errors.LogcatErrorDumper.errorsToDetails.1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(@NotNull Throwable th2) {
                if (!(th2 instanceof ParsingException)) {
                    return " - " + lf.c.b(th2);
                }
                return " - " + ((ParsingException) th2).getReason() + ": " + lf.c.b(th2);
            }
        }, 30, null);
    }

    public final void logErrors(@NotNull List<? extends Throwable> errors, @NotNull List<? extends Throwable> warnings, @Nullable DivDataTag dataTag) {
        if (errors.isEmpty() && warnings.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : errors) {
            if (this.loggedErrors.add((Throwable) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : warnings) {
            if (this.loggedWarnings.add((Throwable) obj2)) {
                arrayList2.add(obj2);
            }
        }
        if (!arrayList.isEmpty()) {
            KLog kLog = KLog.INSTANCE;
            Severity severity = Severity.ERROR;
            if (kLog.isAtLeast(severity)) {
                kLog.print(6, "ErrorVisualMonitor", "=== DIV VISUAL ERROR MONITOR - NEW ERRORS DETECTED ===");
            }
            if (kLog.isAtLeast(severity)) {
                kLog.print(6, "ErrorVisualMonitor", errorsToDetails(arrayList));
            }
        }
        if (!arrayList2.isEmpty()) {
            KLog kLog2 = KLog.INSTANCE;
            Severity severity2 = Severity.WARNING;
            if (kLog2.isAtLeast(severity2)) {
                kLog2.print(5, "ErrorVisualMonitor", "=== DIV VISUAL ERROR MONITOR - NEW WARNINGS DETECTED ===");
            }
            if (kLog2.isAtLeast(severity2)) {
                kLog2.print(5, "ErrorVisualMonitor", errorsToDetails(arrayList2));
            }
        }
        if (arrayList.isEmpty() && arrayList2.isEmpty()) {
            return;
        }
        KLog kLog3 = KLog.INSTANCE;
        if (kLog3.isAtLeast(Severity.INFO)) {
            kLog3.print(4, "ErrorVisualMonitor", "DataTag '" + dataTag + "'. New errors: " + arrayList.size() + ", New warnings: " + arrayList2.size() + ". Total errors: " + errors.size() + ", Total warnings: " + warnings.size());
        }
    }
}
