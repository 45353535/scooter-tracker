package com.yandex.div.core.view2.errors;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.widget.Toast;
import androidx.compose.material.TextFieldImplKt;
import androidx.webkit.internal.AssetHelper;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.yandex.div.DivDataTag;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.expression.ExpressionsRuntime;
import com.yandex.div.core.expression.local.RuntimeStore;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.view2.Binding;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.data.Variable;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.util.JsonNode;
import com.yandex.div.json.ParsingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k8.ea;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020&J\u0006\u0010'\u001a\u00020\u0017J\b\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020+H\u0002J\u0016\u0010,\u001a\u00020-2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001eH\u0002J\u0012\u0010/\u001a\u00020-2\b\b\u0002\u00100\u001a\u00020\u0007H\u0002J\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020 02J\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00170\u0015J\u0006\u00104\u001a\u00020\u0017J\u001a\u00105\u001a\u00020\u00102\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015J\u0016\u00107\u001a\u00020\u00172\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u000209J&\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00170<2\u0006\u0010=\u001a\u00020-H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b>\u0010?J\b\u0010@\u001a\u00020\u0017H\u0002J\u0016\u0010A\u001a\u00020-2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001eH\u0002R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u001a\u0010\u001bR,\u0010\u001c\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001e\u0012\u0004\u0012\u00020\u00170\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001f\u001a\u00020 *\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006B"}, d2 = {"Lcom/yandex/div/core/view2/errors/ErrorModel;", "", "errorCollectors", "Lcom/yandex/div/core/view2/errors/ErrorCollectors;", "div2View", "Lcom/yandex/div/core/view2/Div2View;", "visualErrorsEnabled", "", "(Lcom/yandex/div/core/view2/errors/ErrorCollectors;Lcom/yandex/div/core/view2/Div2View;Z)V", "currentErrors", "", "", "currentWarnings", "dataTag", "Lcom/yandex/div/DivDataTag;", "existingSubscription", "Lcom/yandex/div/core/Disposable;", "logcatErrorDumper", "Lcom/yandex/div/core/view2/errors/LogcatErrorDumper;", "observers", "", "Lkotlin/Function1;", "Lcom/yandex/div/core/view2/errors/ErrorViewModel;", "", "value", "state", "setState", "(Lcom/yandex/div/core/view2/errors/ErrorViewModel;)V", "updateOnErrors", "Lkotlin/Function2;", "", "variableController", "Lcom/yandex/div/core/expression/variables/VariableController;", "Lcom/yandex/div/core/expression/ExpressionsRuntime;", "getVariableController", "(Lcom/yandex/div/core/expression/ExpressionsRuntime;)Lcom/yandex/div/core/expression/variables/VariableController;", "bind", "binding", "Lcom/yandex/div/core/view2/Binding;", "copyReportToClipboard", "dumpCardWithContextVariables", "Lorg/json/JSONObject;", "dumpGlobalVariables", "Lorg/json/JSONArray;", "errorsToDetails", "", "errors", "generateReport", "dumpCardContent", "getAllControllers", "", "getErrorHandler", "hideDetails", "observeAndGet", "observer", "onCounterClick", "rootWidth", "", "rootHeight", "pasteToClipBoard", "Lkotlin/Result;", "s", "pasteToClipBoard-IoAF18A", "(Ljava/lang/String;)Ljava/lang/Object;", "showDetails", "warningsToDetails", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ErrorModel {

    @Nullable
    private DivDataTag dataTag;

    @NotNull
    private final Div2View div2View;

    @NotNull
    private final ErrorCollectors errorCollectors;

    @Nullable
    private Disposable existingSubscription;
    private final boolean visualErrorsEnabled;

    @NotNull
    private final Set<Function1<ErrorViewModel, Unit>> observers = new LinkedHashSet();

    @NotNull
    private final List<Throwable> currentErrors = new ArrayList();

    @NotNull
    private final List<Throwable> currentWarnings = new ArrayList();

    @NotNull
    private final LogcatErrorDumper logcatErrorDumper = new LogcatErrorDumper();

    @NotNull
    private final Function2<List<? extends Throwable>, List<? extends Throwable>, Unit> updateOnErrors = new Function2<List<? extends Throwable>, List<? extends Throwable>, Unit>() { // from class: com.yandex.div.core.view2.errors.ErrorModel$updateOnErrors$1
        {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Throwable> list, List<? extends Throwable> list2) {
            invoke2(list, list2);
            return Unit.f93236a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull List<? extends Throwable> list, @NotNull List<? extends Throwable> list2) {
            if (this.this$0.visualErrorsEnabled) {
                List list3 = this.this$0.currentErrors;
                list3.clear();
                List mutableList = CollectionsKt.toMutableList((Collection) list);
                CollectionsKt.reverse(mutableList);
                list3.addAll(mutableList);
                List list4 = this.this$0.currentWarnings;
                list4.clear();
                List mutableList2 = CollectionsKt.toMutableList((Collection) list2);
                CollectionsKt.reverse(mutableList2);
                list4.addAll(mutableList2);
                ErrorModel errorModel = this.this$0;
                ErrorViewModel errorViewModel = errorModel.state;
                int size = this.this$0.currentErrors.size();
                ErrorModel errorModel2 = this.this$0;
                String strErrorsToDetails = errorModel2.errorsToDetails(errorModel2.currentErrors);
                int size2 = this.this$0.currentWarnings.size();
                ErrorModel errorModel3 = this.this$0;
                errorModel.setState(ErrorViewModel.copy$default(errorViewModel, false, size, size2, strErrorsToDetails, errorModel3.warningsToDetails(errorModel3.currentWarnings), 1, null));
                this.this$0.logcatErrorDumper.logErrors(this.this$0.currentErrors, this.this$0.currentWarnings, this.this$0.dataTag);
            }
        }
    };

    @NotNull
    private ErrorViewModel state = new ErrorViewModel(false, 0, 0, null, null, 31, null);

    /* JADX INFO: renamed from: com.yandex.div.core.view2.errors.ErrorModel$getErrorHandler$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class AnonymousClass1 extends y implements Function1<Throwable, Unit> {
        AnonymousClass1(Object obj) {
            super(1, obj, DivActionTypedUtilsKt.class, "logError", "logError(Lcom/yandex/div/core/view2/Div2View;Ljava/lang/Throwable;)V", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f93236a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Throwable th2) {
            DivActionTypedUtilsKt.logError((Div2View) this.receiver, th2);
        }
    }

    public ErrorModel(@NotNull ErrorCollectors errorCollectors, @NotNull Div2View div2View, boolean z10) {
        this.errorCollectors = errorCollectors;
        this.div2View = div2View;
        this.visualErrorsEnabled = z10;
    }

    private final JSONObject dumpCardWithContextVariables() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("templates", new JSONObject());
        ea divData = this.div2View.getDivData();
        jSONObject.put("card", divData != null ? divData.writeToJSON() : null);
        jSONObject.put("variables", dumpGlobalVariables());
        return jSONObject;
    }

    private final JSONArray dumpGlobalVariables() {
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = this.div2View.getDiv2Component().getDivVariableController().captureAllVariables().iterator();
        while (it.hasNext()) {
            jSONArray.put(((Variable) it.next()).writeToJSON());
        }
        return jSONArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String errorsToDetails(List<? extends Throwable> errors) {
        return "Last 25 errors:\n" + CollectionsKt.joinToString$default(CollectionsKt.take(errors, 25), IOUtils.LINE_SEPARATOR_UNIX, null, null, 0, null, new Function1<Throwable, CharSequence>() { // from class: com.yandex.div.core.view2.errors.ErrorModel$errorsToDetails$errorsList$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(@NotNull Throwable th2) {
                if (!(th2 instanceof ParsingException)) {
                    return " - " + ErrorVisualMonitorKt.getFullStackMessage(th2);
                }
                return " - " + ((ParsingException) th2).getReason() + ": " + ErrorVisualMonitorKt.getFullStackMessage(th2);
            }
        }, 30, null);
    }

    private final String generateReport(boolean dumpCardContent) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (this.currentErrors.size() > 0) {
            JSONArray jSONArray = new JSONArray();
            for (Throwable th2 : this.currentErrors) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(PglCryptUtils.KEY_MESSAGE, ErrorVisualMonitorKt.getFullStackMessage(th2));
                jSONObject2.put("stacktrace", lf.c.b(th2));
                if (th2 instanceof ParsingException) {
                    ParsingException parsingException = (ParsingException) th2;
                    jSONObject2.put("reason", parsingException.getReason());
                    JsonNode source = parsingException.getSource();
                    jSONObject2.put("json_source", source != null ? source.dump() : null);
                    jSONObject2.put("json_summary", parsingException.getJsonSummary());
                }
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("errors", jSONArray);
        }
        if (this.currentWarnings.size() > 0) {
            JSONArray jSONArray2 = new JSONArray();
            for (Throwable th3 : this.currentWarnings) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("warning_message", th3.getMessage());
                jSONObject3.put("stacktrace", lf.c.b(th3));
                jSONArray2.put(jSONObject3);
            }
            jSONObject.put("warnings", jSONArray2);
        }
        if (dumpCardContent) {
            jSONObject.put("card", dumpCardWithContextVariables());
        }
        return jSONObject.toString(4);
    }

    static /* synthetic */ String generateReport$default(ErrorModel errorModel, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return errorModel.generateReport(z10);
    }

    private final VariableController getVariableController(ExpressionsRuntime expressionsRuntime) {
        return expressionsRuntime.getExpressionResolver().getVariableController();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeAndGet$lambda$0(ErrorModel errorModel, Function1 function1) {
        errorModel.observers.remove(function1);
    }

    /* JADX INFO: renamed from: pasteToClipBoard-IoAF18A, reason: not valid java name */
    private final Object m7609pasteToClipBoardIoAF18A(String s10) {
        Div2Context context$div_release = this.div2View.getContext();
        Object systemService = context$div_release.getSystemService("clipboard");
        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
        if (clipboardManager == null) {
            Assert.fail("Failed to access clipboard manager!");
            Result.Companion companion = Result.f93230c;
            return Result.b(Unit.f93236a);
        }
        try {
            clipboardManager.setPrimaryClip(new ClipData("Error report", new String[]{AssetHelper.DEFAULT_MIME_TYPE}, new ClipData.Item(s10)));
            Toast.makeText(context$div_release, "Errors, DivData and Variables are dumped to clipboard!", 1).show();
            Result.Companion companion2 = Result.f93230c;
            return Result.b(Unit.f93236a);
        } catch (Exception e10) {
            Result.Companion companion3 = Result.f93230c;
            return Result.b(d.a(new RuntimeException("Failed paste report to clipboard!", e10)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setState(ErrorViewModel errorViewModel) {
        this.state = errorViewModel;
        Iterator<T> it = this.observers.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(errorViewModel);
        }
    }

    private final void showDetails() {
        setState(ErrorViewModel.copy$default(this.state, true, 0, 0, null, null, 30, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String warningsToDetails(List<? extends Throwable> currentWarnings) {
        return "Last 25 warnings:\n" + CollectionsKt.joinToString$default(CollectionsKt.take(currentWarnings, 25), IOUtils.LINE_SEPARATOR_UNIX, null, null, 0, null, new Function1<Throwable, CharSequence>() { // from class: com.yandex.div.core.view2.errors.ErrorModel$warningsToDetails$warningsList$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(@NotNull Throwable th2) {
                return " - " + ErrorVisualMonitorKt.getFullStackMessage(th2);
            }
        }, 30, null);
    }

    public final void bind(@NotNull Binding binding) {
        this.dataTag = binding.getTag();
        Disposable disposable = this.existingSubscription;
        if (disposable != null) {
            disposable.close();
        }
        this.existingSubscription = this.errorCollectors.getOrCreate(binding.getTag(), binding.getData()).observeAndGet(this.updateOnErrors);
    }

    public final void copyReportToClipboard() {
        Throwable thG = Result.g(m7609pasteToClipBoardIoAF18A(generateReport$default(this, false, 1, null)));
        if (thG == null || !ErrorVisualMonitorKt.causedByTransactionTooLargeException(thG)) {
            return;
        }
        m7609pasteToClipBoardIoAF18A(generateReport(false));
    }

    @NotNull
    public final Map<String, VariableController> getAllControllers() {
        RuntimeStore runtimeStore$div_release = this.div2View.getRuntimeStore();
        Map<String, ExpressionsRuntime> uniquePathsAndRuntimes = runtimeStore$div_release.getUniquePathsAndRuntimes();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("", getVariableController(runtimeStore$div_release.getRootRuntime()));
        for (Map.Entry<String, ExpressionsRuntime> entry : uniquePathsAndRuntimes.entrySet()) {
            linkedHashMap.put(entry.getKey(), getVariableController(entry.getValue()));
        }
        return linkedHashMap;
    }

    @NotNull
    public final Function1<Throwable, Unit> getErrorHandler() {
        return new AnonymousClass1(this.div2View);
    }

    public final void hideDetails() {
        setState(ErrorViewModel.copy$default(this.state, false, 0, 0, null, null, 30, null));
    }

    @NotNull
    public final Disposable observeAndGet(@NotNull Function1<? super ErrorViewModel, Unit> observer) {
        this.observers.add(observer);
        observer.invoke(this.state);
        return new q7.b(this, observer);
    }

    public final void onCounterClick(int rootWidth, int rootHeight) {
        int iDpToPx = BaseDivViewExtensionsKt.dpToPx(Integer.valueOf(TextFieldImplKt.AnimationDuration), this.div2View.getContext().getResources().getDisplayMetrics());
        if (rootWidth < iDpToPx || rootHeight < iDpToPx) {
            copyReportToClipboard();
        } else {
            showDetails();
        }
    }
}
