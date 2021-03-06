package com.ganjarramadhan.bookdoctor.module.dashboard.view;

import android.content.Context;

import com.ganjarramadhan.bookdoctor.pojo.Booking;
import com.ganjarramadhan.bookdoctor.pojo.User;

import java.util.List;

/**
 * Created by ganjarramadhan on 4/9/16.
 */
public interface DashboardInterface {

    void onListItemClick(User user);
    void onUsersDataAvailable(List<User> userList);
    void onUsersDataNotAvailable(String message);
    void onDoctorScheduleAvailable(List<Booking> bookingList);
    void onDoctorScheduleNotAvailable(String message);
    void goToLoginScreen();
    void onUserLogout();
    void goToHistory();
    void goToProfile();

}
