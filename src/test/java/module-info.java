/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/module-info.java to edit this template
 */

module com.example.project.test {
    requires com.example.project;
    requires junit;
    opens com.example.project.test to junit;
}
