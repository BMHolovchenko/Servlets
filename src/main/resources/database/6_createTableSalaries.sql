create table salaries as
select projects.name, sum(salary) as salaries from developers
inner join developers_projects on developers.id = developers_projects.developer_id
inner join projects on developers_projects.project_id = projects.id
group by projects.name;

select projects.date, projects.name, count(developers_projects.developer_id) from projects
inner join developers_projects on developers_projects.project_id = projects.id
group by projects.date, projects.name;