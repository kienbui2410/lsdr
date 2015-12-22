// RUN :   php buildHTML.php <json file name>
<?php

$name_file = isset($argv[1]) ? $argv[1] : null;

// create file .js
// $path_json  is the path where to put the json file. In this example, I generate json files at D:\NEMO\runtime-EclipseXtext\Sample\src-gen.
$path_json = "D:\\NEMO\\runtime-EclipseXtext\\Sample\\src-gen\\";
$data = " ";

// read file
$file = fopen("lib\\topjs.txt",'r');
while(!feof($file))
{
    $data = $data . fgets($file);
}
//echo $data;
fclose($file);

$file = fopen($path_json .$name_file .'.json','r');
while(!feof($file))
{
    $data = $data . fgets($file);
}
//echo $data;
fclose($file);

$file = fopen("lib\\bottomjs.txt",'r');
while(!feof($file))
{
    $data = $data . fgets($file);
}
//echo $data;
fclose($file);

// write file
$file = fopen($name_file .'.js','w+');
 fwrite($file, $data);
fclose($file);


// create file .html

$data = " ";

// read file
$file = fopen("lib\\tophtml.txt",'r');
while(!feof($file))
{
    $data = $data . fgets($file);
}
//echo $data;
fclose($file);

$data = $data.$name_file;

// read file
$file = fopen("lib\\bottomhtml.txt",'r');
while(!feof($file))
{
    $data = $data . fgets($file);
}
//echo $data;
fclose($file);

// write file
$file = fopen($name_file .'.html','w+');
 fwrite($file, $data);
fclose($file);

?>