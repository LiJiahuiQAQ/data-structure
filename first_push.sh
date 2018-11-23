#!/bin/sh
#辉哥无敌,bug退散!!!
echo "来了宝贝儿"
dirname $0
cd `dirname $0`
git init
git add .
git remote rm origin
git remote add origin $1

git config branch.master.remote origin
git config branch.master.merge refs/heads/master
git pull origin master --allow-unrelated-histories
git commit -m "commit"
git push -u origin master
