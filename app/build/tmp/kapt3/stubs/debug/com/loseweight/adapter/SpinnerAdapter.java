package com.loseweight.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0002)*B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\bJ\u0014\u0010\u0018\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001aH\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001aH\u0016J\"\u0010!\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u001a2\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001aH\u0016J\u000e\u0010\'\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\rJ\u000e\u0010(\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\rR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\rX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/loseweight/adapter/SpinnerAdapter;", "Landroid/widget/BaseAdapter;", "Landroid/widget/Filterable;", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "data", "Ljava/util/ArrayList;", "Lcom/loseweight/objects/Spinner;", "dataSource", "infalter", "Landroid/view/LayoutInflater;", "isEnable", "", "isEnable$app_debug", "()Z", "setEnable$app_debug", "(Z)V", "isFilterable", "isFilterable$app_debug", "setFilterable$app_debug", "add", "", "files", "addAll", "getCount", "", "getFilter", "Landroid/widget/Filter;", "getItem", "position", "getItemId", "", "getView", "Landroid/view/View;", "convertView", "parent", "Landroid/view/ViewGroup;", "isEnabled", "setFilterable", "setParentCategEnabled", "PTypeFilter", "ViewHolder", "app_debug"})
public final class SpinnerAdapter extends android.widget.BaseAdapter implements android.widget.Filterable {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context mContext = null;
    @org.jetbrains.annotations.NotNull
    private final android.view.LayoutInflater infalter = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<com.loseweight.objects.Spinner> data = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<com.loseweight.objects.Spinner> dataSource = null;
    private boolean isEnable = true;
    private boolean isFilterable = false;
    
    public SpinnerAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context mContext) {
        super();
    }
    
    public final boolean isEnable$app_debug() {
        return false;
    }
    
    public final void setEnable$app_debug(boolean p0) {
    }
    
    public final boolean isFilterable$app_debug() {
        return false;
    }
    
    public final void setFilterable$app_debug(boolean p0) {
    }
    
    @java.lang.Override
    public int getCount() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.loseweight.objects.Spinner getItem(int position) {
        return null;
    }
    
    @java.lang.Override
    public long getItemId(int position) {
        return 0L;
    }
    
    public final void addAll(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.loseweight.objects.Spinner> files) {
    }
    
    public final void add(@org.jetbrains.annotations.NotNull
    com.loseweight.objects.Spinner files) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public android.view.View getView(int position, @org.jetbrains.annotations.Nullable
    android.view.View convertView, @org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent) {
        return null;
    }
    
    public final void setParentCategEnabled(boolean isEnable) {
    }
    
    @java.lang.Override
    public boolean isEnabled(int position) {
        return false;
    }
    
    public final void setFilterable(boolean isFilterable) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public android.widget.Filter getFilter() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0014\u00a8\u0006\n"}, d2 = {"Lcom/loseweight/adapter/SpinnerAdapter$PTypeFilter;", "Landroid/widget/Filter;", "(Lcom/loseweight/adapter/SpinnerAdapter;)V", "performFiltering", "Landroid/widget/Filter$FilterResults;", "prefix", "", "publishResults", "", "results", "app_debug"})
    final class PTypeFilter extends android.widget.Filter {
        
        public PTypeFilter() {
            super();
        }
        
        @java.lang.Override
        protected void publishResults(@org.jetbrains.annotations.NotNull
        java.lang.CharSequence prefix, @org.jetbrains.annotations.NotNull
        android.widget.Filter.FilterResults results) {
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        protected android.widget.Filter.FilterResults performFiltering(@org.jetbrains.annotations.Nullable
        java.lang.CharSequence prefix) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/loseweight/adapter/SpinnerAdapter$ViewHolder;", "", "(Lcom/loseweight/adapter/SpinnerAdapter;)V", "tvMenuTitle", "Landroid/widget/TextView;", "getTvMenuTitle$app_debug", "()Landroid/widget/TextView;", "setTvMenuTitle$app_debug", "(Landroid/widget/TextView;)V", "app_debug"})
    public final class ViewHolder {
        @org.jetbrains.annotations.Nullable
        private android.widget.TextView tvMenuTitle;
        
        public ViewHolder() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final android.widget.TextView getTvMenuTitle$app_debug() {
            return null;
        }
        
        public final void setTvMenuTitle$app_debug(@org.jetbrains.annotations.Nullable
        android.widget.TextView p0) {
        }
    }
}