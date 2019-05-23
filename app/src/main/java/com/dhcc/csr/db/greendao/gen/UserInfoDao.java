package com.dhcc.csr.db.greendao.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.dhcc.csr.bean.UserInfo;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "USER_INFO".
*/
public class UserInfoDao extends AbstractDao<UserInfo, Void> {

    public static final String TABLENAME = "USER_INFO";

    /**
     * Properties of entity UserInfo.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", false, "ID");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property Loginname = new Property(2, String.class, "loginname", false, "LOGINNAME");
        public final static Property Password = new Property(3, String.class, "password", false, "PASSWORD");
        public final static Property Weight = new Property(4, String.class, "weight", false, "WEIGHT");
        public final static Property Email = new Property(5, String.class, "email", false, "EMAIL");
        public final static Property Mobile = new Property(6, String.class, "mobile", false, "MOBILE");
        public final static Property Phone = new Property(7, String.class, "phone", false, "PHONE");
        public final static Property Rtxid = new Property(8, String.class, "rtxid", false, "RTXID");
        public final static Property Gender = new Property(9, String.class, "gender", false, "GENDER");
        public final static Property Levelgroupid = new Property(10, String.class, "levelgroupid", false, "LEVELGROUPID");
        public final static Property Levelgroupname = new Property(11, String.class, "levelgroupname", false, "LEVELGROUPNAME");
        public final static Property Path = new Property(12, String.class, "path", false, "PATH");
        public final static Property PathName = new Property(13, String.class, "pathName", false, "PATH_NAME");
        public final static Property Parentid = new Property(14, String.class, "parentid", false, "PARENTID");
        public final static Property OrgId = new Property(15, String.class, "orgId", false, "ORG_ID");
        public final static Property OrgName = new Property(16, String.class, "orgName", false, "ORG_NAME");
        public final static Property RoleId = new Property(17, String.class, "roleId", false, "ROLE_ID");
        public final static Property RoleName = new Property(18, String.class, "roleName", false, "ROLE_NAME");
        public final static Property JobId = new Property(19, String.class, "jobId", false, "JOB_ID");
        public final static Property JobName = new Property(20, String.class, "jobName", false, "JOB_NAME");
        public final static Property GroupId = new Property(21, String.class, "groupId", false, "GROUP_ID");
        public final static Property GroupName = new Property(22, String.class, "groupName", false, "GROUP_NAME");
        public final static Property Relation = new Property(23, String.class, "relation", false, "RELATION");
        public final static Property IsLocal = new Property(24, String.class, "isLocal", false, "IS_LOCAL");
        public final static Property IsDelete = new Property(25, String.class, "isDelete", false, "IS_DELETE");
        public final static Property IsUdelete = new Property(26, String.class, "isUdelete", false, "IS_UDELETE");
        public final static Property IsULocal = new Property(27, String.class, "isULocal", false, "IS_ULOCAL");
        public final static Property Valid = new Property(28, String.class, "valid", false, "VALID");
        public final static Property PoliticalStatus = new Property(29, String.class, "politicalStatus", false, "POLITICAL_STATUS");
        public final static Property JobCity = new Property(30, String.class, "jobCity", false, "JOB_CITY");
        public final static Property Notionality = new Property(31, String.class, "notionality", false, "NOTIONALITY");
        public final static Property JobLayer = new Property(32, String.class, "jobLayer", false, "JOB_LAYER");
        public final static Property SkillLevel = new Property(33, String.class, "skillLevel", false, "SKILL_LEVEL");
        public final static Property JobType = new Property(34, String.class, "jobType", false, "JOB_TYPE");
        public final static Property DeptSort = new Property(35, Long.class, "deptSort", false, "DEPT_SORT");
        public final static Property UserSort = new Property(36, Long.class, "userSort", false, "USER_SORT");
        public final static Property DeptLevel = new Property(37, String.class, "deptLevel", false, "DEPT_LEVEL");
        public final static Property JobSituation = new Property(38, String.class, "jobSituation", false, "JOB_SITUATION");
    }

    private DaoSession daoSession;


    public UserInfoDao(DaoConfig config) {
        super(config);
    }
    
    public UserInfoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"USER_INFO\" (" + //
                "\"ID\" INTEGER," + // 0: id
                "\"NAME\" TEXT," + // 1: name
                "\"LOGINNAME\" TEXT," + // 2: loginname
                "\"PASSWORD\" TEXT," + // 3: password
                "\"WEIGHT\" TEXT," + // 4: weight
                "\"EMAIL\" TEXT," + // 5: email
                "\"MOBILE\" TEXT," + // 6: mobile
                "\"PHONE\" TEXT," + // 7: phone
                "\"RTXID\" TEXT," + // 8: rtxid
                "\"GENDER\" TEXT," + // 9: gender
                "\"LEVELGROUPID\" TEXT," + // 10: levelgroupid
                "\"LEVELGROUPNAME\" TEXT," + // 11: levelgroupname
                "\"PATH\" TEXT," + // 12: path
                "\"PATH_NAME\" TEXT," + // 13: pathName
                "\"PARENTID\" TEXT," + // 14: parentid
                "\"ORG_ID\" TEXT," + // 15: orgId
                "\"ORG_NAME\" TEXT," + // 16: orgName
                "\"ROLE_ID\" TEXT," + // 17: roleId
                "\"ROLE_NAME\" TEXT," + // 18: roleName
                "\"JOB_ID\" TEXT," + // 19: jobId
                "\"JOB_NAME\" TEXT," + // 20: jobName
                "\"GROUP_ID\" TEXT," + // 21: groupId
                "\"GROUP_NAME\" TEXT," + // 22: groupName
                "\"RELATION\" TEXT," + // 23: relation
                "\"IS_LOCAL\" TEXT," + // 24: isLocal
                "\"IS_DELETE\" TEXT," + // 25: isDelete
                "\"IS_UDELETE\" TEXT," + // 26: isUdelete
                "\"IS_ULOCAL\" TEXT," + // 27: isULocal
                "\"VALID\" TEXT," + // 28: valid
                "\"POLITICAL_STATUS\" TEXT," + // 29: politicalStatus
                "\"JOB_CITY\" TEXT," + // 30: jobCity
                "\"NOTIONALITY\" TEXT," + // 31: notionality
                "\"JOB_LAYER\" TEXT," + // 32: jobLayer
                "\"SKILL_LEVEL\" TEXT," + // 33: skillLevel
                "\"JOB_TYPE\" TEXT," + // 34: jobType
                "\"DEPT_SORT\" INTEGER," + // 35: deptSort
                "\"USER_SORT\" INTEGER," + // 36: userSort
                "\"DEPT_LEVEL\" TEXT," + // 37: deptLevel
                "\"JOB_SITUATION\" TEXT);"); // 38: jobSituation
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"USER_INFO\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, UserInfo entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
 
        String loginname = entity.getLoginname();
        if (loginname != null) {
            stmt.bindString(3, loginname);
        }
 
        String password = entity.getPassword();
        if (password != null) {
            stmt.bindString(4, password);
        }
 
        String weight = entity.getWeight();
        if (weight != null) {
            stmt.bindString(5, weight);
        }
 
        String email = entity.getEmail();
        if (email != null) {
            stmt.bindString(6, email);
        }
 
        String mobile = entity.getMobile();
        if (mobile != null) {
            stmt.bindString(7, mobile);
        }
 
        String phone = entity.getPhone();
        if (phone != null) {
            stmt.bindString(8, phone);
        }
 
        String rtxid = entity.getRtxid();
        if (rtxid != null) {
            stmt.bindString(9, rtxid);
        }
 
        String gender = entity.getGender();
        if (gender != null) {
            stmt.bindString(10, gender);
        }
 
        String levelgroupid = entity.getLevelgroupid();
        if (levelgroupid != null) {
            stmt.bindString(11, levelgroupid);
        }
 
        String levelgroupname = entity.getLevelgroupname();
        if (levelgroupname != null) {
            stmt.bindString(12, levelgroupname);
        }
 
        String path = entity.getPath();
        if (path != null) {
            stmt.bindString(13, path);
        }
 
        String pathName = entity.getPathName();
        if (pathName != null) {
            stmt.bindString(14, pathName);
        }
 
        String parentid = entity.getParentid();
        if (parentid != null) {
            stmt.bindString(15, parentid);
        }
 
        String orgId = entity.getOrgId();
        if (orgId != null) {
            stmt.bindString(16, orgId);
        }
 
        String orgName = entity.getOrgName();
        if (orgName != null) {
            stmt.bindString(17, orgName);
        }
 
        String roleId = entity.getRoleId();
        if (roleId != null) {
            stmt.bindString(18, roleId);
        }
 
        String roleName = entity.getRoleName();
        if (roleName != null) {
            stmt.bindString(19, roleName);
        }
 
        String jobId = entity.getJobId();
        if (jobId != null) {
            stmt.bindString(20, jobId);
        }
 
        String jobName = entity.getJobName();
        if (jobName != null) {
            stmt.bindString(21, jobName);
        }
 
        String groupId = entity.getGroupId();
        if (groupId != null) {
            stmt.bindString(22, groupId);
        }
 
        String groupName = entity.getGroupName();
        if (groupName != null) {
            stmt.bindString(23, groupName);
        }
 
        String relation = entity.getRelation();
        if (relation != null) {
            stmt.bindString(24, relation);
        }
 
        String isLocal = entity.getIsLocal();
        if (isLocal != null) {
            stmt.bindString(25, isLocal);
        }
 
        String isDelete = entity.getIsDelete();
        if (isDelete != null) {
            stmt.bindString(26, isDelete);
        }
 
        String isUdelete = entity.getIsUdelete();
        if (isUdelete != null) {
            stmt.bindString(27, isUdelete);
        }
 
        String isULocal = entity.getIsULocal();
        if (isULocal != null) {
            stmt.bindString(28, isULocal);
        }
 
        String valid = entity.getValid();
        if (valid != null) {
            stmt.bindString(29, valid);
        }
 
        String politicalStatus = entity.getPoliticalStatus();
        if (politicalStatus != null) {
            stmt.bindString(30, politicalStatus);
        }
 
        String jobCity = entity.getJobCity();
        if (jobCity != null) {
            stmt.bindString(31, jobCity);
        }
 
        String notionality = entity.getNotionality();
        if (notionality != null) {
            stmt.bindString(32, notionality);
        }
 
        String jobLayer = entity.getJobLayer();
        if (jobLayer != null) {
            stmt.bindString(33, jobLayer);
        }
 
        String skillLevel = entity.getSkillLevel();
        if (skillLevel != null) {
            stmt.bindString(34, skillLevel);
        }
 
        String jobType = entity.getJobType();
        if (jobType != null) {
            stmt.bindString(35, jobType);
        }
 
        Long deptSort = entity.getDeptSort();
        if (deptSort != null) {
            stmt.bindLong(36, deptSort);
        }
 
        Long userSort = entity.getUserSort();
        if (userSort != null) {
            stmt.bindLong(37, userSort);
        }
 
        String deptLevel = entity.getDeptLevel();
        if (deptLevel != null) {
            stmt.bindString(38, deptLevel);
        }
 
        String jobSituation = entity.getJobSituation();
        if (jobSituation != null) {
            stmt.bindString(39, jobSituation);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, UserInfo entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
 
        String loginname = entity.getLoginname();
        if (loginname != null) {
            stmt.bindString(3, loginname);
        }
 
        String password = entity.getPassword();
        if (password != null) {
            stmt.bindString(4, password);
        }
 
        String weight = entity.getWeight();
        if (weight != null) {
            stmt.bindString(5, weight);
        }
 
        String email = entity.getEmail();
        if (email != null) {
            stmt.bindString(6, email);
        }
 
        String mobile = entity.getMobile();
        if (mobile != null) {
            stmt.bindString(7, mobile);
        }
 
        String phone = entity.getPhone();
        if (phone != null) {
            stmt.bindString(8, phone);
        }
 
        String rtxid = entity.getRtxid();
        if (rtxid != null) {
            stmt.bindString(9, rtxid);
        }
 
        String gender = entity.getGender();
        if (gender != null) {
            stmt.bindString(10, gender);
        }
 
        String levelgroupid = entity.getLevelgroupid();
        if (levelgroupid != null) {
            stmt.bindString(11, levelgroupid);
        }
 
        String levelgroupname = entity.getLevelgroupname();
        if (levelgroupname != null) {
            stmt.bindString(12, levelgroupname);
        }
 
        String path = entity.getPath();
        if (path != null) {
            stmt.bindString(13, path);
        }
 
        String pathName = entity.getPathName();
        if (pathName != null) {
            stmt.bindString(14, pathName);
        }
 
        String parentid = entity.getParentid();
        if (parentid != null) {
            stmt.bindString(15, parentid);
        }
 
        String orgId = entity.getOrgId();
        if (orgId != null) {
            stmt.bindString(16, orgId);
        }
 
        String orgName = entity.getOrgName();
        if (orgName != null) {
            stmt.bindString(17, orgName);
        }
 
        String roleId = entity.getRoleId();
        if (roleId != null) {
            stmt.bindString(18, roleId);
        }
 
        String roleName = entity.getRoleName();
        if (roleName != null) {
            stmt.bindString(19, roleName);
        }
 
        String jobId = entity.getJobId();
        if (jobId != null) {
            stmt.bindString(20, jobId);
        }
 
        String jobName = entity.getJobName();
        if (jobName != null) {
            stmt.bindString(21, jobName);
        }
 
        String groupId = entity.getGroupId();
        if (groupId != null) {
            stmt.bindString(22, groupId);
        }
 
        String groupName = entity.getGroupName();
        if (groupName != null) {
            stmt.bindString(23, groupName);
        }
 
        String relation = entity.getRelation();
        if (relation != null) {
            stmt.bindString(24, relation);
        }
 
        String isLocal = entity.getIsLocal();
        if (isLocal != null) {
            stmt.bindString(25, isLocal);
        }
 
        String isDelete = entity.getIsDelete();
        if (isDelete != null) {
            stmt.bindString(26, isDelete);
        }
 
        String isUdelete = entity.getIsUdelete();
        if (isUdelete != null) {
            stmt.bindString(27, isUdelete);
        }
 
        String isULocal = entity.getIsULocal();
        if (isULocal != null) {
            stmt.bindString(28, isULocal);
        }
 
        String valid = entity.getValid();
        if (valid != null) {
            stmt.bindString(29, valid);
        }
 
        String politicalStatus = entity.getPoliticalStatus();
        if (politicalStatus != null) {
            stmt.bindString(30, politicalStatus);
        }
 
        String jobCity = entity.getJobCity();
        if (jobCity != null) {
            stmt.bindString(31, jobCity);
        }
 
        String notionality = entity.getNotionality();
        if (notionality != null) {
            stmt.bindString(32, notionality);
        }
 
        String jobLayer = entity.getJobLayer();
        if (jobLayer != null) {
            stmt.bindString(33, jobLayer);
        }
 
        String skillLevel = entity.getSkillLevel();
        if (skillLevel != null) {
            stmt.bindString(34, skillLevel);
        }
 
        String jobType = entity.getJobType();
        if (jobType != null) {
            stmt.bindString(35, jobType);
        }
 
        Long deptSort = entity.getDeptSort();
        if (deptSort != null) {
            stmt.bindLong(36, deptSort);
        }
 
        Long userSort = entity.getUserSort();
        if (userSort != null) {
            stmt.bindLong(37, userSort);
        }
 
        String deptLevel = entity.getDeptLevel();
        if (deptLevel != null) {
            stmt.bindString(38, deptLevel);
        }
 
        String jobSituation = entity.getJobSituation();
        if (jobSituation != null) {
            stmt.bindString(39, jobSituation);
        }
    }

    @Override
    protected final void attachEntity(UserInfo entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    @Override
    public UserInfo readEntity(Cursor cursor, int offset) {
        UserInfo entity = new UserInfo( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // name
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // loginname
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // password
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // weight
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // email
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // mobile
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // phone
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // rtxid
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // gender
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // levelgroupid
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // levelgroupname
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // path
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // pathName
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // parentid
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // orgId
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // orgName
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17), // roleId
            cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18), // roleName
            cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19), // jobId
            cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20), // jobName
            cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21), // groupId
            cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22), // groupName
            cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23), // relation
            cursor.isNull(offset + 24) ? null : cursor.getString(offset + 24), // isLocal
            cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25), // isDelete
            cursor.isNull(offset + 26) ? null : cursor.getString(offset + 26), // isUdelete
            cursor.isNull(offset + 27) ? null : cursor.getString(offset + 27), // isULocal
            cursor.isNull(offset + 28) ? null : cursor.getString(offset + 28), // valid
            cursor.isNull(offset + 29) ? null : cursor.getString(offset + 29), // politicalStatus
            cursor.isNull(offset + 30) ? null : cursor.getString(offset + 30), // jobCity
            cursor.isNull(offset + 31) ? null : cursor.getString(offset + 31), // notionality
            cursor.isNull(offset + 32) ? null : cursor.getString(offset + 32), // jobLayer
            cursor.isNull(offset + 33) ? null : cursor.getString(offset + 33), // skillLevel
            cursor.isNull(offset + 34) ? null : cursor.getString(offset + 34), // jobType
            cursor.isNull(offset + 35) ? null : cursor.getLong(offset + 35), // deptSort
            cursor.isNull(offset + 36) ? null : cursor.getLong(offset + 36), // userSort
            cursor.isNull(offset + 37) ? null : cursor.getString(offset + 37), // deptLevel
            cursor.isNull(offset + 38) ? null : cursor.getString(offset + 38) // jobSituation
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, UserInfo entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setLoginname(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setPassword(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setWeight(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setEmail(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setMobile(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setPhone(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setRtxid(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setGender(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setLevelgroupid(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setLevelgroupname(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setPath(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setPathName(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setParentid(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setOrgId(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setOrgName(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setRoleId(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
        entity.setRoleName(cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18));
        entity.setJobId(cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19));
        entity.setJobName(cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20));
        entity.setGroupId(cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21));
        entity.setGroupName(cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22));
        entity.setRelation(cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23));
        entity.setIsLocal(cursor.isNull(offset + 24) ? null : cursor.getString(offset + 24));
        entity.setIsDelete(cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25));
        entity.setIsUdelete(cursor.isNull(offset + 26) ? null : cursor.getString(offset + 26));
        entity.setIsULocal(cursor.isNull(offset + 27) ? null : cursor.getString(offset + 27));
        entity.setValid(cursor.isNull(offset + 28) ? null : cursor.getString(offset + 28));
        entity.setPoliticalStatus(cursor.isNull(offset + 29) ? null : cursor.getString(offset + 29));
        entity.setJobCity(cursor.isNull(offset + 30) ? null : cursor.getString(offset + 30));
        entity.setNotionality(cursor.isNull(offset + 31) ? null : cursor.getString(offset + 31));
        entity.setJobLayer(cursor.isNull(offset + 32) ? null : cursor.getString(offset + 32));
        entity.setSkillLevel(cursor.isNull(offset + 33) ? null : cursor.getString(offset + 33));
        entity.setJobType(cursor.isNull(offset + 34) ? null : cursor.getString(offset + 34));
        entity.setDeptSort(cursor.isNull(offset + 35) ? null : cursor.getLong(offset + 35));
        entity.setUserSort(cursor.isNull(offset + 36) ? null : cursor.getLong(offset + 36));
        entity.setDeptLevel(cursor.isNull(offset + 37) ? null : cursor.getString(offset + 37));
        entity.setJobSituation(cursor.isNull(offset + 38) ? null : cursor.getString(offset + 38));
     }
    
    @Override
    protected final Void updateKeyAfterInsert(UserInfo entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    @Override
    public Void getKey(UserInfo entity) {
        return null;
    }

    @Override
    public boolean hasKey(UserInfo entity) {
        // TODO
        return false;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}