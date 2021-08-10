<template>
    <PageTitle title="메인페이지 제목1" v-bind:num="10" />
    <page-title title="메인페이지 제목2" :num="20"/>
</template>
<script>
import PageTitle from '../components/PageTitle.vue';
export default {
    components : { PageTitle },
}
</script>