create table developers_by_project as
select projects.name as project, developers.name as developer from developers
inner join developers_projects on developers_projects.developer_id = developers.id
inner join projects on developers_projects.project_id = projects.id
group by project, developer
order by project;