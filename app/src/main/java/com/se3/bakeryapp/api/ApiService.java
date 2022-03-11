package com.se3.bakeryapp.api;

import com.se3.bakeryapp.models.pojos.EmployeeModel;
import com.se3.bakeryapp.models.pojos.JobModel;
import com.se3.bakeryapp.models.pojos.LoginModel;
import com.se3.bakeryapp.models.pojos.RoleModel;
import com.se3.bakeryapp.models.pojos.UserModel;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ApiService {

    //for Users data
    @GET("users/all")
    Call<ArrayList<UserModel>> getAllUsers();

    @GET("users/{id}")
    Call <UserModel> getSingleUser(@Path("id") long userid);

    @POST("users/login")
    Call <UserModel> getLoggedUser(@Body LoginModel loginModel);

    @POST("users")
    Call<UserModel> addUser(@Body UserModel userModel);

    @PUT("users/{id}")
    Call<UserModel> updateUser(@Path("id") long userid, @Body UserModel userModel);

    @DELETE("users/{id}")
    Call<UserModel> deleteUser(@Path("id") long userid);

    //for roles data
    @GET("roles/all")
    Call<ArrayList<RoleModel>> getAllRoles();

    @GET("roles/{id}")
    Call <RoleModel> getSingleRole(@Path("id") long roleid);

    @POST("roles")
    Call<RoleModel> addRole(@Body RoleModel roleModel);

    @PUT("roles/{id}")
    Call<RoleModel> updateRole(@Path("id") long roleid, @Body RoleModel roleModel);

    @DELETE("roles/{id}")
    Call<RoleModel> deleteRole(@Path("id") long roleid);

    //for jobs data
    @GET("jobs/all")
    Call<ArrayList<JobModel>> getAllJobs();

    @GET("jobs/{id}")
    Call <JobModel> getSingleJob(@Path("id") long jobid);

    @POST("jobs")
    Call<JobModel> addJob(@Body JobModel jobModel);

    @PUT("jobs/{id}")
    Call<JobModel> updateJob(@Path("id") long jobid, @Body JobModel jobModel);

    @DELETE("jobs/{id}")
    Call<JobModel> deleteJob(@Path("id") long jobid);

    //for employees data
    Call<ArrayList<EmployeeModel>> getAllEmployees();

    @GET("employees/{id}")
    Call <EmployeeModel> getSingleEmployee(@Path("id") long employeeid);

    @POST("employees")
    Call<EmployeeModel> addEmployee(@Body EmployeeModel employeeModel);

    @PUT("employees/{id}")
    Call<EmployeeModel> updateEmployee(@Path("id") long employeeid, @Body EmployeeModel employeeModel);

    @DELETE("employees/{id}")
    Call<EmployeeModel> deleteEmployee(@Path("id") long employeeid);
}
