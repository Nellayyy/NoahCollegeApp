package com.nelliott.noahcollegeapp;

public class Sibling extends FamilyMember{
    String mFirstName;
    String mLastName;
    String mObjectId;

    @Override
    public String getFirstName() {
        return mFirstName; }
    @Override
    public void setFirstName(String firstName) {
        mFirstName = firstName; }
    @Override
    public String getLastName() {
        return mLastName; }
    @Override
    public void setLastName(String lastName) {
        mLastName = lastName; }
    public Sibling(String firstName, String lastName){
        super(firstName, lastName); }
    public Sibling(){
        super(); }
    @Override
    public String toString(){
        return("Sibling: " + mFirstName + " " + mLastName); }
    public void setObjectId(String objectId) {
        mObjectId = objectId; }
    public String getObjectId() {
        return mObjectId; }
}