package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class TransitionValues {

    @SuppressLint({"UnknownNullness"})
    public View view;
    public final Map<String, Object> values = new HashMap();
    final ArrayList<Transition> mTargetedTransitions = new ArrayList<>();

    @Deprecated
    public TransitionValues() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TransitionValues)) {
            return false;
        }
        TransitionValues transitionValues = (TransitionValues) obj;
        return this.view == transitionValues.view && this.values.equals(transitionValues.values);
    }

    public int hashCode() {
        return (this.view.hashCode() * 31) + this.values.hashCode();
    }

    @NonNull
    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.view + IOUtils.LINE_SEPARATOR_UNIX) + "    values:";
        for (String str2 : this.values.keySet()) {
            str = str + "    " + str2 + ": " + this.values.get(str2) + IOUtils.LINE_SEPARATOR_UNIX;
        }
        return str;
    }

    public TransitionValues(@NonNull View view) {
        this.view = view;
    }
}
