--20151025
建立git版本库
http://www.liaoxuefeng.com/wiki/0013739516305929606dd18361248578c67b8067c8c017b000/0013743256916071d599b3aed534aaab22a0db6c4e07fd0000

git add files 添加准备提交的文件{放到暂存区}
git commit -m "commit message" 提交
git status 同步
git diff 对比文件
git log 查看版本
git log --pretty=online
git reset 回退版本
git reflog 可以记录每次执行命令的版本号
git checkout -- files 相当于SVN 的 reverts
git rm 在版本库中删除文件	
--
gitHub生成密钥对
ssh-keygen -t rsa -C "gdut_cb@163.com"
git remote add origin git@github.com:michaelliao/learngit.git
git remote add origin git@github.com:yogaling/netplus.git