module com.example.project.test {
    requires com.example.project;
    requires junit;
    opens com.example.project.test to junit;
}
