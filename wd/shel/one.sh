#!/bin/sh
read num

while [ $num -lt 10 ]
do
  echo "$num"
  num=`expr $num + 1`
done

until [ $num -gt 10 ]
do
  echo "$num"
  num=`expr $num + 1`
done

for a in 1 2 3 4 5 6 7 8 9 10
do
  if [ $a -eq 3 ]
  then 
    continue
  elif [ $a -eq 6 ]
  then
    echo "Found $a"
  elif [ $a -eq 4 ]
  then
    echo "Four found"
  else
    echo "$a"
  fi
done
