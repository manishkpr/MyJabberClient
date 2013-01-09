/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /Users/munish/Documents/Jan 13/MyJabber/src/org/yaxim/androidclient/service/IXMPPRosterService.aidl
 */
package org.yaxim.androidclient.service;
public interface IXMPPRosterService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements org.yaxim.androidclient.service.IXMPPRosterService
{
private static final java.lang.String DESCRIPTOR = "org.yaxim.androidclient.service.IXMPPRosterService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an org.yaxim.androidclient.service.IXMPPRosterService interface,
 * generating a proxy if needed.
 */
public static org.yaxim.androidclient.service.IXMPPRosterService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof org.yaxim.androidclient.service.IXMPPRosterService))) {
return ((org.yaxim.androidclient.service.IXMPPRosterService)iin);
}
return new org.yaxim.androidclient.service.IXMPPRosterService.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_getConnectionState:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getConnectionState();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getConnectionStateString:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getConnectionStateString();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_setStatusFromConfig:
{
data.enforceInterface(DESCRIPTOR);
this.setStatusFromConfig();
reply.writeNoException();
return true;
}
case TRANSACTION_disconnect:
{
data.enforceInterface(DESCRIPTOR);
this.disconnect();
reply.writeNoException();
return true;
}
case TRANSACTION_connect:
{
data.enforceInterface(DESCRIPTOR);
this.connect();
reply.writeNoException();
return true;
}
case TRANSACTION_addRosterItem:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
this.addRosterItem(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_addRosterGroup:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.addRosterGroup(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_renameRosterGroup:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
this.renameRosterGroup(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_removeRosterItem:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.removeRosterItem(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_requestAuthorizationForRosterItem:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.requestAuthorizationForRosterItem(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_renameRosterItem:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
this.renameRosterItem(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_moveRosterItemToGroup:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
this.moveRosterItemToGroup(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_registerRosterCallback:
{
data.enforceInterface(DESCRIPTOR);
org.yaxim.androidclient.IXMPPRosterCallback _arg0;
_arg0 = org.yaxim.androidclient.IXMPPRosterCallback.Stub.asInterface(data.readStrongBinder());
this.registerRosterCallback(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterRosterCallback:
{
data.enforceInterface(DESCRIPTOR);
org.yaxim.androidclient.IXMPPRosterCallback _arg0;
_arg0 = org.yaxim.androidclient.IXMPPRosterCallback.Stub.asInterface(data.readStrongBinder());
this.unregisterRosterCallback(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements org.yaxim.androidclient.service.IXMPPRosterService
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
/* hack: use int because enums are not trivially parcellable */
@Override public int getConnectionState() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getConnectionState, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getConnectionStateString() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getConnectionStateString, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/* xmpp methods */
@Override public void setStatusFromConfig() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_setStatusFromConfig, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void disconnect() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_disconnect, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void connect() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_connect, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void addRosterItem(java.lang.String user, java.lang.String alias, java.lang.String group) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(user);
_data.writeString(alias);
_data.writeString(group);
mRemote.transact(Stub.TRANSACTION_addRosterItem, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void addRosterGroup(java.lang.String group) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(group);
mRemote.transact(Stub.TRANSACTION_addRosterGroup, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void renameRosterGroup(java.lang.String group, java.lang.String newGroup) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(group);
_data.writeString(newGroup);
mRemote.transact(Stub.TRANSACTION_renameRosterGroup, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void removeRosterItem(java.lang.String user) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(user);
mRemote.transact(Stub.TRANSACTION_removeRosterItem, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void requestAuthorizationForRosterItem(java.lang.String user) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(user);
mRemote.transact(Stub.TRANSACTION_requestAuthorizationForRosterItem, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void renameRosterItem(java.lang.String user, java.lang.String newName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(user);
_data.writeString(newName);
mRemote.transact(Stub.TRANSACTION_renameRosterItem, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void moveRosterItemToGroup(java.lang.String user, java.lang.String group) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(user);
_data.writeString(group);
mRemote.transact(Stub.TRANSACTION_moveRosterItemToGroup, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/* callback methods */
@Override public void registerRosterCallback(org.yaxim.androidclient.IXMPPRosterCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerRosterCallback, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregisterRosterCallback(org.yaxim.androidclient.IXMPPRosterCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterRosterCallback, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_getConnectionState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getConnectionStateString = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_setStatusFromConfig = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_disconnect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_connect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_addRosterItem = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_addRosterGroup = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_renameRosterGroup = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_removeRosterItem = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_requestAuthorizationForRosterItem = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_renameRosterItem = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_moveRosterItemToGroup = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_registerRosterCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_unregisterRosterCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
}
/* hack: use int because enums are not trivially parcellable */
public int getConnectionState() throws android.os.RemoteException;
public java.lang.String getConnectionStateString() throws android.os.RemoteException;
/* xmpp methods */
public void setStatusFromConfig() throws android.os.RemoteException;
public void disconnect() throws android.os.RemoteException;
public void connect() throws android.os.RemoteException;
public void addRosterItem(java.lang.String user, java.lang.String alias, java.lang.String group) throws android.os.RemoteException;
public void addRosterGroup(java.lang.String group) throws android.os.RemoteException;
public void renameRosterGroup(java.lang.String group, java.lang.String newGroup) throws android.os.RemoteException;
public void removeRosterItem(java.lang.String user) throws android.os.RemoteException;
public void requestAuthorizationForRosterItem(java.lang.String user) throws android.os.RemoteException;
public void renameRosterItem(java.lang.String user, java.lang.String newName) throws android.os.RemoteException;
public void moveRosterItemToGroup(java.lang.String user, java.lang.String group) throws android.os.RemoteException;
/* callback methods */
public void registerRosterCallback(org.yaxim.androidclient.IXMPPRosterCallback callback) throws android.os.RemoteException;
public void unregisterRosterCallback(org.yaxim.androidclient.IXMPPRosterCallback callback) throws android.os.RemoteException;
}
