  <?php
$user_name = "etecia";
$password = "123456";
$host = "localhost";
$db_name = "dbFilme";
$con = mysqli_connect($host,$user_name,$password,$db_name);
$sql = "select * from titulos where nome like '%Jogos%';";
$result = mysqli_query($con,$sql);
if(mysqli_num_rows($result)>0){

	$row = mysqli_fetch_assoc($result);

	echo json_encode(array("Codigo"=>$row["codigo"],"Nome"=>$row["nome"],"Genero"=>$row["genero"],"Locado"=>$row["locado"]));
}
?>