package com.yandex.div.core.view2.errors;

import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.C4240b4;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0016\u0017B+\u0012\"\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R0\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/yandex/div/core/view2/errors/VariableAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/yandex/div/core/view2/errors/VariableModel;", "Lcom/yandex/div/core/view2/errors/VariableAdapter$VariableViewHolder;", "Lkotlin/Function3;", "", "", "Lcom/yandex/div/core/view2/errors/VariableMutator;", "variableMutator", "<init>", "(Lkotlin/jvm/functions/Function3;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/yandex/div/core/view2/errors/VariableAdapter$VariableViewHolder;", "holder", C4240b4.i.L, "onBindViewHolder", "(Lcom/yandex/div/core/view2/errors/VariableAdapter$VariableViewHolder;I)V", "Lkotlin/jvm/functions/Function3;", "VariableDiffUtilCallback", "VariableViewHolder", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class VariableAdapter extends ListAdapter<VariableModel, VariableViewHolder> {

    @NotNull
    private final Function3<String, String, String, Unit> variableMutator;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/yandex/div/core/view2/errors/VariableAdapter$VariableDiffUtilCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/yandex/div/core/view2/errors/VariableModel;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class VariableDiffUtilCallback extends DiffUtil.ItemCallback<VariableModel> {
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(@NotNull VariableModel oldItem, @NotNull VariableModel newItem) {
            return Intrinsics.areEqual(oldItem.getValue(), newItem.getValue());
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(@NotNull VariableModel oldItem, @NotNull VariableModel newItem) {
            return Intrinsics.areEqual(oldItem.getName(), newItem.getName());
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\"\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\u0005*\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R0\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/div/core/view2/errors/VariableAdapter$VariableViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/yandex/div/core/view2/errors/VariableView;", "root", "Lkotlin/Function3;", "", "", "Lcom/yandex/div/core/view2/errors/VariableMutator;", "variableMutator", "<init>", "(Lcom/yandex/div/core/view2/errors/VariableView;Lkotlin/jvm/functions/Function3;)V", "Lcom/yandex/div/core/view2/errors/VariableModel;", "fullName", "(Lcom/yandex/div/core/view2/errors/VariableModel;)Ljava/lang/String;", "", "inputType", "(Lcom/yandex/div/core/view2/errors/VariableModel;)I", "variable", "bind", "(Lcom/yandex/div/core/view2/errors/VariableModel;)V", "Lcom/yandex/div/core/view2/errors/VariableView;", "Lkotlin/jvm/functions/Function3;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class VariableViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        private final VariableView root;

        @NotNull
        private final Function3<String, String, String, Unit> variableMutator;

        /* JADX WARN: Multi-variable type inference failed */
        public VariableViewHolder(@NotNull VariableView variableView, @NotNull Function3<? super String, ? super String, ? super String, Unit> function3) {
            super(variableView);
            this.root = variableView;
            this.variableMutator = function3;
        }

        private final String fullName(VariableModel variableModel) {
            if (variableModel.getPath().length() <= 0) {
                return variableModel.getName();
            }
            return variableModel.getPath() + IOUtils.DIR_SEPARATOR_UNIX + variableModel.getName();
        }

        private final int inputType(VariableModel variableModel) {
            String type = variableModel.getType();
            return Intrinsics.areEqual(type, "number") ? true : Intrinsics.areEqual(type, TypedValues.Custom.S_INT) ? 2 : 1;
        }

        public final void bind(@NotNull final VariableModel variable) {
            VariableView variableView = this.root;
            variableView.getNameText().setText(fullName(variable));
            variableView.getTypeText().setText(variable.getType());
            variableView.getValueText().setText(variable.getValue());
            variableView.getValueText().setInputType(inputType(variable));
            variableView.setOnEnterAction(new Function1<String, Unit>() { // from class: com.yandex.div.core.view2.errors.VariableAdapter$VariableViewHolder$bind$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull String str) {
                    this.this$0.variableMutator.invoke(variable.getName(), variable.getPath(), str);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VariableAdapter(@NotNull Function3<? super String, ? super String, ? super String, Unit> function3) {
        super(new VariableDiffUtilCallback());
        this.variableMutator = function3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull VariableViewHolder holder, int position) {
        holder.bind(getCurrentList().get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public VariableViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new VariableViewHolder(new VariableView(parent.getContext()), this.variableMutator);
    }
}
