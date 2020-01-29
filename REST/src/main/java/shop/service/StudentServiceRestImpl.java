package shop.service;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;
import shop.College;
import shop.entity.Student;
import shop.entity.StudentList;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Path("students")
public class StudentServiceRestImpl {

    @GET
    @Path("test")
    public Response getTest() {
        return Response.ok("Test successful").build();
    }

    @POST
    @Path("/image")
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    public Response uploadImage(
            @FormDataParam("file") InputStream uploadedInputStream,
            @FormDataParam("file") FormDataContentDisposition fileDetails) {

        System.out.println(fileDetails.getFileName());

        String uploadedFileLocation = "C:\\Program Files\\Apache Software Foundation\\Tomcat 8.5\\temp\\" + fileDetails.getFileName();

        // save it
        writeToFile(uploadedInputStream, uploadedFileLocation);

        String output = "File uploaded to : " + uploadedFileLocation;

        return Response.ok(output).build();
    }

    // save uploaded file to new location
    private void writeToFile(InputStream uploadedInputStream,
                             String uploadedFileLocation) {
        try {
            OutputStream out = new FileOutputStream(new File(
                    uploadedFileLocation));
            int read = 0;
            byte[] bytes = new byte[1024];

            out = new FileOutputStream(new File(uploadedFileLocation));
            while ((read = uploadedInputStream.read(bytes)) != -1) {
                out.write(bytes, 0, read);
            }
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @GET
    @Path("search")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_JSON)
    public StudentList searchStudentXML(@QueryParam("age") int age, @QueryParam("name") String name) {
        College college = new College();

        if (name != null && age != 0) {
            return college.searchByNameAndAge(name, age);
        } else if (name != null) {
            return college.searchByName(name);
        } else if (age != 0) {
            return college.searchByAge(age);
        }

        return null;
    }

    @GET
    @Path("list")
    @Produces({MediaType.APPLICATION_XML, MediaType.TEXT_PLAIN})
    public StudentList getStudentList() {
        College college = new College();
        return college.searchByAge(20);
    }

    @GET
    @Path("student/{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Student getStudentList(@PathParam("id") int id) {
        College college = new College();
        return college.gerStudentById(id);
    }

    @GET
    @Path("student/response_all/{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getStudentByIdFromResponseAllFormat(@PathParam("id") int id) {
        College college = new College();
        return Response.ok().entity(college.gerStudentById(id)).build();
    }

    @GET
    @Path("student/response_xml/{id}")
    @Produces({MediaType.APPLICATION_XML})
    public Response getStudentByIdFromResponseXML(@PathParam("id") int id) {
        College college = new College();
        return Response.ok().entity(college.gerStudentById(id)).build();
    }

    @GET
    @Path("student/response_json/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Response getStudentByIdFromResponseJSON(@PathParam("id") int id) {
        College college = new College();
        return Response.ok().entity(college.gerStudentById(id)).build();
    }

    @GET
    @Path("list1")
    @Produces({MediaType.APPLICATION_XML, MediaType.TEXT_PLAIN})
    public Response getStudentListTextPlain() {
        College college = new College();
        return Response.ok().entity(college.searchByAge(20)).build();
    }

    @Path("{age}")
    @Produces(MediaType.APPLICATION_XML)
    @GET
    public Student getStudentXML(@PathParam("age") int age) {
        return new Student(1, "Ivan XML", age);
    }

    @Path("{age}")
    @Produces(MediaType.APPLICATION_JSON)
    @GET
    public Response getStudentJSON(@PathParam("age") int age) {
        return Response.ok(new Student(1, "Peter JSON", age),
                MediaType.APPLICATION_JSON).build();
    }

    @Path("xml")
    @GET
    public Response getStudentXML_() {
        return Response.ok(new Student(1, "Tom @Path(\"xml\")", 55),
                MediaType.APPLICATION_XML).build();
    }

    @GET
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    public Student findStudent(@QueryParam("name") String name, @QueryParam("age") int age) {
        return new Student(10, name, age);
    }

    @GET
    @Path("{all}")
    public String findStudent(@PathParam("all") String all) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(11, "Student 1", 10));
        studentList.add(new Student(12, "Student 2", 20));
        studentList.add(new Student(13, "Student 3", 30));
        return studentList.toString();
    }
}
