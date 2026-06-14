package androidx.compose.ui.autofill;

import android.util.Log;
import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Rect;
import e.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lf.n;
import org.jetbrains.annotations.NotNull;
import zf.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0001¨\u0006\t"}, d2 = {"performAutofill", "", "Landroidx/compose/ui/autofill/AndroidAutofill;", "values", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "populateViewStructure", "root", "Landroid/view/ViewStructure;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AndroidAutofill_androidKt {
    @RequiresApi(26)
    @ExperimentalComposeUiApi
    public static final void performAutofill(@NotNull AndroidAutofill androidAutofill, @NotNull SparseArray<AutofillValue> values) {
        Intrinsics.checkNotNullParameter(androidAutofill, "<this>");
        Intrinsics.checkNotNullParameter(values, "values");
        int size = values.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iKeyAt = values.keyAt(i10);
            AutofillValue value = f.a(values.get(iKeyAt));
            AutofillApi26Helper autofillApi26Helper = AutofillApi26Helper.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(value, "value");
            if (autofillApi26Helper.isText(value)) {
                androidAutofill.getAutofillTree().performAutofill(iKeyAt, autofillApi26Helper.textValue(value).toString());
            } else {
                if (autofillApi26Helper.isDate(value)) {
                    throw new n("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (autofillApi26Helper.isList(value)) {
                    throw new n("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (autofillApi26Helper.isToggle(value)) {
                    throw new n("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    @RequiresApi(26)
    @ExperimentalComposeUiApi
    public static final void populateViewStructure(@NotNull AndroidAutofill androidAutofill, @NotNull ViewStructure root) {
        Intrinsics.checkNotNullParameter(androidAutofill, "<this>");
        Intrinsics.checkNotNullParameter(root, "root");
        int iAddChildCount = AutofillApi23Helper.INSTANCE.addChildCount(root, androidAutofill.getAutofillTree().getChildren().size());
        for (Map.Entry<Integer, AutofillNode> entry : androidAutofill.getAutofillTree().getChildren().entrySet()) {
            int iIntValue = entry.getKey().intValue();
            AutofillNode value = entry.getValue();
            AutofillApi23Helper autofillApi23Helper = AutofillApi23Helper.INSTANCE;
            ViewStructure viewStructureNewChild = autofillApi23Helper.newChild(root, iAddChildCount);
            if (viewStructureNewChild != null) {
                AutofillApi26Helper autofillApi26Helper = AutofillApi26Helper.INSTANCE;
                AutofillId autofillId = autofillApi26Helper.getAutofillId(root);
                Intrinsics.checkNotNull(autofillId);
                autofillApi26Helper.setAutofillId(viewStructureNewChild, autofillId, iIntValue);
                autofillApi23Helper.setId(viewStructureNewChild, iIntValue, androidAutofill.getView().getContext().getPackageName(), null, null);
                autofillApi26Helper.setAutofillType(viewStructureNewChild, 1);
                List<AutofillType> autofillTypes = value.getAutofillTypes();
                ArrayList arrayList = new ArrayList(autofillTypes.size());
                int size = autofillTypes.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(AndroidAutofillType_androidKt.getAndroidType(autofillTypes.get(i10)));
                }
                autofillApi26Helper.setAutofillHints(viewStructureNewChild, (String[]) arrayList.toArray(new String[0]));
                Rect boundingBox = value.getBoundingBox();
                if (boundingBox == null) {
                    Log.w("Autofill Warning", "Bounding box not set.\n                        Did you call perform autofillTree before the component was positioned? ");
                } else {
                    int iD = a.d(boundingBox.getLeft());
                    int iD2 = a.d(boundingBox.getTop());
                    int iD3 = a.d(boundingBox.getRight());
                    AutofillApi23Helper.INSTANCE.setDimens(viewStructureNewChild, iD, iD2, 0, 0, iD3 - iD, a.d(boundingBox.getBottom()) - iD2);
                }
            }
            iAddChildCount++;
        }
    }
}
