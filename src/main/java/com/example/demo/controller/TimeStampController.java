public class ValidationEntity{
    private String email;
    @Size(min=2,max=30,message="must be 2 to 3")
    private String password;

    private Integer rollnumber;

    import java.time.LocalDateTime;
    private LocalDataTime createAt;
    private LocalDateTime updateAt;
}