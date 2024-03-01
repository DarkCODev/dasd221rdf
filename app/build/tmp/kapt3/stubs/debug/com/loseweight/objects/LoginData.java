package com.loseweight.objects;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0016"}, d2 = {"Lcom/loseweight/objects/LoginData;", "", "()V", "applicationUser", "Lcom/loseweight/objects/LoginData$ApplicationUser;", "getApplicationUser", "()Lcom/loseweight/objects/LoginData$ApplicationUser;", "setApplicationUser", "(Lcom/loseweight/objects/LoginData$ApplicationUser;)V", "operationResult", "Lcom/loseweight/objects/OperationResult;", "getOperationResult", "()Lcom/loseweight/objects/OperationResult;", "setOperationResult", "(Lcom/loseweight/objects/OperationResult;)V", "tokenID", "", "getTokenID", "()Ljava/lang/String;", "setTokenID", "(Ljava/lang/String;)V", "ApplicationUser", "app_debug"})
public final class LoginData {
    @com.google.gson.annotations.SerializedName(value = "tokenID")
    @com.google.gson.annotations.Expose
    @org.jetbrains.annotations.Nullable
    private java.lang.String tokenID;
    @com.google.gson.annotations.SerializedName(value = "applicationUser")
    @com.google.gson.annotations.Expose
    @org.jetbrains.annotations.Nullable
    private com.loseweight.objects.LoginData.ApplicationUser applicationUser;
    @com.google.gson.annotations.SerializedName(value = "operationResult")
    @com.google.gson.annotations.Expose
    @org.jetbrains.annotations.Nullable
    private com.loseweight.objects.OperationResult operationResult;
    
    public LoginData() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTokenID() {
        return null;
    }
    
    public final void setTokenID(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.loseweight.objects.LoginData.ApplicationUser getApplicationUser() {
        return null;
    }
    
    public final void setApplicationUser(@org.jetbrains.annotations.Nullable
    com.loseweight.objects.LoginData.ApplicationUser p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.loseweight.objects.OperationResult getOperationResult() {
        return null;
    }
    
    public final void setOperationResult(@org.jetbrains.annotations.Nullable
    com.loseweight.objects.OperationResult p0) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\"\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR \u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001e\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR \u0010\u0018\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR \u0010\u001b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR \u0010\u001e\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020$8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010%\"\u0004\b&\u0010\'R\u001e\u0010(\u001a\u00020$8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010%\"\u0004\b)\u0010\'R\u001e\u0010*\u001a\u00020$8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010%\"\u0004\b+\u0010\'R\u001e\u0010,\u001a\u00020$8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010%\"\u0004\b-\u0010\'R \u0010.\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\f\"\u0004\b0\u0010\u000eR \u00101\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\f\"\u0004\b3\u0010\u000eR \u00104\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010 \"\u0004\b6\u0010\"R \u00107\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\f\"\u0004\b9\u0010\u000eR\u001e\u0010:\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0006\"\u0004\b<\u0010\bR \u0010=\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\f\"\u0004\b?\u0010\u000eR\u001e\u0010@\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0006\"\u0004\bB\u0010\bR \u0010C\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\f\"\u0004\bE\u0010\u000e\u00a8\u0006F"}, d2 = {"Lcom/loseweight/objects/LoginData$ApplicationUser;", "", "()V", "customerId", "", "getCustomerId", "()I", "setCustomerId", "(I)V", "customerName", "", "getCustomerName", "()Ljava/lang/String;", "setCustomerName", "(Ljava/lang/String;)V", "emailId", "getEmailId", "setEmailId", "facilityCode", "getFacilityCode", "setFacilityCode", "facilityId", "getFacilityId", "setFacilityId", "facilityName", "getFacilityName", "setFacilityName", "firstName", "getFirstName", "setFirstName", "ipAddress", "getIpAddress", "()Ljava/lang/Object;", "setIpAddress", "(Ljava/lang/Object;)V", "isFirstTimeLogin", "", "()Z", "setFirstTimeLogin", "(Z)V", "isKeyTrackingEnabled", "setKeyTrackingEnabled", "isLoggingEnabled", "setLoggingEnabled", "isPasswordResetRequired", "setPasswordResetRequired", "lastName", "getLastName", "setLastName", "middleName", "getMiddleName", "setMiddleName", "phoneNumber", "getPhoneNumber", "setPhoneNumber", "roleName", "getRoleName", "setRoleName", "userId", "getUserId", "setUserId", "userName", "getUserName", "setUserName", "userRoleId", "getUserRoleId", "setUserRoleId", "welcomeName", "getWelcomeName", "setWelcomeName", "app_debug"})
    public static final class ApplicationUser {
        @com.google.gson.annotations.SerializedName(value = "userId")
        @com.google.gson.annotations.Expose
        private int userId = 0;
        @com.google.gson.annotations.SerializedName(value = "userName")
        @com.google.gson.annotations.Expose
        @org.jetbrains.annotations.Nullable
        private java.lang.String userName;
        @com.google.gson.annotations.SerializedName(value = "firstName")
        @com.google.gson.annotations.Expose
        @org.jetbrains.annotations.Nullable
        private java.lang.String firstName;
        @com.google.gson.annotations.SerializedName(value = "middleName")
        @com.google.gson.annotations.Expose
        @org.jetbrains.annotations.Nullable
        private java.lang.String middleName;
        @com.google.gson.annotations.SerializedName(value = "lastName")
        @com.google.gson.annotations.Expose
        @org.jetbrains.annotations.Nullable
        private java.lang.String lastName;
        @com.google.gson.annotations.SerializedName(value = "emailId")
        @com.google.gson.annotations.Expose
        @org.jetbrains.annotations.Nullable
        private java.lang.String emailId;
        @com.google.gson.annotations.SerializedName(value = "welcomeName")
        @com.google.gson.annotations.Expose
        @org.jetbrains.annotations.Nullable
        private java.lang.String welcomeName;
        @com.google.gson.annotations.SerializedName(value = "phoneNumber")
        @com.google.gson.annotations.Expose
        @org.jetbrains.annotations.Nullable
        private java.lang.Object phoneNumber;
        @com.google.gson.annotations.SerializedName(value = "userRoleId")
        @com.google.gson.annotations.Expose
        private int userRoleId = 0;
        @com.google.gson.annotations.SerializedName(value = "roleName")
        @com.google.gson.annotations.Expose
        @org.jetbrains.annotations.Nullable
        private java.lang.String roleName;
        @com.google.gson.annotations.SerializedName(value = "facilityId")
        @com.google.gson.annotations.Expose
        private int facilityId = 0;
        @com.google.gson.annotations.SerializedName(value = "facilityName")
        @com.google.gson.annotations.Expose
        @org.jetbrains.annotations.Nullable
        private java.lang.String facilityName;
        @com.google.gson.annotations.SerializedName(value = "facilityCode")
        @com.google.gson.annotations.Expose
        @org.jetbrains.annotations.Nullable
        private java.lang.String facilityCode;
        @com.google.gson.annotations.SerializedName(value = "customerId")
        @com.google.gson.annotations.Expose
        private int customerId = 0;
        @com.google.gson.annotations.SerializedName(value = "customerName")
        @com.google.gson.annotations.Expose
        @org.jetbrains.annotations.Nullable
        private java.lang.String customerName;
        @com.google.gson.annotations.SerializedName(value = "ipAddress")
        @com.google.gson.annotations.Expose
        @org.jetbrains.annotations.Nullable
        private java.lang.Object ipAddress;
        @com.google.gson.annotations.SerializedName(value = "isKeyTrackingEnabled")
        @com.google.gson.annotations.Expose
        private boolean isKeyTrackingEnabled = false;
        @com.google.gson.annotations.SerializedName(value = "isLoggingEnabled")
        @com.google.gson.annotations.Expose
        private boolean isLoggingEnabled = false;
        @com.google.gson.annotations.SerializedName(value = "isPasswordResetRequired")
        @com.google.gson.annotations.Expose
        private boolean isPasswordResetRequired = false;
        @com.google.gson.annotations.SerializedName(value = "isFirstTimeLogin")
        @com.google.gson.annotations.Expose
        private boolean isFirstTimeLogin = false;
        
        public ApplicationUser() {
            super();
        }
        
        public final int getUserId() {
            return 0;
        }
        
        public final void setUserId(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getUserName() {
            return null;
        }
        
        public final void setUserName(@org.jetbrains.annotations.Nullable
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getFirstName() {
            return null;
        }
        
        public final void setFirstName(@org.jetbrains.annotations.Nullable
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getMiddleName() {
            return null;
        }
        
        public final void setMiddleName(@org.jetbrains.annotations.Nullable
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getLastName() {
            return null;
        }
        
        public final void setLastName(@org.jetbrains.annotations.Nullable
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getEmailId() {
            return null;
        }
        
        public final void setEmailId(@org.jetbrains.annotations.Nullable
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getWelcomeName() {
            return null;
        }
        
        public final void setWelcomeName(@org.jetbrains.annotations.Nullable
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object getPhoneNumber() {
            return null;
        }
        
        public final void setPhoneNumber(@org.jetbrains.annotations.Nullable
        java.lang.Object p0) {
        }
        
        public final int getUserRoleId() {
            return 0;
        }
        
        public final void setUserRoleId(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getRoleName() {
            return null;
        }
        
        public final void setRoleName(@org.jetbrains.annotations.Nullable
        java.lang.String p0) {
        }
        
        public final int getFacilityId() {
            return 0;
        }
        
        public final void setFacilityId(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getFacilityName() {
            return null;
        }
        
        public final void setFacilityName(@org.jetbrains.annotations.Nullable
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getFacilityCode() {
            return null;
        }
        
        public final void setFacilityCode(@org.jetbrains.annotations.Nullable
        java.lang.String p0) {
        }
        
        public final int getCustomerId() {
            return 0;
        }
        
        public final void setCustomerId(int p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getCustomerName() {
            return null;
        }
        
        public final void setCustomerName(@org.jetbrains.annotations.Nullable
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object getIpAddress() {
            return null;
        }
        
        public final void setIpAddress(@org.jetbrains.annotations.Nullable
        java.lang.Object p0) {
        }
        
        public final boolean isKeyTrackingEnabled() {
            return false;
        }
        
        public final void setKeyTrackingEnabled(boolean p0) {
        }
        
        public final boolean isLoggingEnabled() {
            return false;
        }
        
        public final void setLoggingEnabled(boolean p0) {
        }
        
        public final boolean isPasswordResetRequired() {
            return false;
        }
        
        public final void setPasswordResetRequired(boolean p0) {
        }
        
        public final boolean isFirstTimeLogin() {
            return false;
        }
        
        public final void setFirstTimeLogin(boolean p0) {
        }
    }
}